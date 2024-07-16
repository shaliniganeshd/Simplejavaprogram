package Simplejavaprogram;

public class RecursiveFactorial {
    public static void main(String[] args) {
        int n=5;
        int ans = fact(n);
    System.out.println(ans);
    }
    static int fact(int num)
    {
        if (num <= 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }
}
