public class swapBin {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        a=a^b;
        b=a^b;
        System.out.println("b is "+b);
        a=a^b;
        System.err.println("a is "+a);
    }
}
