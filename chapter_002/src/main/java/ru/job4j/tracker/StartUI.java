package ru.job4j.tracker;

/**
 * Created by vicba on 17.08.2018.
 */
public class StartUI {
    private ConsoleInput input = new ConsoleInput();
    private Tracker tracker = new Tracker();
    private final String ADD = "0";
    private final String SHOW_ALL = "1";
    private final String EDIT = "2";
    private final String DELETE = "3";
    private final String FIND_ITEM_BY_ID = "4";
    private final String FIND_ITEM_BY_NAME = "5";
    private final String EXIT = "6";

    public StartUI(ConsoleInput input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW_ALL.equals(answer)) {
                this.showAllItems();

            } else if (EDIT.equals(answer)) {
                this.replaceItem();

            } else if (DELETE.equals(answer)) {
                this.deleteItem();

            } else if (FIND_ITEM_BY_ID.equals(answer)) {
                this.findItemById();

            } else if (FIND_ITEM_BY_NAME.equals(answer)) {
                this.findItemByName();

            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + " добавлена!-----------");
    }

    private void showAllItems() {
        Item[] items = this.tracker.findAll();
        System.out.println("------------ Отобразить все заявки --------------");
        for (Item item : items) {
            System.out.println("ID заявки:  |" + item.getId());
            System.out.println("Имя заявки: |" + item.getName());
            System.out.println("Описание:   |" + item.getDescription());
            System.out.println("-------------------------------------------------------");
        }

    }

    private void replaceItem() {
        System.out.println("------------ Замена заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
        System.out.println("------------ Заявка с Id : " + item.getId() + " изменена-----------");
    }

    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        this.tracker.delete(id);
        System.out.println("------------ Заявка с Id : " + id + " удалена-----------");
    }

    private void findItemById() {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите id заявки :");
        System.out.println("ID заявки:  |" + this.tracker.findById(id).getId());
        System.out.println("Имя заявки: |" + this.tracker.findById(id).getName());
        System.out.println("Описание:   |" + this.tracker.findById(id).getDescription());
        System.out.println("-------------------------------------------------------");
    }

    private void findItemByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        System.out.println("ID заявки:  |" + this.tracker.findByName(name).getId());
        System.out.println("Имя заявки: |" + this.tracker.findByName(name).getName());
        System.out.println("Описание:   |" + this.tracker.findByName(name).getDescription());
        System.out.println("-------------------------------------------------------");

    }

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
