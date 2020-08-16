package by.epamtc.information.main;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToSkan, Map<Class, Class> ifc2ImplClass){
        JavaConfig config = new JavaConfig(packageToSkan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        //todo - init all singletones which are not lazy
        context.setFactory(objectFactory);
        return context;

    }
}
