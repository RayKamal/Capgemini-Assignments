package com.lab2.exercise;

abstract class Item extends Object {
	private int identificationNumber;
	private String title; 
	private int numberOfCopies;
	
	public int getIdentificationNumber() {
		return identificationNumber;
	}

	public int setIdentificationNumber(int identificationNumber) {
		this.identificationNumber = identificationNumber;
		return identificationNumber;
	}

	public String getTitle() {
		return title;
	}

	public String setTitle(String title) {
		this.title = title;
		return title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public int setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
		return numberOfCopies;
	}

	 Item(int identificationNumber,String title,int numberOfCopies)
	{
		this.identificationNumber=identificationNumber;
		this.title=title;
		this.numberOfCopies=numberOfCopies;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "Identification Number :"+identificationNumber+"\n"+"Title :"+title+"\n"+"Number of copies"+numberOfCopies;
		
	}
	public void addItem(int identificationNumber,String title,int numberOfCopies)
	{
		setIdentificationNumber(identificationNumber);
		setTitle( title);
		setNumberOfCopies(numberOfCopies);
		
	}
	public void checkIn()
	{
		numberOfCopies=numberOfCopies+1;
	}
	public void checkOut()
	{
		numberOfCopies=numberOfCopies-1;
	}
	
	public void print(){
		System.out.println("Title: " +title);
		System.out.println("ID: " +identificationNumber);
		System.out.println("Number of copies: " +numberOfCopies);
		}
  @Override
	public boolean equals(Object obj){
		if(obj == null)
		return false;
		Item otherItem = (Item) obj;
		return identificationNumber == otherItem.identificationNumber && title == otherItem.title && numberOfCopies
		== otherItem.numberOfCopies;
		}
		public void addItem(){
			numberOfCopies++;
		}
}
