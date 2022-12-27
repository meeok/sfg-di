package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;

/**
 * @author MEEO
 * @created 27/12/2022 - 4:53 PM
 * @PROJECT sfg-di
 */
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
