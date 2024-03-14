import java.util.*;
class ShoppingCartApplication {
    ArrayList<String> itemNameList = new ArrayList<>();
    ArrayList<Double> priceList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addItems(int itemNo, String itemName, double price) {
        itemNameList.add(itemNo + ". " + itemName);
        priceList.add(price);
        System.out.println("Item added successfully.");
    }
    public void showItems() {
        if (itemNameList.isEmpty()) {
            System.out.println("No items in the cart.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemNameList.size(); i++) {
                System.out.println(itemNameList.get(i) + " - Rs" + priceList.get(i));
            }
        }
    }
    public void deleteItem(int itemNo) {
        if (itemNo >= 1 && itemNo <= itemNameList.size()) {
            itemNameList.remove(itemNo - 1);
            priceList.remove(itemNo - 1);
            System.out.println("Item deleted successfully.");
        } else {
            System.out.println("Invalid item number.");
        }
    }
    public void updateItem(int itemNo, String newItemName, double newPrice) {
        if (itemNo >= 1 && itemNo <= itemNameList.size()) {
            itemNameList.set(itemNo - 1, itemNo + ". " + newItemName);
            priceList.set(itemNo - 1, newPrice);
            System.out.println("Item updated successfully.");
        } else {
            System.out.println("Invalid item number.");
        }
    }
    public void Order(int index){
        if(itemNameList.isEmpty()){
            System.out.println("No items in cart");
        }
        else{
            System.out.println("Order placed successfully.");    
        }
    }
    public void orderMenu() {
        System.out.println("\n1. Add items");
        System.out.println("2. Show items");
        System.out.println("3. Delete items");
        System.out.println("4. Update items");
        System.out.println("5. Order");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
    public static void main(String[] args) {
        ShoppingCartApplication cart = new ShoppingCartApplication();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            cart.orderMenu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter item number: ");
                    int itemNo = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter item name: ");
                    String itemName = sc.nextLine();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    cart.addItems(itemNo, itemName, price);
                    break;
                case 2:
                    cart.showItems();
                    break;
                case 3:
                    System.out.print("Enter item number to delete: ");
                    int deleteItemNo = sc.nextInt();
                    cart.deleteItem(deleteItemNo);
                    break;
                case 4:
                    System.out.print("Enter item number to update: ");
                    int updateItemNo = sc.nextInt();
                    sc.nextLine();  // Consume newline
                    System.out.print("Enter new item name: ");
                    String newItemName = sc.nextLine();
                    System.out.print("Enter new item price: ");
                    double newPrice = sc.nextDouble();
                    cart.updateItem(updateItemNo, newItemName, newPrice);
                    break;
                case 5:
                    cart.showItems();
                    System.out.println("What do you want to Buy? ");
                    int order_num = sc.nextInt();
                    cart.Order(order_num);
                    System.out.println("Order placed successfully.");                    
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
        sc.close();
    }
}
