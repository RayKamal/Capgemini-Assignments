package com.lab2.exercise;

 abstract class WrittenItem extends Item{
	private String author;
	
	 WrittenItem(int id, String str, int n) {
		// TODO Auto-generated constructor stub
		super(id,str,n);
	}
	public WrittenItem(int idNum, String str, int n, String author2, int y) {
		// TODO Auto-generated constructor stub
		super();
		author=author2;
	}
	public WrittenItem() {
		// TODO Auto-generated constructor stub
	}
	void setAuthor(String str){
		author = str;
		}
		String getAuthor(){
		return author;
		}
		public int getidNum(){
		return super.getIdentificationNumber();
		}
		public String getTitle(){
		return super.getTitle();
		}
		public int getNumCopies(){
		return super.getNumberOfCopies();
		}
		public boolean equals(Object obj){
		if(obj == null)
		return false;
		WrittenItem otherWrittenItem = (WrittenItem) obj;
		return super.equals(otherWrittenItem) && author == otherWrittenItem.author;
		}
	
}
