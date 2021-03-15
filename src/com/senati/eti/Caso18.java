package com.senati.eti;
import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese Altura : ");
        float alt = sc.nextFloat();

        System.out.print("Ingrese base : ");
        float bs = sc.nextFloat();
        
        float area = (bs*alt)/2;
        

        System.out.println("\n---------------------");
        System.out.println("Resultados " );
        System.out.println("---------------------");
        System.out.println("Área del rectangulo: "+ area);
      
	}

}
