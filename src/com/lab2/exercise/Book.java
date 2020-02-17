package com.lab2.exercise;

public class Book extends WrittenItem {
	   Book(){
		super();
		}
		 Book(int id, String str, int n){
		super(id, str, n);
		}
@Override
		public boolean equals(Object obj){
		if(obj == null)
		return false;
		Book otherBook = (Book) obj;
		return super.equals(otherBook);
		}
		public String toString(){
		return super.toString();
		}
		public int getIdNum(){
		return super.getIdentificationNumber();
		}
		public String getTitle(){
		return super.getTitle();
		}
		public int getNumCopies(){
		return super.getNumCopies();
		}
		public String getAuthor(){
		return super.getAuthor();
		}
		public void print(){
		System.out.println("Display info about a book: ");
		super.print();
		}
		public void checkIn(){
		super.checkIn();
		}
		public void checkOut(){
		super.checkOut();
		}
		public void addItem(){
		super.addItem();
		}
      
}
