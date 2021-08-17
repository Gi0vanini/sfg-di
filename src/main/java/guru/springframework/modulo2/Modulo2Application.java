package guru.springframework.modulo2;

import guru.springframework.modulo2.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.objenesis.instantiator.basic.ConstructorInstantiator;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class Modulo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Modulo2Application.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());

		MyController myController = (MyController)  ctx.getBean("myController");

		System.out.println("-------- Primary beans");

		System.out.println(myController.sayHello());

		System.out.println("-------- Property");

		PropetyInjectedController propetyInjectedController = (PropetyInjectedController) ctx.getBean("propetyInjectedController");

		System.out.println(propetyInjectedController.getGreeting());

		System.out.println("--------- Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor");

		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");

		System.out.println(contructorInjectedController.getGreeting());
	}

}
