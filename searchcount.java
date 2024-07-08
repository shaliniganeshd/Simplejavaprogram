package Simplejavaprogram;
import java.util.Scanner;

public class searchcount {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,7,4,6,6,6,6,6,2};
        int count=0,k;
        Scanner s= new Scanner(System.in);
        k=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
