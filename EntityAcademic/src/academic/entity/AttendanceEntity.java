package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class AttendanceEntity {
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name= "id")
	private int id;
	@ManyToOne
	@Column (name= "sesion")
	private SessionEntity sesion;
	@ManyToOne
	@Column (name= "studentCourse")
	private StudentCourseEntity studentCourse;
	@Column (name= "attended")
	private boolean attended;
	
	public AttendanceEntity() {
		setId(0);
		setSesion(SessionEntity.create());
		setStudentCourse(StudentCourseEntity.create());
		setAttended(false);
	}
	
	public static IdTypeEntity create() {
		return new IdTypeEntity();
	}
	
	public int getId() {
		return id;
	}
	public AttendanceEntity setId(int id) {
		this.id = id;
		return this;
	}
	public SessionEntity getSesion() {
		return sesion;
	}
	public AttendanceEntity setSesion(SessionEntity sesion) {
		this.sesion = sesion;
		return this;
	}
	public StudentCourseEntity getStudentCourse() {
		return studentCourse;
	}
	public AttendanceEntity setStudentCourse(StudentCourseEntity studentCourse) {
		this.studentCourse = studentCourse;
		return this;
	}
	public boolean isAttended() {
		return attended;
	}
	public AttendanceEntity setAttended(boolean attended) {
		this.attended = attended;
		return this;
	}
}
