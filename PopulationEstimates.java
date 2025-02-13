import java.util.Scanner;
public class PopulationEstimates {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        int estimate = ((year - 2010) * 3) + 310;
        System.out.println("Population estimate (millions of people): " + estimate);
        input.close();
    }
}
