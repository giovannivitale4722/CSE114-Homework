import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll("\\s", "");
        System.out.println("Input string " + str + palindrome(str));
        input.close();
        
    }
    public static String palindrome(String str){
        char[] stringArray = str.toCharArray();
        for (int i = 0, j = stringArray.length -1; i < stringArray.length/2; i++, j--){
            if (stringArray[i] != stringArray[j]){
                return " is not a palindrome";
            }
            
            
        }
        return " is a palindrome";
    }
}
