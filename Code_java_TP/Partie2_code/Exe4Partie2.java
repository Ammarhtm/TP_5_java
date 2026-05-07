package TP5;

class EmailInvalideException extends Exception {
    public EmailInvalideException(String message) {
        super(message);
    }
}

class AgeInvalideException extends Exception {
    public AgeInvalideException(String message) {
        super(message);
    }
}

public class Exe4Partie2 {

    static void inscrire(String email, int age)
            throws EmailInvalideException, AgeInvalideException {

        if (email == null || !email.contains("@")) {
            throw new EmailInvalideException("Erreur : email invalide.");
        }

        if (age < 18) {
            throw new AgeInvalideException("Erreur : age invalide.");
        }

        System.out.println("Inscription réussie.");
    }

    public static void main(String[] args) {
        try {
            inscrire("ammargmail.com", 16);
        } catch (EmailInvalideException | AgeInvalideException e) {
            System.out.println(e.getMessage());
        }
    }
}