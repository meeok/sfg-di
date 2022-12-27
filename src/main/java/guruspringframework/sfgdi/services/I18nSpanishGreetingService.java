package guruspringframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author MEEO
 * @created 27/12/2022 - 4:55 PM
 * @PROJECT sfg-di
 */

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        System.out.println("running Spanish profile");
        return "Holla Meeo ---ES";
    }
}
