public class Emirp {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 13; count < 100; n++) {
            if (prime(n) && non_palindrome(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
    }
    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {  
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean non_palindrome(int n) {
        int reversed_n_int = reverseNumber(n);
        return (n != reversed_n_int) && prime(reversed_n_int); 
    }
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }
}

