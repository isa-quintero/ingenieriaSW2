package academic.domain;

import java.util.Date;


public class SessionDomain {

	private int id;
	private CourseDomain course;
	private Date date;
	
	public SessionDomain(int id, CourseDomain course, Date date) {
		super();
		setId(id);
		setCourse(course);
		setDate(date);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}
	public CourseDomain getCourse() {
		return course;
	}
	public void setCourse(CourseDomain course) {
		this.course = (course==null) ? new CourseDomain(0, new SubjectDomain(0, ""), new ProfessorDomain(0, new IdTypeDomain(0,""), "")) : course;

	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = (date==null) ? new Date() :date;
	}
}
