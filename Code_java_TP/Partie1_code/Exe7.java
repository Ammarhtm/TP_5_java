package TP5;

public class Exe7 {

    static void C() {
        throw new ArithmeticException("Exception lancée dans C");
    }

    static void B() {
        C(); // B ne gère pas l'exception
    }

    static void A() {
        try {
            B();
        } catch (ArithmeticException e) {
            System.out.println("A a géré l'exception : " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        A();
    }
}