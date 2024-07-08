package Simplejavaprogram;
public class minmax {
    public static void main(String[] args) {
        int[] arr={4,3,6,2,34,56,32};
        int n=arr[0];
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>n)
            {
                n=arr[i];
            }
        }
        System.out.println("large"+n);
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]<n)
            {
                n=arr[i];
            }
        }
        System.out.println("small"+n);
    }
}
