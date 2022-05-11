package academic.domain;

import academic.dto.IdTypeDTO;
import academic.dto.ProfessorDTO;

public class ProfessorDomain {

	private int id;
	private IdTypeDomain idType;
	private String name;
	public ProfessorDTO() {
		setId(0);
		setIdType(IdTypeDTO.create());
		setName("");
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
		this.idType = (idType == null) ? new ;
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
