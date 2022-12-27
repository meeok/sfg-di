package guruspringframework.sfgdi.services;

/**
 * @author MEEO
 * @created 27/12/2022 - 4:54 PM
 * @PROJECT sfg-di
 */
public class I18nEnglishGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Meeo";
    }
}
