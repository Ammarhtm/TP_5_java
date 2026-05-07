package TP5;

class PaiementRefuseException extends Exception {
    public PaiementRefuseException(String message) {
        super(message);
    }
}

class CarteExpireeException extends Exception {
    public CarteExpireeException(String message) {
        super(message);
    }
}

public class Exe9Partie2 {

    static void payer(double montant, boolean carteExpiree)
            throws PaiementRefuseException, CarteExpireeException {

        double plafond = 5000;

        if (carteExpiree) {
            throw new CarteExpireeException("Erreur : carte expirée.");
        }

        if (montant > plafond) {
            throw new PaiementRefuseException("Erreur : paiement refusé.");
        }

        System.out.println("Paiement accepté.");
    }

    public static void main(String[] args) {
        try {
            payer(6000, false);
        } catch (PaiementRefuseException | CarteExpireeException e) {
            System.out.println(e.getMessage());
        }
    }
}