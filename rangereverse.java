package Simplejavaprogram;
import java.util.Scanner;

public class rangereverse {
    public static void main(String[] args) {
        int[] arr={2,23,9,5,1};
        int[] copy= new int[arr.length];
         Scanner s = new Scanner(System.in);
        System.out.println("enter range");
        int p = s.nextInt();
        int k=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            copy[i]=arr[i];
            System.out.println(copy[i]);
        }
        
        while (p < k) {
            int temp = copy[p];
            copy[p] = copy[k];
            copy[k] = temp;
            p++;
            k--;
        }
        
        System.out.println("result:");
        for(int i=0;i<copy.length;i++)
        {
       
            System.out.println(copy[i]);
        }

    }
}
