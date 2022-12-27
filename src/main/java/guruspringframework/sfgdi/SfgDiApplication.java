package guruspringframework.sfgdi;

import guruspringframework.sfgdi.controllers.ConstructorInjectedController;
import guruspringframework.sfgdi.controllers.MyController;
import guruspringframework.sfgdi.controllers.PropertyInjectedController;
import guruspringframework.sfgdi.controllers.SetterInjectedConroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		//String greeting = myController.sayHello();
		//System.out.println(greeting);
		System.out.println("--------Primary Bean");
		System.out.println(myController.sayHello());

		//common errors
		System.out.println("-------property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-------Setter");
		SetterInjectedConroller setterInjectedConroller = (SetterInjectedConroller) ctx.getBean("setterInjectedConroller");
		System.out.println(setterInjectedConroller.getGreeting());

		System.out.println("-------Contructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
