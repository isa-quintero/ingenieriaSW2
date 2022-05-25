package academic.domain;


public class StudentCourseDomain {

	private int id;
	private StudentDomain student;
	private CourseDomain course;
	private int state;
	
	public StudentCourseDomain() {
		super();
		setId(id);
		setStudent(student);
		setCourse(course);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;	
	}
	public StudentDomain getStudent() {
		return student;
	}
	public void setStudent(StudentDomain student) {
		this.student = (student==null) ? new StudentDomain():student;
	}
	public CourseDomain getCourse() {
		return course;
	}
	public void setCourse(CourseDomain course) {
		this.course = (course==null) ? new CourseDomain() : course;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = (state< 0) ? 0 : state;
	}
}
