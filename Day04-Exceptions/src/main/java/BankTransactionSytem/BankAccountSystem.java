package BankTransactionSytem;

public class BankAccountSystem {
    public double balance;
    public BankAccountSystem(double balance){
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if(amount < 0){
            System.out.println("Invalid amount!");
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: "+balance);
        }

    }
    public static void main(String[] args) {
        BankAccountSystem bankAccountSystem = new BankAccountSystem(50);

        try{
            bankAccountSystem.withdraw(-200);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }
    }
}
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String str){
        super(str);
    }
}
