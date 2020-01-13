package shopping;

public class Book extends Item {
	
	 private String authorName;
	 private String bookTitle;
	
	public Book(int itemId, float itemPrice, String authNm, String bkTitle) {
		super(itemId,itemPrice);
		this.authorName = authNm;
		this.bookTitle = bkTitle;		
	}
	
	public void itemAvailable() {
		
		if(id==0) {
			System.out.println("invalid item");
			
		}
		else
			System.out.println("yay!");	
	}
}
