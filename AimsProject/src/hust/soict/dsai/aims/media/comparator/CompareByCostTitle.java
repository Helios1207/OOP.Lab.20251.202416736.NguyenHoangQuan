package hust.soict.dsai.aims.media.comparator;

import java.util.Comparator;
import hust.soict.dsai.aims.media.Media;

public class CompareByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {
        return Comparator.comparing(Media::getCost, Comparator.reverseOrder()).thenComparing(Media::getTitle, String.CASE_INSENSITIVE_ORDER)
        .compare(m1, m2);
    }
}
