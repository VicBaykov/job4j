package ru.job4j.tracker;

/**
 * Created by vicba on 17.08.2018.
 */
public class StartUI {
    private ConsoleInput input = new ConsoleInput();
    private Tracker tracker = new Tracker();
    private static final String COMMAND_ADD = "0";
    private static final String COMMAND_SHOW_ALL = "1";
    private static final String COMMAND_EDIT = "2";
    private static final String COMMAND_DELETE = "3";
    private static final String COMMAND_FIND_BY_ID = "4";
    private static final String COMMAND_FIND_BY_NAME = "5";
    private static final String COMMAND_EXIT = "6";

    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Инициализирует меню взаимодействия
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (COMMAND_ADD.equals(answer)) {
                this.createItem();
            } else if (COMMAND_SHOW_ALL.equals(answer)) {
                this.showAllItems();

            } else if (COMMAND_EDIT.equals(answer)) {
                this.replaceItem();

            } else if (COMMAND_DELETE.equals(answer)) {
                this.deleteItem();

            } else if (COMMAND_FIND_BY_ID.equals(answer)) {
                this.findItemById();

            } else if (COMMAND_FIND_BY_NAME.equals(answer)) {
                this.findItemByName();

            } else if (COMMAND_EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Создает заявку
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + " добавлена!-----------");
    }

    /**
     * Выводит их на экран все элементы.
     */
    private void showAllItems() {
        Item[] items = this.tracker.findAll();
        System.out.println("------------ Отобразить все заявки --------------");
        for (Item item : items) {
            System.out.println(item.toString());
            System.out.println("-------------------------------------------------------");
        }

    }

    /**
     * Редактирование элемента с выбранным ID
     */
    private void replaceItem() {
        System.out.println("------------ Замена заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        if (this.tracker.replace(id, item)) {
            System.out.println("------------ Заявка с Id : " + item.getId() + " изменена-----------");
        } else {
            System.out.println("Item not found");
        }
    }

    /**
     * Удаление элемента с выбранным ID
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        if (this.tracker.delete(id)) {
            System.out.println("------------ Заявка с Id : " + id + " удалена-----------");
        } else {
            System.out.println("Item not found");
        }
    }

    /**
     * Вывод на экран элемента с выбранным ID
     */
    private void findItemById() {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите id заявки :");
        System.out.println("----------------- Результат ------------------");
        Item item = this.tracker.findById(id);
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Item not found");
        }
        System.out.println("----------------------------------------------");
    }

    /**
     * Вывод на экран всех элементов с выбранным именем
     */
    private void findItemByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        System.out.println("------------------ Результат --------------------");
        for (Item item : this.tracker.findByName(name)) {
            System.out.println(item.toString());
            System.out.println("---------------------------------------------");
        }
    }

    /**
     * Отображение меню взаимодействия.
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Добавление новой заявки");
        System.out.println("1. Отобразить все заявки");
        System.out.println("2. Замена заявки");
        System.out.println("3. Удаление заявки");
        System.out.println("4. Поиск заявки по ID");
        System.out.println("5. Поиск заявки по имени");
        System.out.println("6. Выход");

    }

    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
