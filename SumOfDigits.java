package Simplejavaprogram;

public class SumOfDigits {
   
    public static void main(String[] args) {
        int n = 2345;
        System.out.println(calc(n));
    }

    static int calc(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + calc(num / 10);
        }
    }
}


