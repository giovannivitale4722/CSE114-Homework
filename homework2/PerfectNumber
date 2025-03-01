import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the upper limit: ");
    int upperLimit = input.nextInt();
    System.out.print("The perfect numbers below "+ upperLimit + " are: ");
    for (int i = 1; i <= upperLimit; i++){
        int sum = 0;
        
        for (int j = 1; j < i; j++){
            if (i % j == 0){
                sum += j;
            }
        }
        if (sum == i){
            System.out.print(i + " ");
            }
        }
    }
}
