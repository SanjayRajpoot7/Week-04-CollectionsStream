package reflection.advanceLevel;

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class ServiceA {
    public void execute() {
        System.out.println("ServiceA executed");
    }
}

class ServiceB {
    @Inject
    private ServiceA serviceA;

    public void run() {
        serviceA.execute();
    }
}

class DIContainer {
    private Map<Class<?>, Object> services = new HashMap<>();

    public void register(Class<?> clazz) throws Exception {
        services.put(clazz, clazz.getDeclaredConstructor().newInstance());
    }

    public void injectDependencies() throws IllegalAccessException {
        for (Object service : services.values()) {
            Field[] fields = service.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    field.set(service, services.get(field.getType()));
                }
            }
        }
    }

    public <T> T getService(Class<T> clazz) {
        return (T) services.get(clazz);
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        DIContainer container = new DIContainer();
        container.register(ServiceA.class);
        container.register(ServiceB.class);
        container.injectDependencies();

        ServiceB serviceB = container.getService(ServiceB.class);
        serviceB.run();
    }
}
