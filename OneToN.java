package Simplejavaprogram;

public class OneToN {
    public static void main(String[] args) {
        int n=10;
        printNum(1,n);
    }
    static void printNum(int x,int n){
        int a=x;
        int b=n;
     System.out.println(a);
     if(a<b)
     {
     printNum(a+1,b);
     }
    }
}
