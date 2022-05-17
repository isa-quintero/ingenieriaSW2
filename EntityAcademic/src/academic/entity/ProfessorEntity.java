package academic.entity;


public class ProfessorEntity {

	private int id;
	private IdTypeEntity idType;
	private String name;
	
	public ProfessorEntity() {
		setId(0);
		setIdType(IdTypeEntity.create());
		setName("");
	}
	
	public static ProfessorEntity create() {
		return new ProfessorEntity();
	}
	
	public int getId() {
		return id;
	}
	public ProfessorEntity setId(int i) {
		this.id = i;
		return this;

	}
	public IdTypeEntity getIdType() {
		return idType;
	}
	public ProfessorEntity setIdType(IdTypeEntity idType) {
		this.idType = idType;
		return this;

	}
	public String getName() {
		return name;
	}
	public ProfessorEntity setName(String name) {
		this.name = name;
		return this;
	}
}
