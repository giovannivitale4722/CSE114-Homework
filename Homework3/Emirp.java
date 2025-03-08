public class Emirp {
    public static void main(String[] args) {
        int count = 0;
        for (int n = 13; count < 100; n++){
            if (prime(n) && non_palindrome(n)){
                System.out.print(n + " ");
                count++;
            }
        }
        }
    public static boolean prime(int n){
      for (int i = 2; i < n/2; i++){
        if (n % i == 0){
            return false;
        }
      }
      return true;

    }
    public static boolean non_palindrome(int n){
        String strN= Integer.toString(n);
        String reversed_n_string = "";
        for (int i = strN.length() - 1; i >= 0; i--){
            reversed_n_string += strN.charAt(i);
        }
        int reversed_n_int = Integer.parseInt(reversed_n_string);

        for (int i = 2; i <reversed_n_int/2; i++){
            if (reversed_n_int % i == 0){
                return false;
            }
        }
        return true;
    }
}
