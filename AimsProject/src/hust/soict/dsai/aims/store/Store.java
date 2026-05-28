package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
            itemsInStore.add(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been added to the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" already exists in the store.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("The media \"" + media.getTitle() + "\" has been removed from the store.");
        } else {
            System.out.println("The media \"" + media.getTitle() + "\" does not exist in the store.");
        }
    }

    public void print() {
        System.out.println("***********************STORE***********************");
        System.out.println("Items in store:");
        for (Media media : itemsInStore) {
            System.out.println(media.toString());
        }
        System.out.println("***************************************************");
    }
}