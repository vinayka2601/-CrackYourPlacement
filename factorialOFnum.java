import java.util.Scanner;

public class factorialOFnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
      for(int f=1;f<=n;f++){
           fact=fact*f;
      }
      System.out.println(fact);
    }
}
