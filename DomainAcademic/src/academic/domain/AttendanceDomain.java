package academic.domain;

import java.util.Date;

public class AttendanceDomain {

	private int id;
	private SessionDomain sesion;
	private StudentCourseDomain studentCourse;
	private boolean attended;

	public AttendanceDomain(int id, SessionDomain sesion, StudentCourseDomain studentCourse) {
		super();
		setId(id);
		setSesion(sesion);
		setStudentCourse(studentCourse);
		setAttended(attended);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;

	}

	public SessionDomain getSesion() {
		return sesion;
	}

	public void setSesion(SessionDomain sesion) {
		this.sesion = (sesion==null) ? new SessionDomain(0, new CourseDomain(0, new SubjectDomain(0,""), new ProfessorDomain(0, new IdTypeDomain(0,""),"")), new Date()) : sesion;

	}

	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(StudentCourseDomain studentCourse) {
		this.studentCourse = (studentCourse == null) ? new StudentCourseDomain(0, null, null) : studentCourse;
	}

	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = (attended == null) ? false : attended;
	}
	
}
