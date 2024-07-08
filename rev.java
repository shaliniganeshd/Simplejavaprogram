package Simplejavaprogram;
import java.io.*;
import java.util.Scanner;
public class rev
{
public static void main(String[] args)
{
  int n;
 Scanner s = new Scanner(System.in);
    
     System.out.println("Enter n:");
     n=s.nextInt();
     for(int i=n;i>=1;i--)
     {
         System.out.println(i);
      }
}
}
//time-O(n)
//space-8