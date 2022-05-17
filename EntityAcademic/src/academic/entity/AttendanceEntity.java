package academic.entity;


public class AttendanceEntity {
	private int id;
	private SessionEntity sesion;
	private StudentCourseEntity studentCourse;
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
