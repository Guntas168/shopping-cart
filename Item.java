package shopping;

import java.util.concurrent.atomic.AtomicInteger;

abstract class Item {
	int id;
	float price;
	private static final AtomicInteger count = new AtomicInteger(0);

	
	public Item(int itemId, float itemPrice) {
		
		this.id = itemId;
		itemId=count.incrementAndGet();
		this.price = itemPrice;
		
	}
	
	public int getId() {	
		return id;
	}
	

	public float getPrice(){
		return price;
		
	}
	
	public abstract void itemAvailable();
}
