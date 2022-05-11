package academic.domain;

import javax.security.auth.Subject;

import academic.dto.CourseDTO;
import academic.dto.ProfessorDTO;
import academic.dto.SubjectDTO;

public class CourseDomain {

	private int id;
	private Subject subject;
	private ProfessorDomain professor;
	
	public CourseDTO() {
		setId(0);
		setSubject(SubjectDTO.create());
		setProfessor(ProfessorDTO.create());
	}
	public int getId() {
		return id;
	}

	public CourseDTO setId(int id) {
		this.id = id;
		return this;

	}

	public SubjectDTO getSubject() {
		return subject;
	}

	public CourseDTO setSubject(SubjectDTO subject) {
		this.subject = subject;
		return this;

	}

	public ProfessorDTO getProfessor() {
		return professor;
	}

	public CourseDTO setProfessor(ProfessorDTO professor) {
		this.professor = professor;
		return this;
	}
	
}

}
