package TP5;

class Boite<T> {

    private T contenu;

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }

    public T getContenu() {
        return contenu;
    }
}

public class Exe1Partie3 {

    public static void main(String[] args) {

        Boite<String> b1 = new Boite<>();
        b1.setContenu("Bonjour ammar elhatimy");

        Boite<Integer> b2 = new Boite<>();
        b2.setContenu(1235325);

        System.out.println(b1.getContenu());
        System.out.println(b2.getContenu());
    }
}