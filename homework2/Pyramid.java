import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                System.out.print("  ");
            }
            for (int j = 0 ; j <= i; j++){
                System.out.print((int)Math.pow(2, j)  + " ");
            
            }
            for (int j = 0; j < i; j++){
        System.out.print((int)Math.pow(2, i-j-1) + " ");
    }
    System.out.println("");
}
input.close();

    }
}
