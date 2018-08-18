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

    /**
     * Добавляет элемент
     * @param item новый добавляемый элемент
     * @return Возвращает добавленный элемент.
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.pos++] = item;
        return item;
    }

    /**
     * Редактирует элемент с выбранным id
     * @param id идентификатор редактируемого элемента.
     * @param item редактируемый элемент
     * @return Возвращает true если редактирование завершено успешно, false - если нет.
     */
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

    /**
     * Удаляет элемент с выбранным id
     * @param id идентификатор редактируемого элемента.
     * @return Возвращает true если удаление завершено успешно, false - если нет.
     */
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

    /**
     * Возвращает массив всех элементов
     * @return Возвращает массив всех не null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, pos);
    }

    /**
     * Возвращает массив всех элементов с выбранным именем
     * @param key имя по которому надо произвести выборку.
     * @return Возвращает массив всех элементов с именем key
     */
    public Item[] findByName(String key) {
        Item[] itemByName = new Item[this.pos];
        int countSameName = 0;
        for (int i = 0; i < this.pos; i++) {
            if (this.items[i].getName().equals(key)) {
                System.arraycopy(this.items, i, itemByName, countSameName, 1);
                countSameName++;
            }
        }
        return Arrays.copyOf(itemByName, countSameName);
    }

    /**
     * Возвращает элемент с выбранным id
     * @param id идентификатор по которому надо произвести выборку.
     * @return Возвращает элемент с выбранным id
     */
    public Item findById(String id) {
        Item itemTmp = null;
        for (Item item : items) {
            if ((item != null) && (item.getId().equals(id))) {
                itemTmp = item;
            }
        }
        return itemTmp;
    }

    /**
     * Генерирует уникальный идентификатор id
     * @return Возвращает уникальный id
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() * RND.nextInt());
    }
}
