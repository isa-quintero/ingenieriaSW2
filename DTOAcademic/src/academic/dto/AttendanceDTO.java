package academic.dto;

public class AttendanceDTO {
	private int id;
	private SessionDTO sesion;
	private StudentCourseDTO studentCourse;
	private boolean attended;
	
	public AttendanceDTO() {
		setId(0);
		setSesion(SessionDTO.create());
		setStudentCourse(StudentCourseDTO.create());
		setAttended(false);
	}
	
	public static IdTypeDTO create() {
		return new IdTypeDTO();
	}
	
	public int getId() {
		return id;
	}
	public AttendanceDTO setId(int id) {
		this.id = id;
		return this;
	}
	public SessionDTO getSesion() {
		return sesion;
	}
	public AttendanceDTO setSesion(SessionDTO sesion) {
		this.sesion = sesion;
		return this;
	}
	public StudentCourseDTO getStudentCourse() {
		return studentCourse;
	}
	public AttendanceDTO setStudentCourse(StudentCourseDTO studentCourse) {
		this.studentCourse = studentCourse;
		return this;
	}
	public boolean isAttended() {
		return attended;
	}
	public AttendanceDTO setAttended(boolean attended) {
		this.attended = attended;
		return this;
	}
	
}
