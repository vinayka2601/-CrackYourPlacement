import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year =sc.nextInt();

        boolean x=(year%4)==0;
        boolean y=(year%100)!=0;
        boolean z=(year%400)==0;
        
        if(x && (y||z)){
            System.out.println("it is a leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
