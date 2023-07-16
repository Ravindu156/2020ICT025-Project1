abstract class LibraryItem{
	private String title;
	private String itemId;
	
	LibraryItem(String title, String itemId){
		this.title=title;
		this.itemId=itemId;
	}
	
	
	public String getTitle(){
		return title;
	}
	public String getItemID(){
		return itemId;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	public void setItemID(String itemId){
		this.itemId=itemId;
	}
	
	
	//abstract void checkOut();
	//abstract void checkIn();
	abstract void displayItemDetails();
	
		
	
	
	
	
	
	
	
	
}
