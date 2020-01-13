package shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShoppingCart {
	
	public static void main(String[]args) {
		
		Scanner std = new Scanner(System.in);
		ArrayList<Item> cart = new ArrayList <Item>();
		
		Item item;
		int itemId;
		float itemPrice;
	    String authNm, bkTitle;
	    int option;
	    String opt;
		
		ShoppingCart sc = new ShoppingCart();
		
		
			System.out.println("Welcome users!"+ "\n" +"Please select an option from the Menu"+"\n"+
		"press 1 to ADD an item in the shopping cart"+ "\n"+"press 2 to view items in the shopping cart"
		 +"\n"+"press 3 to exit from the cart");
			
			option = std.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter item Id");
			    itemId = std.nextInt();
				
				System.out.println("Enter price of the item");
				itemPrice = std.nextFloat();
				
				
				System.out.println("enter the name of the author");
				authNm = std.nextLine();
				
				System.out.println("Enter the title of the book");
				bkTitle = std.nextLine();
				
				sc.add(itemId, itemPrice, authNm, bkTitle);
					
				break;
				
			case 2:
				System.out.println ("idk yet");
				//sc.display(itemId, itemPrice, authNm, bkTitle);
				
				break;
				
			case 3:
				
			System.out.println("thank you for shopping!");
			//System.exit(3);
			break;
			
			default:
				
				System.out.println("invalid input");
				//System.exit(1);
				break;
				
			}
			
			
			
			
			
		
	}

}
