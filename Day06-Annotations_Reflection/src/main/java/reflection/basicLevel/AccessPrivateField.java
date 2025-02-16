package reflection.basicLevel;


import java.lang.reflect.Field;

class Person1{

    private int age;
        Person1(int age){
            this.age = age;
        }
}
public class AccessPrivateField {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person1 person1 = new Person1(22);
        Class<?> cls = person1.getClass();

        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);

        System.out.println("Old value: "+field.get(person1));

        field.set(person1,25);
        System.out.println("Modify value: "+field.get(person1));

    }
}
