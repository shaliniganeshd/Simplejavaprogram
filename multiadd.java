package Simplejavaprogram;
public class multiadd {
    public static void main(String[] args) {
        int[][] arr1 = {{2,4,5},
                        {0,1,6},
                        {3,6,2}};
        int[][] arr2 = {{0,1},{2,2}};
      
        int tot=0;
        for(int i=arr2[0][0];i<=arr2[1][0];i++)
        {
            for(int j=arr2[0][1];j<=arr2[1][1];j++)
            {
                tot+=arr1[i][j];
            }
            
            
        }
        System.out.println(tot);
    }
    
}
