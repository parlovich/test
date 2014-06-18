package spring.jdbc;

public class User {
	private int id;
	private String name;
	private String login;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	@Override
	public String toString() {
		return "User: ID = " + id + ", LOGIN = " + login + ", NAME = " + name;
	}

}
