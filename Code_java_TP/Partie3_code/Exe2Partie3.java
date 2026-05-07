package TP5;

class Paire<T, U> {

    private T premier;
    private U second;

    public Paire(T premier, U second) {
        this.premier = premier;
        this.second = second;
    }

    public void afficherPaire() {
        System.out.println("Premier = " + premier);
        System.out.println("Second = " + second);
    }
}

public class Exe2Partie3 {

    public static void main(String[] args) {

        Paire<String, Integer> p =
                new Paire<>("Ammar", 20);

        p.afficherPaire();
    }
}
