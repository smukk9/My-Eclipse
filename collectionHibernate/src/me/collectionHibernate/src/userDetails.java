package me.collectionHibernate.src;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Details")
public class userDetails {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int user_Id;
	private String user_Name;
	
	@ElementCollection
	private Set<Address> list_Address = new HashSet<Address>();
	public Set<Address> getList_Address() {
		return list_Address;
	}
	public void setList_Address(Set<Address> list_Address) {
		this.list_Address = list_Address;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
}
