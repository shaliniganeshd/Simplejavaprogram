package Simplejavaprogram;
public class countofgreater {
    public static void main(String[] args) {
        int[] arr={2,23,1,5,0};
        int count=0;
         System.out.println(count);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
              if(arr[i]>arr[j])
              {
                  count++;
                  
                  break;
              }
            
            }
            
        }
        System.out.println(count);
    }
}
