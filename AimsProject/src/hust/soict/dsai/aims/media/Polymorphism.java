package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.*;

public class Polymorphism {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();

        Media dvd = new DigitalVideoDisc(1, "Star Wars", "Sci-fi", 20.5f, 124, "George Lucas");
        Media book = new Book(2, "Algorithms", "Education", 15.0f);
        Media cd = new CompactDisc(3, "Thriller", "Music", 18.0f, 42, "Quincy Jones", "Michael Jackson");

        mediaList.add(dvd);
        mediaList.add(book);
        mediaList.add(cd);

        for (Media m : mediaList) {
            System.out.println(m.toString());
        }
    }
}