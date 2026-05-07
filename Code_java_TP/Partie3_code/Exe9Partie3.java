package TP5;

class Vehicule<T> {
    T vitesse;
}

class Voiture<T> extends Vehicule<T> {

}

public class Exe9Partie3 {

    public static void main(String[] args) {

        Voiture<Integer> v = new Voiture<>();

        v.vitesse = 220;

        System.out.println("LA VITESSE EST : " +v.vitesse);
    }
}