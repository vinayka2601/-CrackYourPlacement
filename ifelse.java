import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        String name=sc.nextLine();
        int age=sc.nextInt();
        System.out.println("for"+" "+name+" "+"we are analysing the voting process");
     if(age>=18){
        System.out.println("valid for voting");
     }else{
        System.out.println("not valid for voting process");
     }
    }
}
