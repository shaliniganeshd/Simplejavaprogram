package Simplejavaprogram;
public class subarr {
    public static void main(String[] args) {
        int[] arr = {1,-1,5,2,7,1,23,5,3,4,5};
        int[] range={7,1,23};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==range[0] && arr[i+1]==range[1] && arr[i+2] == range[2])
            {
                count++;             
            }         
        }
        System.out.println("sub array found:"+count);
    }
}
