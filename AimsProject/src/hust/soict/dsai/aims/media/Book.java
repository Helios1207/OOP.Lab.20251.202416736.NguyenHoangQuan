package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
		
	public List<String> getAuthors() {
			return authors;
	}

	public void addAuthor(String authorName) {
		    if (!authors.contains(authorName)) {
		        authors.add(authorName);
		        System.out.println("Author added: " + authorName);
		    } else {
		        System.out.println("Author already exists");
		    }
	}
		
	public void removeAuthor(String authorName) {
			if (authors.contains(authorName)) {
				authors.remove(authorName);
				System.out.println("Author removed: " + authorName);
			} else {
				System.out.println("Author not found");
			}
	}
		
	public Book(int id, String title, String category, float cost) {
		super(id, title, category, cost);
	}
	    
	    @Override
	public String toString() {
	    	return "Book: " + this.getTitle() + " - " + this.getCategory() +
	               " - Authors: " + this.getAuthors() + " - " + this.getCost() + "$";
	}

}
