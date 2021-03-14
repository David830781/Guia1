package com.senati.eti;
import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero.....: ");
		int n = sc.nextInt();
        
		//5-> 5 + 4 + 3 + 2 + 1 = 15
				//(5 x (5+1))/2 -> 15
		int sumatoria = (n * (n+1))/2;
				
		System.out.println("\n======== Resultados ===========");
		System.out.println("Sumatoria: "+ sumatoria);

	}

}
