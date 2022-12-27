package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author MEEO
 * @created 27/12/2022 - 9:25 AM
 * @PROJECT sfg-di
 */
class SetterInjectedConrollerTest {
    SetterInjectedConroller controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedConroller();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}