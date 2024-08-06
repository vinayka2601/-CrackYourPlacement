public class swap2 {
    public static void main(String[] args) {
        int a=2;
        int b=50;
        int step1=a+b;
        int step2=step1-a;
        a=step2;
        int step3=step1-b;
        b=step3;
        System.out.println(a);
        System.out.println(b);
    }
}
