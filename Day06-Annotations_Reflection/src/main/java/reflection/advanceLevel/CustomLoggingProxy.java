package reflection.advanceLevel;

import java.lang.reflect.*;

interface Greeting {
    void Greet();
}

class GreetingImpl implements Greeting {
    public void Greet() {
        System.out.println("Hey Dear");
    }
}

class LoggingHandler implements InvocationHandler {
    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Method " + method.getName() + " is called");
        return method.invoke(target, args);
    }
}

public class CustomLoggingProxy {
    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxyInstance = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingHandler(greeting)
        );
        proxyInstance.Greet();
    }
}
