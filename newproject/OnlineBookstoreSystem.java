package newproject;

import java.util.Scanner;

public class OnlineBookstoreSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookstore bookstore = new Bookstore();

        while (true) {
            System.out.println("\nOnline Bookstore System");
            System.out.println("\n1. Browse Books");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.println("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookstore.displayBooks();
                    break;
                case 2:
                    bookstore.displayBooks();
                    System.out.println("Enter the book number to add to cart: ");
                    int bookIndex = scanner.nextInt();
                    bookstore.addToCart(bookIndex);
                    break;
                case 3:
                    bookstore.viewCart();
                    break;
                case 4:
                    bookstore.checkout();
                    break;
                case 5:
                    System.out.println("Exiting Online Bookstore. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}