import java.util.Scanner;

public class EasyBuyMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Display Cart");
            System.out.println("5. Display Total Price");
            System.out.println("6. Clear Cart");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) { 
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter Product Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Product Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();

                    Product product = new Product(id, name, price, quantity);
                    cart.addItem(product, quantity);
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = scanner.nextInt();
                    cart.removeItem(removeId);
                    break;

                case 3:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new Quantity: ");
                    int newQuantity = scanner.nextInt();
                    cart.updateItemQuantity(updateId, newQuantity);
                    break;

                case 4:
                    cart.displayCart();
                    break;

                case 5:
                    cart.displayTotalPrice();
                    break;

                case 6:
                    cart.clearCart();
                    System.out.println("Cart cleared.");
                    break;

                case 7:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (choice<7);


        scanner.close();
    }
}

