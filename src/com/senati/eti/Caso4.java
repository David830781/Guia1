package com.senati.eti;
import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
	        float n1 =0,n2= 0;
	        
	        System.out.println("Primer numero........: ");
	        n1 = sc.nextFloat();
	        
	        System.out.println("Segundo numero......: ");
	        n2 = sc.nextFloat();
	        
	        float suma = n1 + n2;
	        float resta = n1 - n2;
	        float multiplicacion = n1 * n2;
	        float Division = n1 / n2;
	        float resto = n1 % n2 ;
	        
	        System.out.println("\n========= Resultados ==========");
			System.out.println("Suma..........: " + suma);
			System.out.println("Resta..........: " + resta);
		    System.out.println("Resta..........: " + multiplicacion);
		    System.out.println("Resta..........: " + Division);
		    System.out.println("Resto entero..........: " + resto);
	}



	}


