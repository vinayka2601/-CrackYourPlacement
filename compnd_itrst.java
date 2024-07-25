public class compnd_itrst {
    public static void main(String[] args) {
        int CI=200;
        int P=100;
        float r=8;
        int n=2;

        // CI = P(1 + r/100)n – P
        CI=  (int) (P*(Math.pow(1+r/100, n))-P);
        System.out.println(CI);

    }

    
}
