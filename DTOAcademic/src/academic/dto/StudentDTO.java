package academic.dto;

public class StudentDTO {

	private int id;
	private String idNumber;
	private IdTypeDTO idType;
	private String name;
	private String email;

	
	public StudentDTO() {
		setId(0);
		setIdType(IdTypeDTO.create());
		setName("");
	}
	
	public static StudentDTO create() {
		return new StudentDTO();
	}
	
	public int getId() {
		return id;
	}
	public StudentDTO setId(int id) {
		this.id = id;
		return this;

	}
	public IdTypeDTO getIdType() {
		return idType;
	}
	public StudentDTO setIdType(IdTypeDTO idType) {
		this.idType = idType;
		return this;

	}
	public String getName() {
		return name;
	}
	public StudentDTO setName(String name) {
		this.name = name;
		return this;
	}

	public String getIdNumber() {
		return idNumber;
		
	}

	public StudentDTO setIdNumber(String idNumber) {
		this.idNumber = idNumber;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public StudentDTO setEmail(String email) {
		this.email = email;
		return this;
	}
	
	
}
