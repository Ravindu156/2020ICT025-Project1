class Magazine extends LibraryItem{
	private String issueDate;
	private String publisher;
	
	Magazine(String title, String itemID, String issueDate,String publisher){
		super(title,itemID);
		this.issueDate=issueDate;
		this.publisher=publisher;
			
	}
	
	public String getIssueDate(){
		return issueDate;
	}
	public String getPublisher(){
		return publisher;
	}
	
	public void setIssueDate(String issueDate){
		this.issueDate=issueDate;
	}
	public void setpublisher(String publisher){
		this.publisher=publisher;
	}

	void displayItemDetails(){
		 System.out.println(getIssueDate());
		 System.out.println(getPublisher());
	 }


}