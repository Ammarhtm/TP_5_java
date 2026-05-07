package TP5;

import java.util.Scanner;

public class Exe3 {

    static void accederAvecIf(int[] tab, int index) {
        if (index >= 0 && index < tab.length) {
            System.out.println("Valeur = " + tab[index]);
        } else {
            System.out.println("Erreur : index invalide");
        }
    }

    static void accederAvecTry(int[] tab, int index) {
        try {
            System.out.println("Valeur = " + tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : index hors limites");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = {1, 9, 6, 4, 5};

        System.out.print("Entrez un index : ");
        int index = sc.nextInt();

        accederAvecIf(tab, index);
        accederAvecTry(tab, index);

        sc.close();
    }
}