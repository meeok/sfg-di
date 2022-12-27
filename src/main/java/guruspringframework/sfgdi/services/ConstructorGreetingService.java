package guruspringframework.sfgdi.services;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author MEEO
 * @created 27/12/2022 - 8:21 AM
 * @PROJECT sfg-di
 */

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello meeo -- Constructor";
    }
}
