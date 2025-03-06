import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        if (anagram(str1, str2)){
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }
        else
            System.out.print(str1 + " and " + str2 + " are NOT anagrams");
    }

    public static boolean anagram(String str1, String str2){
        int [] characterCounter1 = new int[26];
        int [] characterCounter2 = new int[26];

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()){
            return false;

        }
        for (int i = 0; i < str1.length(); i++){
                if (str1.charAt(i) == ' '){
                    continue;
                }
                int j = (str1.charAt(i) - 'a');
                characterCounter1[j] ++;
            }
        for (int i = 0; i < str2.length(); i++){
                if (str2.charAt(i) == ' '){
                    continue;
                }
                int j = (str2.charAt(i) - 'a');
                characterCounter2[j] ++;
        }
        if (Arrays.equals(characterCounter1, characterCounter2)){
            return true;
        }   
        else{
            return false;
        }

    }
}
