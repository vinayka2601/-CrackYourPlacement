public class divisibleBY3or5 {
    public static void main(String[] args) {
        int arr[]={9,33,5,50,6,90,25};
        System.out.println("for 3");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%3==0){
                System.out.println("div by 3="+(arr[i]));
            }
        }
        System.out.println("for 5");
        for(int j=0;j<arr.length;j++){
            if(arr[j]%5==0){
                System.out.println("div by 5="+(arr[j]));
            }
        }
    }
}
