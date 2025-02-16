package reflection.basicLevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Calculator{

    private double multiply(int a, int b){
        return a*b;
    }
        }
public class InvokePrivateMethod {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Calculator calculator = new Calculator();
        Class<?> cls = calculator.getClass();

        Method method = cls.getDeclaredMethod("multiply", int.class,int.class);

        method.setAccessible(true);

        double multiplyResult = (double) method.invoke(calculator,5,7);
        System.out.println(multiplyResult);

    }
}
