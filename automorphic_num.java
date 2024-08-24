public class automorphic_num {
    public static void main(String[] args) {
      int n=625;
      int lastDigit1=n%10;
      int square=n*n;
     
        int lastDigit=square%10;
        
        if(lastDigit==lastDigit1){
            System.out.println("automorphic");
      }else{
        System.out.println("not automorphic");
      }
}
}
