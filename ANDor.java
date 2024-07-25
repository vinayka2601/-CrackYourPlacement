import java.util.Scanner;

public class ANDor {
    public static void main (String[]args){
     Scanner sc=new Scanner(System.in);
     int fst=sc.nextInt();
     int snd=sc.nextInt();
     int thrd=sc.nextInt();
     if(fst==snd && snd==thrd){
        System.out.println("all are equal");
     }else if(fst==snd || fst==thrd ||snd==thrd){
        System.out.println("any two are equal");
     }
     else{
        System.out.println("non of them are equal ");
     }
    }
}
