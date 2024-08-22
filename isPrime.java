public class isPrime {

    public static boolean isprime(int n) {
        boolean ispr = true;

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                ispr = false;
                break;
            }
        }
        return ispr;
    }

    public static void main(String[] args) {

        System.out.println(isprime(6));
        ;
    }
}
