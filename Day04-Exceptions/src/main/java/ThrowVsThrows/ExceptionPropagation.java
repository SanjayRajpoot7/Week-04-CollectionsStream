package ThrowVsThrows;

import java.io.IOException;

public class ExceptionPropagation {
    public void calculateInterest(double amount, double rate, int years) throws IOException {
        try{
            double totalInterest = (amount * rate * years) / 100;
            System.out.println("Total interest: "+totalInterest);
        }
        catch (IllegalArgumentException e){
            throw new IllegalArgumentException("invalid input: Amount and rate must be positive.");
        }
    }
    public static void main(String[] args) throws IOException {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.calculateInterest(76000,3,3);
    }
}
