package newproject;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	    private List<Book> books;

	    public ShoppingCart() {
	        this.books = new ArrayList<>();
	    }

	    public void addToCart(Book book) {
	        books.add(book);
	        System.out.println("Book added to the cart: " + book.getTitle());
	    }

	    public void viewCart() {
	        if (books.isEmpty()) {
	            System.out.println("Your cart is empty.");
	        } else {
	            System.out.println("Your Shopping Cart:");
	            for (Book book : books) {
	                System.out.println(book);
	            }
	            System.out.println("Total Price: $" + calculateTotalPrice());
	        }
	    }

	    public double calculateTotalPrice() {
	        double total = 0;
	        for (Book book : books) {
	            total += book.getPrice();
	        }
	        return total;
	    }

	    public void clearCart() {
	        books.clear();
	        System.out.println("Your cart is cleared.");
	    }
	}

	class Bookstore {
	    private List<Book> books;
	    private ShoppingCart shoppingCart;

	    public Bookstore() {
	        this.books = new ArrayList<>();
	        this.shoppingCart = new ShoppingCart();
	        initializeBooks();
	    }

	    private void initializeBooks() {
	        // Add some sample books
	        books.add(new Book("Python Crash Course", "Eric Matthes", 500));
	        books.add(new Book("java", "Vikram Seth", 530));
	        books.add(new Book("HTML", "George Orwell", 599));
	        books.add(new Book("SQL", "J.D. Salinger", 525));
	    }

	    public void displayBooks() {
	        System.out.println("\nAvailable Books:");
	        for (int i = 0; i < books.size(); i++) {
	            System.out.println("\n"+(i + 1) + ". " + books.get(i));
	        }
	    }

	    public void addToCart(int bookIndex) {
	        if (bookIndex >= 1 && bookIndex <= books.size()) {
	            Book selectedBook = books.get(bookIndex - 1);
	            shoppingCart.addToCart(selectedBook);
	        } else {
	            System.out.println("Invalid book selection.");
	        }
	    }

	    public void viewCart() {
	        shoppingCart.viewCart();
	    }

	    public void checkout() {
	        if (shoppingCart.calculateTotalPrice()!=0.0) {
	            System.out.println("Thank you for shopping with us!");
	            System.out.println("Total Amount: $" + shoppingCart.calculateTotalPrice());
	            shoppingCart.clearCart();
	        } else {
	            System.out.println("Your cart is empty. Add books before checking out.");
	        }
	    }
	}

