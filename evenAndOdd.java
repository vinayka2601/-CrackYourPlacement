public class evenAndOdd {
    public static void main(String[] args) {
        int arr[]={12,33,58,6,56,3,8,90,0,44,5};
        System.out.println("for even");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("for odd");
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2!=0){
                System.out.println(arr[j]);
            }
        }
    }
}
