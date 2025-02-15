package JUnit.BasicJUnitt;

public class StringUtils {

    public static void reverse(String str){
        String newString = "";
        for(int i = str.length()-1; i >= 0; i--){
            newString += str.charAt(i);
        }
        System.out.println(newString);
    }

    public static void isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        boolean flag = false;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                flag = true;
                break;
            }
            left++;
            right--;
        }
        if(!flag){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }

    public static void toUpperCase(String str){
        String str2 = str.toUpperCase();

//        String newString = "";
//        for(int i = 0; i < str.length(); i++){
//            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
//                newString.charAt(i) -= 32;
//            }
//        }
        System.out.println(str2);
    }
    public static void main(String[] args) {
        String str = "jay";
        reverse(str);
        isPalindrome(str);
        toUpperCase(str);
    }
}
