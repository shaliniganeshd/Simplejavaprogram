package Simplejavaprogram;
import java.util.Scanner;

public class deletemid {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int[] copy= new int[arr.length-1];
        Scanner s = new Scanner(System.in);
        System.out.println("enter position:(index starts from 0):");
        int p = s.nextInt();
        for(int i=0;i<arr.length-1;i++)
        {          
           copy[i]=arr[i];
        }
        for(int i=p;i<arr.length-1;i++)
        {
          
           copy[i]=arr[i+1];
        }
        System.out.println("result");
        for(int i=0;i<arr.length-1;i++)
        {
           
            System.out.println(copy[i]);
        }
       
    }
}
