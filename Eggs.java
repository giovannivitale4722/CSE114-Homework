import java.util.Scanner;
public class Eggs {
    public static void main(String[] args){
        System.out.print("Number of eggs in the order: ");
        Scanner input = new Scanner(System.in);
        int eggs = input.nextInt();
        int dozen = eggs / 12;
        int loose_eggs = eggs % 12;
        int eggsByDozen = dozen * 12;
        double dozenCost = dozen * 3.25;
        double loose_eggs_cost = loose_eggs * 0.45;
        double totalCost = dozenCost + loose_eggs_cost;
        System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen (" + dozen + " x 12 = " + eggsByDozen + " eggs) at $3.25 per dozen (" + dozen + " x $3.25 = $" + dozenCost + ") and " + loose_eggs + " loose eggs at 45 cents (" + loose_eggs + " x 45c = $" + loose_eggs_cost + ") for a total of $" + totalCost + " ($" + dozenCost + " + $" + loose_eggs_cost + " = $" + totalCost + ").");
        input.close();

    }
}
