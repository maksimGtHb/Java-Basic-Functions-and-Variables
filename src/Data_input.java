import java.util.Scanner;

public class Data_input {
 public static void main (String[] args)
 {
  Scanner object = new Scanner(System.in);

  System.out.println("Please entry your line bellow");
  String str = object.nextLine();
  System.out.println("You have entered following line: " + str);

  System.out.println("Please entry your number bellow");
  int num = object.nextInt();
  System.out.println("You have entered following number: " + num);
 }
}
