import java.util.Scanner;

public class conVow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String alpha=sc.nextLine();
        if (alpha.equals("a") || alpha.equals("e") || alpha.equals("i") || alpha.equals("o") || alpha.equals("u")) {
            System.out.println("This is a vowel.");
        } else {
            System.out.println("This is a consonant.");
        }
    

    }
}
