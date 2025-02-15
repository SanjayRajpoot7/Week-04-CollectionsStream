package JUnit.BasicJUnitt;

public class TestingParameterized {
    public static boolean isEven(int number){
        int check = number & 1;
        if(check == 1){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 62;
        System.out.println(isEven(number));

    }
}
