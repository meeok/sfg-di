package guruspringframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author MEEO
 * @created 27/12/2022 - 4:14 PM
 * @PROJECT sfg-di
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello - from Primary bean";
    }
}
