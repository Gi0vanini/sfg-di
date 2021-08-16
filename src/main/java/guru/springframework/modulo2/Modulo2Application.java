package guru.springframework.modulo2;

import guru.springframework.modulo2.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Modulo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Modulo2Application.class, args);

		MyController myController = (MyController)  ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
