import java.util.Scanner;

public class dayName {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        int day=sc.nextInt();
        switch(day){
            case 1:System.out.println("monday");
            break;

            case 2:System.out.println("tuesday");
            break;

            case 3:System.out.println("wednesday");
            break;

            default :System.out.println("week days");
            break;
         }
    }
}
