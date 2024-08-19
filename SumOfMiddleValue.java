
public class SumOfMiddleValue{
     public static void main(String args[]){
        int[] arr1={2,5,6,7,8};
        int[] arr2={3,5,6,7,9};
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr3[i+5]=arr2[i];
        }
        for(int i=0;i<arr3.length - 1;i++){
            for(int j=i+1;j<arr3.length;j++){
               if(arr3[j]<arr3[i]){
                  int temp=arr3[i];
                   arr3[i]=arr3[j];
                   arr3[j]=temp;
               }      
            }
        }
        for(int i=0;i<arr3.length;i++){
            System.out.println(i+" is "+arr3[i]);
        }
        int n = arr3.length / 2;
        System.out.println("Sum of middle elements in the sorted array is: "+(arr3[n]+arr3[n+1]));
     }
}