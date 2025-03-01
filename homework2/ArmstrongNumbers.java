import java.util.Scanner;


public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit = input.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();
        System.out.print("The Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are: ");
        for (int i = lowerLimit; i <=upperLimit; i++){
            int count = 0;
            int temp = i;
            int numDigits = (int)(Math.log10(i) + 1);
            while (temp > 0){
                int digit = temp % 10;
                count += (int)Math.pow(digit, numDigits);
                temp /= 10;
            }
            if (count == i){
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
