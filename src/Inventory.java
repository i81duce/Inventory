import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        ArrayList<InventoryItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("[1] Show Inventory");
            System.out.println("[2] Create a new item");
            System.out.println("[3] Update an items quantity");
            System.out.println("[4] Remove Item");


                String option = scanner.nextLine();

                if (option.equals("1")) {
                    int i = 1;
                    for (InventoryItem list : items) {
                        System.out.println(i + ". " + list.text + " - " + list.itemAmount);
                        i++;
                    }

                } else if (option.equals("2")) {
                    System.out.println("Please enter item name:");
                    String text = scanner.nextLine();

                    System.out.println("Now enter the quantity of " + text + ":" );
                    String quantity = scanner.nextLine();

                    InventoryItem item = new InventoryItem(text, quantity);
                    items.add(item);

                } else if (option.equals("3")) {
                    System.out.println("Select which item to update:");
                    int i = 1;
                    for (InventoryItem list : items) {
                        System.out.println(i + ". " + list.text + " - " + list.itemAmount);
                        i++;
                    }
                    String text = scanner.nextLine();
                    int num = Integer.valueOf(text);
                    InventoryItem item = items.get(num-1);
                    System.out.println("Enter new amount:");
                    String newquantity = scanner.nextLine();
                    item.itemAmount = newquantity;

                } else if (option.equals("4")) {
                    System.out.println("Select which item to remove:");
                    int i = 1;
                    for (InventoryItem list : items) {
                        System.out.println(i + ". " + list.text + " - " + list.itemAmount);
                        i++;
                    }
                    String text = scanner.nextLine();
                    int num = Integer.valueOf(text);
                    items.remove(num-1);

                } else {
                    System.out.println("Invalid Option");
                }
            }
        }
    }