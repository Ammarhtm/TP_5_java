package TP5;

public class Exe5 {

    static int racineCarree(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Erreur : x doit être positif.");
        }

        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Racine = " + racineCarree(-9));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}