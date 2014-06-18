package spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean {

	private String message;
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("INIT: helloBean");
	}
	
	public void destroy() throws Exception {
		System.out.println("DESTROY: helloBean");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
