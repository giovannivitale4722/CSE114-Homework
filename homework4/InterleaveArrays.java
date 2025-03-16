public class InterleaveArrays {
    public static void main(String[] args) {
        print(interleaveArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        print(interleaveArrays(new int[] { 10, 20, 30, 40, 50, 60, 70, 80 }, new int[] { 2, 4, 6, 8 }));
        print(interleaveArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6, 8, 10 }));
        print(interleaveArrays(new int[] { 1, 6, 8, 9, 15 }, new int[] { 2, 10, 30, 50, 100 }));
        print(interleaveArrays(new int[] { 20, 22, 24, 26, 28 }, new int[] { 21, 23, 25, 27, 29, 31, 33, 35 }));

    }

    public static int[] interleaveArrays(int[] array1, int[] array2) {
        int a = array1.length, b = array2.length;
        int i = 0, j = 0, k = 0;
        int n = a + b;
        int[] mergedArray = new int[n];

        while (i < a && j < b) {
            mergedArray[k++] = array1[i++];
            mergedArray[k++] = array2[j++];
        }

        while (i < a) {
            mergedArray[k++] = array1[i++];
        }
        while (j < b) {
            mergedArray[k++] = array2[j++];
        }

        return mergedArray;

    }

    public static void print(int[] arr1){
            System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i < arr1.length - 1) {
                System.out.print(", ");
            }
    
        }
        System.out.println("]");
    }
}
