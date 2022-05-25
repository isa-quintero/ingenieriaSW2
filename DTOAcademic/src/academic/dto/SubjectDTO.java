package academic.dto;

public class SubjectDTO {

	private int id;
	private String name;
	
	public SubjectDTO(int id, String name) {
		super();
		setId(0);
		setName("");
	}
	
	public SubjectDTO() {
		setName("");
	}
	
	public static SubjectDTO create() {
		return new SubjectDTO();
	}
	
	public static SubjectDTO create(int id, String name) {
		return new SubjectDTO(id, name);
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
