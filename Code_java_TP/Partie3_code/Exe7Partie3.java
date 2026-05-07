package TP5;

public class Exe7Partie3 {

    public static <T extends Number> double somme(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {

        System.out.println(somme(10, 20));
        System.out.println(somme(5.9, 2.5));
    }
}