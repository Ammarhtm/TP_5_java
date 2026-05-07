package TP5;

class StockInsuffisantException extends Exception {
    public StockInsuffisantException(String message) {
        super(message);
    }
}

class Produit {
    private int stock;

    public Produit(int stock) {
        this.stock = stock;
    }

    public void retirerDuStock(int quantite) throws StockInsuffisantException {
        if (quantite > stock) {
            throw new StockInsuffisantException("Erreur : stock insuffisant.");
        }

        stock -= quantite;
        System.out.println("Stock restant = " + stock);
    }
}

public class Exe6Partie2 {
    public static void main(String[] args) {
        Produit p = new Produit(10);

        try {
            p.retirerDuStock(15);
        } catch (StockInsuffisantException e) {
            System.out.println(e.getMessage());
        }
    }
}