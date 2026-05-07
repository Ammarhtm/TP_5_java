package TP5;

class QuotaDepasseException extends Exception {
    public QuotaDepasseException(String message) {
        super(message);
    }
}

public class Exe7Partie2 {

    static void telechargerFichier(double taille) throws QuotaDepasseException {
        double limite = 100;

        if (taille > limite) {
            throw new QuotaDepasseException("Erreur : quota dépassé.");
        }

        System.out.println("Téléchargement autorisé.");
    }

    public static void main(String[] args) {
        try {
            telechargerFichier(150);
        } catch (QuotaDepasseException e) {
            System.out.println(e.getMessage());
        }
    }
}