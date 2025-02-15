package JUnit.BasicJUnitTest.AdvancePracticeProblems;

public class BankAccount {
    static double balance = 5600;
    public static double deposit(double amount){
        balance += amount;
        return balance;
    }

    public static double withdraw(double amount){
        if(balance > amount && amount > 0) {
            balance -= amount;
        }
        return balance;
    }

    public static double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        System.out.println(deposit(4200));
        System.out.println(withdraw(1220));
        System.out.println(getBalance());
    }
}
