package guruspringframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * @author MEEO
 * @created 27/12/2022 - 4:55 PM
 * @PROJECT sfg-di
 */

@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Holla Meeo ---Espagnol";
    }
}
