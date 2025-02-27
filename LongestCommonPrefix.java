import java.util.Scanner;
public class LongestCommonPrefix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();
        int count = 0;
        int minLength = Math.min(str1.length(), str2.length());
        if (str1.charAt(0)!=str2.charAt(0)){
            System.out.print(str1 + " and " + str2 + " have no common prefix.");
        } else {
        for (int i = 0; i < minLength; i++){
            if (str1.charAt(i) == str2.charAt(i)){
                count++;
            }

        }
        System.out.println("The common prefix is " + str1.substring(0,count));
    }

    input.close();
    }
}