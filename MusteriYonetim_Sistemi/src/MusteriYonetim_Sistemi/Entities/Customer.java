package MusteriYonetim_Sistemi.Entities;

import MusteriYonetim_Sistemi.Abstract.Entity;

public class Customer implements Entity{
	private int Id;
	private String firstName;
	private String lastName;
	private int birthday;
	private String Tc;
	
	public Customer(int id, String firstName, String lastName, int birthday, String tc) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		Tc = tc;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getTc() {
		return Tc;
	}

	public void setTc(String tc) {
		Tc = tc;
	}
	

}
