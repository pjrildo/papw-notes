package dev.pjrildo.json.entities;

public class Professor {
	
	private Integer id;
	private String name;
	private String login;
	private String email;
	
	public Professor() {
		
	}
	
	
	
	public Professor(Integer id, String name, String login, String email) {
		this.id = id;
		this.name = name;
		this.login = login;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", login=" + login + ", email=" + email + "]";
	}
	
}
