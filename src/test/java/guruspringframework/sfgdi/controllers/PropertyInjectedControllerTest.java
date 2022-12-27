package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author MEEO
 * @created 27/12/2022 - 8:24 AM
 * @PROJECT sfg-di
 */
class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller=new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting(){
        System.out.println(controller.getGreeting());
    }


}