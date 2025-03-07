import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter decimal: ");
        int value = input.nextInt();
        System.out.println("(" + dec2Bin(value) + ")_2");
        input.close();
    }

    public static String dec2Bin(int value){
        String reversedBinary = "";
        String binary = "";
        while (true){
           int r = value % 2;
           value = value / 2;
           reversedBinary += r;
           if (value == 0)
            break;
        }

        for (int i = reversedBinary.length() - 1; i >= 0; i--){
            binary += reversedBinary.charAt(i);
        }

        return binary;
}
}
