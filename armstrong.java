public class armstrong {
    public static void arms(int n){
        int arm=0;
       int originalnum=n;
       
         while(originalnum>0){
           int digit=originalnum%10;
             arm=(int) (arm+Math.pow(digit, 3));
             originalnum=originalnum/10;
         }
         if(arm==n){
            System.out.println("armstrong");;
         }else{
            System.out.println("not armstrong");;
         }
       
    }
    public static void main(String[] args) {
        arms(409);
      
    }
}
