package academic.domain;

public class StudentCourseStateDomain {
	
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name==null) ? "" : name.trim();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = (id< 0) ? 0 : id;
	}
}
