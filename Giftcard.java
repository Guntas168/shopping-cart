package shopping;

public class Giftcard extends Item {

String gcardDesc;
String gcardCol;

public Giftcard(int itemId, float itemPrice, String giftCdDesc, String giftCdcol) {
	
	super(itemId,itemPrice);
	this.gcardDesc = giftCdDesc;
	this.gcardCol = giftCdcol;
}

public void itemAvailable() {
	
	if(id==0) {
		System.out.println("invalid item");
		
	}
	else
		System.out.println("yay!");	
	}
}


