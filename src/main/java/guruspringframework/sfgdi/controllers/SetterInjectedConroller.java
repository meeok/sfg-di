package guruspringframework.sfgdi.controllers;

import guruspringframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author MEEO
 * @created 27/12/2022 - 8:31 AM
 * @PROJECT sfg-di
 */

@Controller
public class SetterInjectedConroller {
    private GreetingService greetingService;

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }


}
