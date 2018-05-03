import java.util.HashMap;
import java.util.Scanner;

public class ShoppingListApp {

	public static void main(String[] args) {
		
		HashMap<String, Double> products = new HashMap<>();// Display 8 items with names and prices (inventory)
		products.put("apple", 0.99);
		products.put("banana", 0.59);
		
		
		for (String product : products.keySet()) {
			System.out.println(product + "\t" + products.get(product));
		}
		
		//prompt user to enter an item name
		System.out.println("What item would you like to order?");
		
		Scanner scan = new Scanner(System.in);
		
		// get user input
		String userInput = scan.next();
		
	
		// add to order if no error
		
		if (products.containsKey(userInput)) {
			System.out.println("Adding " + userInput + " to cart at " + products.get(userInput));
		}
		else {
			System.out.println("Product does NOT exist, please try again.");
		}
		System.out.println();
		System.out.println("Would you like to order anything else (y/n)? ");
		
		String userInput = scan.next();
		//ArrayList<String> 
		
		//else handle error
		//prompt user to continue with order
		
		//display user order items and prices in columns (math)
		
		//display the average price of items ordered.
		
		//Write 3 methods to find:
		//1. the average of items ordered
		//2. the indexes of the highest cost items
		//3. lowest cost items
		
		
		// I'm struggling to complete these labs on my own, I wasn't able to complete this lab, but I am continuing to move forward
		// I'm having trouble understanding loops and structuring my program in eclipse
		//I am continuing to practice
		
		
		

	}
		//public static Double averagePrice(Array<double> priceList) {
		//	Double b 
		}
	
	

