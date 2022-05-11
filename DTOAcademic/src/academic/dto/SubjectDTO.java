package academic.dto;

public class SubjectDTO {

	private int id;
	private String name;
	
	public SubjectDTO() {
		setId(0);
		setName("");
	}
	
	public static SubjectDTO create() {
		return new SubjectDTO();
	}
	
	public int getId() {
		return id;
	}
	public SubjectDTO setId(int id) {
		this.id = id;
		return this;

	}
	public String getName() {
		return name;
	}
	public SubjectDTO setName(String name) {
		this.name = name;
		return this;
	}
	
}
