package Simplejavaprogram;
import java.io.*;
import java.util.Scanner;
public class factors
{
public static void main(String[] args)
{
  int n;
 Scanner s = new Scanner(System.in);
    
     System.out.println("Enter n:");
     n=s.nextInt();
     System.out.println("Result:");
     for(int i=4;i<=n;i+=4)
     {
         System.out.println(i);
      }
}
}
//time-O(N)
//space-8