package spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

class UserDAOImpl implements UserDAO {
	private DataSource dataSource;
	private JdbcTemplate jt;

	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jt = new JdbcTemplate(dataSource);
	}

	public void create(User user) {
		String SQL = "insert into public.user (login, name) values (?, ?)";

		jt.update(SQL, user.getLogin(), user.getName());
		System.out.println("Created Record login = " + user.getLogin()
				+ " name = " + user.getName());
		return;
	}

	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listUsers() {
		String SQL = "select * from public.user";
		List<User> users = jt.query(SQL, new UserMapper());
		return users;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public void update(User user) {
		// TODO Auto-generated method stub

	}
}