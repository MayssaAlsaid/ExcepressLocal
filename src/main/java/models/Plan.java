package models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(schema = "todolist")
public class Plan {

@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	private String description ;
	private LocalDate duedate ;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDuedate() {
		return duedate;
	}
	public void setDuedate(LocalDate duedate) {
		this.duedate = duedate;
	}
	
	
	
	
	
	
	
	
}
