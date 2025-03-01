import java.util.Scanner;
public class Interests{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of years: ");
        int years = input.nextInt();
        System.out.println("Interest Rate\t Monthly Payment\t Total Payment\t");
        for (double interestRate = 5; interestRate <=8; interestRate += 0.125){
            double monthlyInterestRate = interestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(Math.pow(1 / (1 + monthlyInterestRate), years * 12)));
            double totalPayment = monthlyPayment * years * 12;
            System.out.printf("%.3f%%\t\t  %.2f\t\t  %.2f\n", interestRate, monthlyPayment, totalPayment);
        }
        input.close();
    }
}
