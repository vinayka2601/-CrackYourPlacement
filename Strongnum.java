public class Strongnum {
    
    public static void main(String[] args) {
        int n=145;
        int original=n;
        int strong=0;
      
        while(original>0){
              int reminder=original%10;
              int fact=1;

              for(int i=1;i<=reminder;i++){
                 fact=fact*i;
               
              }
              strong+=fact;
             
              original=original/10;

        }
        if(strong==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
