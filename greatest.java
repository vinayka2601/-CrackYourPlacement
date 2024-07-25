import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is bada number");
        }else if(b>a && b>c){
            System.out.println("b bada hai bhai");
        }else{
            System.out.println("le bhai c bada nikla");
        }
    }
}
