package TP5;

public class Exe2 {
	static void lengthch(String s) {
		if(s!=null) {
			System.out.println("la longeur : "+s.length());
		}
		else {
			System.out.println("NULL");
			
		}
	}
	static void lengthch_avec_try(String s) {
		 try {
			 System.out.println("la longeur : "+s.length());
		 }catch(NullPointerException e){
			 System.out.println(e.getMessage());
			 
		 }
		
	}
	
	 public static void main(String[] args) {
		    Exe2.lengthch(null);          // sans try/catch
		    Exe2.lengthch_avec_try(null); // avec try/catch
		 
	 }

}

