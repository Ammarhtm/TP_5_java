package TP5;

public class Exe6Partie3 {

    public static <T> void afficherTableau(T[] tableau) {

        for (T element : tableau) {
            System.out.println(element);
        }
    }

    public static <T> T getPremier(T[] tableau) {
        return tableau[0];
    }

    public static void main(String[] args) {

        Integer[] tab = {1, 2, 3};

        afficherTableau(tab);

        System.out.println("Premier = " + getPremier(tab));
    }
}