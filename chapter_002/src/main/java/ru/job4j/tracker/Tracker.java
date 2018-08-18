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

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.pos; i++) {
            if ((items[i] != null) && (this.items[i].getId().equals(id))) {
                item.setId(id);
                this.items[i] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.items.length; i++) {
            if ((items[i] != null) && (this.items[i].getId().equals(id))) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                pos--;
                result = true;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, pos);
    }

    public Item[] findByName(String key) {
        Item[] itemByName = new Item[items.length];
        int i = 0;
        for (Item item : items) {
            if ((item != null) && item.getName().equals(key)) {
                itemByName[i++] = item;
            }
        }
        return itemByName;
    }

    public Item findById(String id) {
        Item itemTmp = null;
        for (Item item : items) {
            if ((item != null) && (item.getId().equals(id))) {
                itemTmp = item;
            }
        }
        return itemTmp;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() * RND.nextInt());
    }
}
