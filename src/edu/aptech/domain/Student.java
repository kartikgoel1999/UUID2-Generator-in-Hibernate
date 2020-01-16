package edu.aptech.domain;

public class Student {

	private String f_name,l_name,email;
	private String id;
	
	public Student()
	{
		System.out.println("DC");
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [f_name=" + f_name + ", l_name=" + l_name + ", email=" + email + ", id=" + id + "]";
	}
}
