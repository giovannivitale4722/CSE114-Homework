import java.util.Scanner;
public class Triangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Side1: ");
        double side1 = input.nextDouble();
        System.out.print("Side2: ");
        double side2 = input.nextDouble();
        System.out.print("Side3: ");
        double side3 = input.nextDouble();

        if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2){
            System.out.println("Output: Invalid input!");
        } else if ( side1 == side2  && side2 == side3){
            System.out.println("Output: Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("Output: Isosceles");
        } else {
            System.out.println("Output: Scalene");
        }
        input.close();
    }
}
