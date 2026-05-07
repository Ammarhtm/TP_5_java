package TP5;

import java.util.List;
import java.util.Arrays;

public class Exe12Partie3 {

    static void afficherNombres(List<? extends Number> liste) {

        for (Number n : liste) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1, 2, 0);

        List<Double> l2 = Arrays.asList(9.1, 1.5);

        afficherNombres(l1);
        afficherNombres(l2);
    }
}