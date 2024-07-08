package Simplejavaprogram;
import java.util.Scanner;
import java.io.*;
public class addArray {

    public static void main(String[] args) {
        int[] arr1 = {2,5,7,3,8,9};
        int[][] arr2 = {{2,4},{0,1}};
        int tot=0;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=arr2[i][0];j<=arr2[i][1];j++)
            {
                tot+=arr1[j];
            }
            System.out.println(tot);
            tot=0;
        }
      
    }
}//brute