package hust.soict.dsai.aims.disc;

import java.util.Objects;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public int getId(){return id;}

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

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
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

    public DigitalVideoDisc(int id, String director, String category, String title, float cost) {
        this.id = id;
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
        nbDigitalVideoDiscs ++;
        this.id = nbDigitalVideoDiscs;
    }

    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }

    public boolean isMatch(String title){
        return this.title.equalsIgnoreCase(title);
    }

}
