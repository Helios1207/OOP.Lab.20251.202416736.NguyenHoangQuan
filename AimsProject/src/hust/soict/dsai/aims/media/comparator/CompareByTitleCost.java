package hust.soict.dsai.aims.media.comparator;

import java.util.Comparator;
import hust.soict.dsai.aims.media.Media;

public class CompareByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {
        return Comparator.comparing(Media::getTitle, String.CASE_INSENSITIVE_ORDER).thenComparing(Media::getCost, Comparator.reverseOrder())
        .compare(m1, m2);
        }
}