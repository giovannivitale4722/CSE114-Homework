import java.util.Scanner;

public class Complex {
    private double realPart;
    private double imaginaryPart;


    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(){
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public static Complex add(Complex c1, Complex c2){
        return new Complex(c1.realPart + c2.realPart, c1.imaginaryPart + c2.imaginaryPart);
    }
    public static Complex subtract(Complex c1, Complex c2){
        return new Complex(c1.realPart - c2.realPart, c1.imaginaryPart - c2.imaginaryPart);
    }
    public void print(){
        System.out.println("(" + realPart + ", " + imaginaryPart + ")");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter real part of the first complex number: ");
        double c1RealPart = input.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double c1ImaginaryPart = input.nextDouble();
        Complex c1 = new Complex(c1RealPart, c1ImaginaryPart);
       
        System.out.print("Enter real part of the second complex number: ");
        double c2RealPart = input.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double c2ImaginaryPart = input.nextDouble();
        Complex c2 = new Complex(c2RealPart, c2ImaginaryPart);

        System.out.print("First complex number is: " );
        c1.print();
        System.out.print("Second complex number is: ");
        c2.print();
        System.out.print("Addition of the complex numbers is: ");
        Complex sum = add(c1, c2);
        sum.print();
        System.out.print("Subtraction of the complex numbers is: ");
        Complex difference = subtract(c1, c2);
        difference.print();

    }
}
