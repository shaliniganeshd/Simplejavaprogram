package Simplejavaprogram;
import java.util.Scanner;

public class insertmid {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int[] copy= new int[arr.length+1];
        Scanner s = new Scanner(System.in);
        System.out.println("enter n:");
        int k = s.nextInt();
        System.out.println("enter position:(index starts from 0):");
        int p = s.nextInt();
        for(int i=0;i<arr.length;i++)
        {          
           copy[i]=arr[i];
        }
        for(int i=p;i<arr.length;i++)
        {
            copy[i]=k;
           copy[i+1]=arr[i];
        }
        System.out.println("result");
        for(int i=0;i<copy.length;i++)
        {
           
            System.out.println(copy[i]);
        }
    }
}
