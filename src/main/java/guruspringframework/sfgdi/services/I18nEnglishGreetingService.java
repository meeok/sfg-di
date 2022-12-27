package guruspringframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author MEEO
 * @created 27/12/2022 - 4:54 PM
 * @PROJECT sfg-di
 */

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        System.out.println("running English profile");
        return "Hello Meeo - EN";
    }
}
