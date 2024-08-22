public class palin_revers {

    public static boolean check(int n){
        int original=n;
        int reverse=0;
       while(n>0){
        int digit=n%10;
        reverse=(reverse*10)+digit;
        n=n/10;

       }
       return original==reverse;
    }
    public static void main(String[] args) {
        //int n=1221;
        System.out.println(check(1231));
    }
}
