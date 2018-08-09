package ru.job4j.fit;

/*
 *Fit.
 *
 *@author Victor Baykov (vic.baykov89@gmail.com)
 *@version $Id$
 *@since 0.1
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        return ((height - 100) * 1.15);
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return ((height - 100) * 1.15);
    }
}
