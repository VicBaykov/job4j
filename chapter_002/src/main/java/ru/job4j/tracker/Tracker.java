package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by vicba on 16.08.2018.
 */
public class Tracker {
    private Item[] items = new Item[100];
    private int pos;

    private static final Random RND = new Random();

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.pos++] = item;
        return item;
    }

    public void replace(String id, Item item) {
        for (int i = 0; i < this.pos; i++) {
            if ((this.findById(id) != null) && (this.items[i].getId().equals(id))) {
                item.setId(id);
                this.items[i] = item;
                break;
            }
        }
    }

    public void delete(String id) {
        for (int i = 0; i < this.pos; i++) {
            if ((this.findById(id) != null) && (this.items[i].getId().equals(id))) {
                System.arraycopy(this.items, i + 1, items, i, this.pos - i - 1);
                pos--;
            }
        }
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, pos);
    }

    public Item findByName(String key) {
        for (Item item : items) {
            if ((item != null) && item.getName().equals(key)) {
                return item;
            }
        }
        return null;
    }

    public Item findById(String id) {
        for (Item item : items) {
            if ((item != null) && (item.getId().equals(id))) {
                return item;
            }
        }
        return null;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() * RND.nextInt());
    }
}
