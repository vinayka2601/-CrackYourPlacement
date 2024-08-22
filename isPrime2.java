public class isPrime2 {
    public static boolean isp(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isp(2472090));
    }
}
