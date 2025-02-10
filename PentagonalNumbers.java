import java.util.Scanner;
public class PentagonalNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int pentagonalNumber = n * (3*n - 1) / 2;
        System.out.println("Pentagonal number: " + pentagonalNumber);
        input.close();
    }
}
