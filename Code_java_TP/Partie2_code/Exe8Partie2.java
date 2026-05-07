package TP5;

class ChampObligatoireException extends Exception {
    public ChampObligatoireException(String message) {
        super(message);
    }
}

public class Exe8Partie2 {

    static void validerFormulaire(String nom, String email)
            throws ChampObligatoireException {

        if (nom == null || nom.isEmpty()) {
            throw new ChampObligatoireException("Erreur : le nom est obligatoire.");
        }

        if (email == null || email.isEmpty()) {
            throw new ChampObligatoireException("Erreur : l'email est obligatoire.");
        }

        System.out.println("Formulaire valide.");
    }

    public static void main(String[] args) {
        try {
            validerFormulaire("", "test@gmail.com");
        } catch (ChampObligatoireException e) {
            System.out.println(e.getMessage());
        }
    }
}