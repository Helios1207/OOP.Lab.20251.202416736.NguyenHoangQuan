import java.util.Objects;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public String getTitle() {
        return title;
    }

    public float getCost() {
        return cost;
    }

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public boolean isMatch(String title){
        return Objects.equals(title, this.title);
    }

    
}
