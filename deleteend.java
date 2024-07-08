package Simplejavaprogram;
import java.util.Scanner;

public class deleteend {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int[] copy= new int[arr.length-1];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
           copy[i]=arr[i];
        }
        System.out.println("result");
        for(int i=0;i<copy.length;i++)
        {
            System.out.println(copy[i]);
        }
    }
}
