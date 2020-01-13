package shopping;

import java.util.Scanner;

public class ShoppingCart {
	
	private int iCount;
	private float iPrice;
	private String authNm, bkTitle;
	int cartCapacity;
	private Item[] cart = new Item[cartCapacity];
	
	public ShoppingCart() {
		iCount = 0;
		iPrice = 0;
		cartCapacity = 11;
	    cart = new Item[cartCapacity];
		
	}
	
	public void add (int itemId,  float itemPrice,String authNm, String bkTitle) {
		Book b = new Book(itemId, itemPrice, authNm, bkTitle);
		
		itemPrice = iPrice; // add validation here, only positive value of price is accepted//
		
			cart[iCount] = b;
			iCount++;
			System.out.println("items added successfully!");
			
			if (iCount == cartCapacity)
			{
				increaseSize();
			}
	}
			
		/*public void display(int itemId, float itemPrice,String authNm, String bkTitle) {
			System.out.printf("%d"+"\n"+"%f"+"\n"+ "%s"+"\n"+ "%s"+"\n", itemId, itemPrice, authNm, bkTitle)
	}*/
		
		public void increaseSize()
		{
			Item[] item = new Item[cartCapacity];
			for(int i =0; i<cartCapacity;i++) {
				
				item[i] = cart[i];
				
			}
			
			cart = item;
			item = null;
			cartCapacity = cart.length;
		}
		
		
}

		


	
	
