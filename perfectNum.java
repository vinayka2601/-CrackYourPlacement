import java.util.Scanner;

public class perfectNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0 && i!=n){
                System.out.println(i);
                sum=sum+i;
            }
            System.out.println("perfect sum is ->"+sum);
        }
    }
}
