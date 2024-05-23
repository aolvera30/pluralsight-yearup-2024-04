package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    // Constructor that sets the maximum size of the list
    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    // Method to add an item to the list
    public void add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
        } else {
            throw new IllegalStateException("Cannot add more items, list is full.");
        }
    }

    // Method to get all items in the list
    public List<T> getItems() {
        return new ArrayList<>(items);
    }

}
