import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary: ");
        String binaryString = input.nextLine();
        System.out.println(bin2Dec(binaryString));
        input.close();
    }
    public static int bin2Dec(String binaryString){
        int sum = 0;
        for (int i = binaryString.length() - 1, j = 0; i >= 0; i--, j++){
            sum += ((int) Math.pow(2, j) * (binaryString.charAt(i) - '0'));
        }
        return sum;
    }
}
