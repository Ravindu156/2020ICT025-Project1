class LibraryMember{
	private String memberID;
	private String name;
	
	LibraryMember(String memberID,String name){
		this.memberID=memberID;
		this.name=name;
	}
	
	public String getMemberID(){
		return memberID;
	}
	
	public String getName(){
		return name;
	}
	
	public void setMemberID(String memberID){
		this.memberID=memberID;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String displayMemberDetails(){
		return "Member ID is: "+ memberID +"/nMember Name is: "+ name;
		
	}
	


}