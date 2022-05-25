package academic.entity;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class SessionEntity {
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	@Column (name= "id")
	private int id;
	@OneToMany
	@Column (name= "course")
	private CourseEntity course;
	@Column (name= "date")
	private Date date;
	
	public SessionEntity() {
		setId(0);
		setCourse(CourseEntity.create());
		setDate(Calendar.getInstance().getTime());
	}
	
	public static SessionEntity create() {
		return new SessionEntity();
	}
	
	public int getId() {
		return id;
	}
	public SessionEntity setId(int id) {
		this.id = id;
		return this;

	}
	public CourseEntity getCourse() {
		return course;
	}
	public SessionEntity setCourse(CourseEntity course) {
		this.course = course;
		return this;

	}
	public Date getDate() {
		return date;
	}
	public SessionEntity setDate(Date date) {
		this.date = date;
		return this;
	}
}
