import java.util.Scanner;

public class MethodsWithParametersExample {
  public static void main (String[] args) {
    Scanner kb = new Scanner(System.in);
    String item;
    int quantity;
    System.out.println ("Please enter your inventory item: ");
    item = kb.nextLine();
    System.out.println("Please enter the quantity: ");
    quantity = kb.nextInt();

    printInventory(item, quantity);

    /*
    Line 13 "calls" the method printInventory, which is defined on line 23
    item and quantity are the "arguments" for the printInventory method
    Arguments: the pieces of data that a method needs in order to execute properly
    */

  }

  public static void printInventory(String inventoryItem, int numberOfInventoryItems) {
    System.out.println("There are currently " + numberOfInventoryItems + " " + inventoryItem + " left.");
    /*
    Line 23 "defines" the method printInventory
    inventoryItem and numberOfInventoryItems are the "parameters" for the printInventory method
    Parameters: where you define the pieces of data the method needs to execute properly
    The defined pieces of data MUST match the data types of the arguments and be in the same order
    */
  }
}
