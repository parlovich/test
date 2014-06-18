package spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

public interface UserDAO {

	public void setDataSource(DataSource ds);

	public void create(User user);

	public User getUser(int id);
	public User getUser(String login);

	public List<User> listUsers();

	public void delete(int id);

	public void update(User user);
}