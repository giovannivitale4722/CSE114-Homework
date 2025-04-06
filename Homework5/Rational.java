import java.util.Scanner;
public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator){
        int GCD = GCD(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator/GCD;
        this.denominator = denominator/GCD;

        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
        
    }
    public static Rational add(Rational r1, Rational r2){
        int newNumerator = (r1.numerator * r2.denominator + r2.numerator * r1.denominator);
        int newDenominator = (r1.denominator*r2.denominator);
        return new Rational(newNumerator, newDenominator);
    }
    public static Rational subtract(Rational r1, Rational r2){
        int newNumerator = (r1.numerator * r2.denominator - r2.numerator * r1.denominator);
        int newDenominator = (r1.denominator*r2.denominator);
        return new Rational(newNumerator, newDenominator);
    }
    public static Rational multiply(Rational r1, Rational r2){
        int newNumerator = (r1.numerator * r2.numerator);
        int newDenominator = (r1.denominator*r2.denominator);
        return new Rational(newNumerator, newDenominator);
    }
    public static Rational divide(Rational r1, Rational r2){
        int newNumerator = (r1.numerator * r2.denominator);
        int newDenominator = (r1.denominator*r2.numerator);
        return new Rational(newNumerator, newDenominator);
    }
    public void print(){
        System.out.println(numerator + "/" + denominator);
    }

    public int GCD(int a, int b){
        return b == 0 ? a: GCD(b, a%b);
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator for the first rational number: ");
        int numerator1 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int denominator1 = input.nextInt();
        Rational fraction1 = new Rational(numerator1, denominator1);
        System.out.print("Enter numerator for the second rational number: ");
        int numerator2 = input.nextInt();
        System.out.print("Enter denominator for the second rational number: ");
        int denominator2 = input.nextInt();
        Rational fraction2 = new Rational(numerator2, denominator2);
        System.out.print("First rational number is: ");
        fraction1.print();
        System.out.print("Second rational number is: ");
        fraction2.print();
        Rational sum = add(fraction1, fraction2);
        System.out.print("Addition of the rational numbers is: ");
        sum.print();
        Rational difference = subtract(fraction1, fraction2);
        System.out.print("Subtraction of the rational numbers is: ");
        difference.print();
        Rational product = multiply(fraction1, fraction2);
        System.out.print("Multiplication of the rational numbers is: ");
        product.print();
        Rational quotient = divide(fraction1, fraction2);
        System.out.print("Division of the rational numbers is: ");
        quotient.print();

    }
}
