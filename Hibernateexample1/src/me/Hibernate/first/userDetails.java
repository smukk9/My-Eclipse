package me.Hibernate.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="User_Details")//this means is the pojo is persisted object that is to be saved
public class userDetails {

	@Id  // this is the primary key.
	private int studentID;
	@Column( name="User_ID")
	private String studentName;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
}
