package Simplejavaprogram;
import java.util.Scanner;

public class insertend {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int[] copy= new int[arr.length+1];
        Scanner s = new Scanner(System.in);
        System.out.println("enter n:");
        int k = s.nextInt();
        copy[copy.length-1]=k;
        for(int i=0;i<arr.length;i++)
        {
           copy[i]=arr[i];
        }
        for(int i=0;i<copy.length;i++)
        {
            System.out.println(copy[i]);
        }
    }
}
