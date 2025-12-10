package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	public int length;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	

	public Media(int id, String title, String category, float cost) {
	    this.id = id;
	    this.title = title;
	    this.category = category;
	    this.cost = cost;
	}
	
	public Media(int id, String title, String category, float cost, int length, String director) {
	    this.id = id;
	    this.title = title;
	    this.category = category;
	    this.cost = cost;

	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (!(obj instanceof Media)) return false;

	    Media other = (Media) obj;
	    return this.getTitle().equalsIgnoreCase(other.getTitle());
	}
	
	@Override
	public String toString() {
	    return this.getTitle() + " - " + this.getCategory() + " - " + this.getCost() + "$";
	}
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST =
	        new hust.soict.dsai.aims.media.comparator.CompareByTitleCost();

	public static final Comparator<Media> COMPARE_BY_COST_TITLE =
	        new hust.soict.dsai.aims.media.comparator.CompareByCostTitle();
}
