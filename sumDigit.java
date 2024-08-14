public class sumDigit {
    public static void main(String[] args) {
        int n=1263;
        int sum=0;
        while(n>0){
            int enddigit=n%10;
            //System.out.println(enddigit);
            sum=sum+enddigit;
            n=n/10;
            System.out.println(sum);
        }
    }
}
