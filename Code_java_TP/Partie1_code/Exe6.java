package TP5;

class Machine {
    private boolean on = false;

    public void demarrer() {
        if (on) {
            throw new IllegalStateException("Erreur : la machine est déjà démarrée.");
        }

        on = true;
        System.out.println("Machine démarrée.");
    }
}


public class Exe6 {
    public static void main(String[] args) {
        Machine m = new Machine();

        try {
            m.demarrer();
            m.demarrer();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}