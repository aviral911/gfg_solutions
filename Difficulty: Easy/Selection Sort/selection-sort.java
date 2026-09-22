class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
               int min =arr [i];
               int s=i;
               for(int j=i;j<arr.length;j++){
                 if(arr[j]<min){
                   min =arr[j];
                   s=j;
                 }  
               }
               int temp = arr[i];
               arr[i]=arr[s];
               arr[s]=temp;
            }
        
    }
}