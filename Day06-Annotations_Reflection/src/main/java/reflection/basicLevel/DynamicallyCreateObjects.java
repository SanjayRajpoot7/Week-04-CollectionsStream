package reflection.basicLevel;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Car{
    private String name;

    public Car(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Car Name: "+name);
    }

}
public class DynamicallyCreateObjects {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> cls1 = Car.class;

        Constructor<?> constructor = cls1.getConstructor(String.class);

        Car car = (Car) constructor.newInstance("Raj");
        car.display();

    }
}
