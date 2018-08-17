package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Created by vicba on 17.08.2018.
 */
public class ConsoleInput {

    public String ask(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine();
    }
}
