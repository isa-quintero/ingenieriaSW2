package academic.domain;


public class CourseDomain {

	private int id;
	private SubjectDomain subject;
	private ProfessorDomain professor;
	
	public CourseDomain(int id, SubjectDomain subject, ProfessorDomain professor) {
		super();
		setId(id);
		setSubject(subject);
		setProfessor(professor);
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;	}

	public SubjectDomain getSubject() {
		return subject;
	}

	public void setSubject(SubjectDomain subject) {
		this.subject = (subject == null) ? new SubjectDomain(0, "") : subject;

	}

	public ProfessorDomain getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorDomain professor) {
		this.professor = (professor==null) ? new ProfessorDomain(0, new IdTypeDomain(0, ""), "") : professor;
	}
	
}


