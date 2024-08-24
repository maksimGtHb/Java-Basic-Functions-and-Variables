import java.util.Scanner;

public class Switch_statement {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number from 1 to 5");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("You have entered number 1");
                break;
            case 2:
                System.out.println("You have entered number 2");
                break;
            case 3:
                System.out.println("You have entered number 3");
                break;
            case 4:
                System.out.println("You have entered number 4");
                break;
            case 5:
                System.out.println("You have entered number 5");
                break;
            default:
                System.out.println("You have not entered a number from 1 to 5");
        }
    }
}
