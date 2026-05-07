package TP5;

public class Exe8 {

    static void verifierAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Erreur : age inférieur à 18.");
        }

        System.out.println("age valide.");
    }

    public static void main(String[] args) {
        try {
            verifierAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}