class nthsmall {
    public static void main(String[] args) {
        int[] arr = {23,1,34,12,10};
        for(int i=0;i<arr.length - 1;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[i]){
                  int temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }      
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int n=3;
        System.out.println("Nth smallest of the array is "+arr[n-1]);
    }
}
