package ru.job4j.profession;

/**
 * Created by vicba on 09.08.2018.
 */
public class Doctor extends Profession {
    public Diagnose heal(Patient patient) {
        return patient.getDesease();
    }
}
