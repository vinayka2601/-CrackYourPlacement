import java.util.Scanner;

public class sumNnum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int i=1;
        int sum=0;
        for( int i=1;i<=n;i++){
           
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
