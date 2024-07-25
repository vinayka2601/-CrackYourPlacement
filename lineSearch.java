public class lineSearch {

    public static int SeqSearch (int arr[],int mid,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
       
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={22,55,33,76,88,45};
        int key=88;
        int index=SeqSearch(arr, key, key);
        if(index==-1){
            System.out.println("key not found");;
        }else{
            System.out.println("key found");
        }
    }
}
