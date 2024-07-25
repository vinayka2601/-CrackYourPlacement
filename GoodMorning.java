import java.util.Scanner;

public class GoodMorning {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      System.out.println("whats your gender male or female");
      String gender=sc.nextLine();
        if (gender.equals("female") || gender.equals("female") || gender == "F" || gender == "f") {
            System.out.println("good morning mam");
        }
     if (gender == "male" || gender == "Male" || gender == "M" || gender == "m") {
            System.out.println("good morning sir");
        // }else{
        //     System.out.println("wrong input");
        // }
    }

    }
}
