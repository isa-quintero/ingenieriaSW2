package academic.domain;

public class AttendanceDomain {

	private int id;
	private SessionDomain sesion;
	private StudentCourseDomain studentCourse;
	private boolean attended;
	
	public AttendanceDomain() {
		super();
		setId(0);
		setSesion(sesion);
		setStudentCourse(studentCourse);
		setAttended(attended);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public SessionDomain getSesion() {
		return sesion;
	}
	public void setSesion(SessionDomain sesion) {
		this.sesion = sesion;
		
	}
	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(StudentCourseDomain studentCourse) {
		this.studentCourse = studentCourse;
	}
}
