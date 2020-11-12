package chapter6;

import java.util.ArrayList;

public class Student {
	
	private String Name;
	ArrayList<Book> bookList; 
	
	public Student(String name) {
		this.Name = name;
		
		bookList = new ArrayList();	
	}
	
	public void addBook(String name) {
		Book book = new Book(name);
		
		bookList.add(book);
	}
	
	public void showBookInfo() {
		System.out.print(Name + "학생이 읽은 책은  : " );
		for (Book book : bookList) {
			System.out.print(book.getName() + " ");
		}
		System.out.println("입니다.");
	}
}
