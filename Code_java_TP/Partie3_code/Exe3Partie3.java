package TP5;

interface Calcul<T> {
    T addition(T a, T b);
}

class CalculInteger implements Calcul<Integer> {

    public Integer addition(Integer a, Integer b) {
        return a + b;
    }
}

class CalculDouble implements Calcul<Double> {

    public Double addition(Double a, Double b) {
        return a + b;
    }
}

public class Exe3Partie3 {

    public static void main(String[] args) {

        CalculInteger c1 = new CalculInteger();
        System.out.println("la somme 1 est : "+ c1.addition(10, 20));

        CalculDouble c2 = new CalculDouble();
        System.out.println("la somme 2 est : "+c2.addition(6.7, 2.5));
    }
}