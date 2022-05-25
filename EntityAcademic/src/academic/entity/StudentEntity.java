package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class StudentEntity {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name= "id")
	private int id;
	@Column (name="idNumber")
	private String idNumber;
	@ManyToOne
	@Column (name="idType")
	private IdTypeEntity idType;
	@Column (name="name")
	private String name;
	@Column (name="email")
	private String email;
	
	public StudentEntity() {
		setId(0);
		setIdType(IdTypeEntity.create());
		setName("");
	}
	
	public static StudentEntity create() {
		return new StudentEntity();
	}
	
	public int getId() {
		return id;
	}
	public StudentEntity setId(int id) {
		this.id = id;
		return this;

	}
	public IdTypeEntity getIdType() {
		return idType;
	}
	public StudentEntity setIdType(IdTypeEntity idType) {
		this.idType = idType;
		return this;

	}
	public String getName() {
		return name;
	}
	public StudentEntity setName(String name) {
		this.name = name;
		return this;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
