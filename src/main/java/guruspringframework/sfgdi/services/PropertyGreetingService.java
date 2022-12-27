package guruspringframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author MEEO
 * @created 27/12/2022 - 3:32 PM
 * @PROJECT sfg-di
 */

@Service
public class PropertyGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello meeo -- Property";
    }
}
