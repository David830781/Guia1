package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     
		 float n1 =0,n2= 0;
		 
		 System.out.println("Primer numero........: ");
	       n1 = sc.nextFloat();
	        
	     System.out.println("Segundo numero......: ");
	        n2 = sc.nextFloat();
	        
	        double prom = (n1+n2)/2;
	        double aume = n1*1.20;
	        double dism1 = n2*0.30;
	        double dism = n2-dism1;
	        
	        System.out.println("\n========= Resultados ==========");
			System.out.println("Resultado 1..........: " + prom);
			System.out.println("Resultado 2..........: " + aume);
			System.out.println("Resultado 3..........: " + dism);
	}

}
