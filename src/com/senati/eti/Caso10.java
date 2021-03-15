package com.senati.eti;
import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Radio: ");
		int r = sc.nextInt();
		
		double pi = 3.1416; 
		double area = (int) pi * Math.pow(r, 2);
		double perimetro = 2 * pi * r;
		
		System.out.println("\n========= RESULTADO ==========");
		System.out.println("area...........: "   + area);
		System.out.println("perimetro......: "   + perimetro);
	}

}
