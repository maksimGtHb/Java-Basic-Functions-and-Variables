import java.sql.SQLOutput;
import java.util.Scanner;

public class Do_while {
    public static void main (String[] args){
        int input;
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println("Please enter 67");
            input = obj.nextInt();
        } while(input!=67);
        System.out.println("You have entered 67");
    }
}
