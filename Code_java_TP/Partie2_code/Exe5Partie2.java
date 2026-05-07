package TP5;

class AuthentificationException extends Exception {
    public AuthentificationException(String message) {
        super(message);
    }
}

public class Exe5Partie2 {

    static void login(String username, String password)
            throws AuthentificationException {

        if (!username.equals("admin") || !password.equals("1234")) {
            throw new AuthentificationException("Identifiants incorrects");
        }

        System.out.println("Connexion réussie.");
    }

    public static void main(String[] args) {
        try {
            login("ammar", "0000");
        } catch (AuthentificationException e) {
            System.out.println(e.getMessage());
        }
    }
}