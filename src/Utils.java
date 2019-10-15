import java.util.Scanner;

public class Utils {
  public static Boolean isInteger(String n) {
    return n.matches("(^[1-9]$)|(^10$)");
  }

  public static Boolean isRomanNumber(String n) {
    return n.matches("(^[IiVv]+$)|(^[Xx]$)|(^[Ii][Xx]$)");
  }

  public static String menu() {
    return "Enter an expression or 0 to exit\r\nEnter: ";
  }

  public static String input() {
    Scanner in = new Scanner(System.in);
    String args = in.nextLine();
    return args;
  }
}
