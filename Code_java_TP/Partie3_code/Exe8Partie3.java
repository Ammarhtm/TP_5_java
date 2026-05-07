package TP5;

class Animal<T> {
    T nom;
}

class Chien extends Animal<String> {

}

public class Exe8Partie3 {

    public static void main(String[] args) {

        Chien c = new Chien();

        c.nom = "Mix";

        System.out.println("Nom : " +c.nom);
    }
}