package spring.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans.HelloBean;
import spring.jdbc.User;
import spring.jdbc.UserDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
    	context.registerShutdownHook();
 
		HelloBean obj = (HelloBean) context.getBean("helloBean");
		System.out.println(obj.getMessage());
		
		UserDAO dao = (UserDAO)context.getBean("userDAO");
		User user = new User();
		user.setLogin("test_login3");
		user.setName("test_UserName3");
		dao.create(user);
		
		System.out.println("All Users: ");
		for(User u : dao.listUsers()) {
			System.out.println(u);
		}
    }
}
