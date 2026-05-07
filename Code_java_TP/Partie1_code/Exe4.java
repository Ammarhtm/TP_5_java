package TP5;

public class Exe4 {

    public static void main(String[] args) {
        String chaine = "123a";

        try {
            int nombre = Integer.parseInt(chaine);
            System.out.println("Nombre = " + nombre);
        } catch (NumberFormatException e) {
            System.out.println("Erreur : la chaîne ne contient pas un entier valide.");
        }
    }
}
