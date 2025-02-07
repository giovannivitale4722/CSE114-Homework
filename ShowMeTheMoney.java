import java.util.Scanner;

public class ShowMeTheMoney {
    public static void main(String[] args){
        /* 1 pound sterling = 20 shillings = 240 pence = 960 farthings */
        /* 1 shilling = 12 pence = 48 farthings */
        /* 1 penny = 4 farthings */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in the number of farthings: ");
        int poundSterling, shilling, penny, farthings, rm;
        farthings = input.nextInt();
        poundSterling = farthings / 960;
        rm = farthings % 960;
        shilling = rm / 48;
        rm = rm % 48;
        penny = rm / 4;
        farthings = rm % 4;
        
        System.out.println("Pound Sterling " + poundSterling);
        System.out.println("Shilling " + shilling);
        System.out.println("Penny " + penny);
        System.out.println("Farthings " + farthings);
        
        input.close();
 
 
    }  
}
