package com.day4;

class LibraryBook {
	private String title;
	private String author;
	private boolean issued = false;
	
	public LibraryBook(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public boolean isIssued() {
		return issued;
	}
	
	public void issue() {
		if(isIssued()) {
			System.out.println("Book is already issued.");
			return;
		}
		issued = true;
		System.out.println("Book issued successfully.");
	}
	
	public void returnBook() {
		if(!isIssued()) {
			System.out.println("To return book make a book issue.");
		}
		issued = false;
		System.out.println("Book returned successfully.");
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}

public class Q11Library {

	public static void main(String[] args) {
		LibraryBook b = new LibraryBook("1984", "Orwell");
		b.issue();      
		b.issue();     
		b.returnBook();
	}

}
