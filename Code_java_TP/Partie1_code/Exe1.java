package TP5;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Exe1 {

		public static float div(int a,int b) {
            if (b==0) {
            	throw new ArithmeticException("Erreur : Division par zéro impossible.");
            }  
		      return (float) a/b;

		}         	

	
	 public static void main(String[] args) {			 
		    Scanner sc = new Scanner(System.in);

		    try {
		        System.out.print("Entrez le premier entier : ");
		        int num = sc.nextInt();

		        System.out.print("Entrez le deuxième entier : ");
		        int diviseur = sc.nextInt();

		        float result = div(num, diviseur);
		        
		        System.out.println("res = " + result);

		    } catch (ArithmeticException e) {
		        System.err.println(e.getMessage());

		    } catch (InputMismatchException e) {
		        System.err.println("Erreur : Vous devez saisir des nombres entiers valides.");
          }
	 }
	
	
	
	
	
	
	
	
	
}


