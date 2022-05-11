package academic.dto;

public class ProfessorDTO {

	private int id;
	private IdTypeDTO idType;
	private String name;
	
	public ProfessorDTO() {
		setId(0);
		setIdType(IdTypeDTO.create());
		setName("");
	}
	
	public static ProfessorDTO create() {
		return new ProfessorDTO();
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

	
}