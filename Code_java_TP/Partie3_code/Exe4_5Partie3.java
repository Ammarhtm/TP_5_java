package TP5;

interface Comparateur<T> {
    int comparer(T a, T b);
}

class ComparateurInteger implements Comparateur<Integer> {

    public int comparer(Integer a, Integer b) {
        return a.compareTo(b);
    }
}

class ComparateurString implements Comparateur<String> {

    public int comparer(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

public class Exe4_5Partie3 {

    public static void main(String[] args) {

        ComparateurInteger ci = new ComparateurInteger();
        System.out.println(ci.comparer(10, 20));

        ComparateurString cs = new ComparateurString();
        System.out.println(cs.comparer("sgdbgs", "aaaaa"));
    }
}