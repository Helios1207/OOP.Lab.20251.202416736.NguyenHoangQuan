package hust.soict.dsai.aims.screen;

import java.awt.GridLayout;
import javax.swing.*;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.store.Store;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    JTextField tfTitle, tfCategory, tfCost;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add CompactDisc");

        setLayout(new GridLayout(4, 2));

        tfTitle = new JTextField();
        tfCategory = new JTextField();
        tfCost = new JTextField();

        JButton btnAdd = new JButton("Add");

        btnAdd.addActionListener(e -> {
            CompactDisc compactdisc = new Book(
                tfTitle.getText(),
                tfCategory.getText(),
                Float.parseFloat(tfCost.getText())
            );
            store.addMedia(book);
            dispose();
        });

        add(new JLabel("Title")); add(tfTitle);
        add(new JLabel("Category")); add(tfCategory);
        add(new JLabel("Cost")); add(tfCost);
        add(btnAdd);

        setSize(300,200);
        setVisible(true);
    }
}

