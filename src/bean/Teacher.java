package bean;

import java.io.Serializable;

public class Teacher implements Serializable {

	private String id;
	private String password;
	private String name;
	private String school;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String setPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}


}