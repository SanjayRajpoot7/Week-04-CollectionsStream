package reflection.intermediateLevel;
import java.lang.annotation.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyCustomAnnotation{
    String value();
}

class Test{
    @MyCustomAnnotation(value = "Custom method annotation")

    public void myMethod(){
        System.out.println("Executing myMethod");
    }
}

public class RetrieveAnnotationsRuntime {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test obj = new Test();
        Class<?> cls = obj.getClass();

        Method method = cls.getMethod("myMethod");

        if(method.isAnnotationPresent(MyCustomAnnotation.class)){
            MyCustomAnnotation myCustomAnnotation = method.getAnnotation(MyCustomAnnotation.class);
            System.out.println("Annotation Value: "+myCustomAnnotation.value());
        }

        method.invoke(obj);
    }
}
