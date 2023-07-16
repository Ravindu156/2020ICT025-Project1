class Book extends LibraryItem{
	private String author;
	private int numPages;
	
	Book(String title,String itemID, String author, int numPages){
		super (title,itemID);
		this.author=author;
		this.numPages=numPages;	
	}
	
	public String getAuthor(){
		return author;
	}
	
	public int getNumPages(){
		return numPages;
	}

	public void setAuthor(String author){
		this.author=author;
	}
	
	public void setNumPages(int numPages){
		this.numPages=numPages;
	}
	 void displayItemDetails(){
		 System.out.println(getAuthor());
		 System.out.println(getNumPages());
	 }

}