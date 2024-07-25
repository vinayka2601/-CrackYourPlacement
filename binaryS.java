public class binaryS {
    public static int binS(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
           if(arr[mid]==key){
            return mid;
           }
         if(arr[mid]<key){
            start=mid+1;
           }
           else{
            end=mid-1;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,13};
        int key=5;
      System.out.println(binS(arr, key));
      

    }
}
