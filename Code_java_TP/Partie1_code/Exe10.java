package TP5;

public class Exe10 {
	public class Exe10A {

	    static void verifierAge(int age) throws Exception {
	        if (age < 18) {
	            throw new Exception("Erreur : age invalide.");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            verifierAge(16);
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}
	


	public class Exe10B {

	    static void verifierAge(int age) {
	        if (age < 18) {
	            throw new RuntimeException("Erreur : age invalide.");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            verifierAge(16);
	        } catch (RuntimeException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

}
