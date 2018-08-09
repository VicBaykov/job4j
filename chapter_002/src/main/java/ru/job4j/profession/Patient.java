package ru.job4j.profession;

/**
 * Created by vicba on 09.08.2018.
 */
public class Patient {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Diagnose desease;

    public Diagnose getDesease() {
        return desease;
    }

    public void setDesease(Diagnose desease) {
        this.desease = desease;
    }
}
