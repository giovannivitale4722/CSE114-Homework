public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr1 = randomArray(100, 21); // randomArray call
       
        print(arr1); // print call
        System.out.println("The average of the array is: " + (arraySum(arr1))/(double)arr1.length);
        System.out.println("The first index of 12 in the array is at (-1 if not in array): " + contains(arr1, 12));
        System.out.println("There are " + countMultiplesOf(arr1, 7) + " multiples of 7 in the array");

    }


    public static int[] randomArray(int size, int upperLim){
        int [] arr1 = new int[size];
        for (int i = 0; i < size; i++){
            arr1[i] = (int)(Math.random()*upperLim);
        }
        return arr1;
    }

    public static void print(int[] arr1){
        System.out.print("[");
        for (int num: arr1){
            System.out.print(num +  " ");
        }
        System.out.println("]");

    }

    public static int arraySum(int[] arr3){
        int count = 0;
        for (int num: arr3){
            count+= num;
        }
        return count;
    }

    public static int contains(int[] arr4, int j) {
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] == j) {
                return i; 
            }
        }
        return -1; 
    }
    
    
    public static int countMultiplesOf(int[] arr5, int k){
        int count = 0;
        for (int num: arr5){
            if (num % k == 0){
                count++;
            }
        }
        return count;
    }


}
    
