package academic.dto;

public class ProfessorDTO {

	private int id;
	private IdTypeDTO idType;
	private String name;
	private String email;
	
	public ProfessorDTO(int id, String name) {
		super();
		setId(0);
		setName("");
	}
	
	public ProfessorDTO() {
		setName("");
	}
	
	public static ProfessorDTO create() {
		return new ProfessorDTO();
	}
	
	public static ProfessorDTO create(int id, String name) {
		return new ProfessorDTO(id, name);
	}
	
	
	public int getId() {
		return id;
	}
	public ProfessorDTO setId(int i) {
		this.id = i;
		return this;

	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public ProfessorDTO setIdType(IdTypeDTO idType) {
		this.idType = idType;
		return this;

	}
	public String getName() {
		return name;
	}
	public ProfessorDTO setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public ProfessorDTO setEmail(String email) {
		this.email = email;
		return this;
	}

	
}