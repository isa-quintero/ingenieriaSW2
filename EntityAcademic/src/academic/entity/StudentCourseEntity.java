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
public class StudentCourseEntity {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name= "id")
	private int id;
	@Column (name= "student")
	@ManyToOne
	private StudentEntity student;
	@ManyToOne
	@Column (name= "course")
	private CourseEntity course;
	@Column (name= "state")
	private int state;
	
	
	public StudentCourseEntity() {
		setId(0);
		setStudent(StudentEntity.create());
		setCourse(CourseEntity.create());
	}
	
	public static StudentCourseEntity create() {
		return new StudentCourseEntity();
	}
	
	public int getId() {
		return id;
	}
	public StudentCourseEntity setId(int id) {
		this.id = id;
		return this;

	}
	public StudentEntity getStudent() {
		return student;
	}
	public StudentCourseEntity setStudent(StudentEntity student) {
		this.student = student;
		return this;

	}
	public CourseEntity getCourse() {
		return course;
	}
	public StudentCourseEntity setCourse(CourseEntity course) {
		this.course = course;
		return this;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
}
