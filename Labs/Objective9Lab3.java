import java.util.Scanner;

public class Objective9Lab3 {
  public static void main (String [] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      printMenu();
      selection = scanner.nextInt();
      if (selection == 1) {
        System.out.println("Hello!");
      }
      else if (selection == 2) {
        System.out.println("My favorite foods are Beer & Margaritas.");
      }
      else{
        System.out.println("Goodbye");
        break;
      }
    }
  }
  public static void printMenu() {
    System.out.println("______Menu______");
    System.out.println("1: Say Hello");
    System.out.println("2: List my favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
