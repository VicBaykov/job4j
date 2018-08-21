package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Created by vicba on 17.08.2018.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {
        System.out.println(question);
        return this.scanner.nextLine();
    }
}
