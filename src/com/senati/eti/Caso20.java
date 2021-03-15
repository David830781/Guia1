package com.senati.eti;
import java.util.Scanner;
public class Caso20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Incremente el valor de una venta en 42%.	
				//variables
				double valor, incre,total;
				Scanner sc=new Scanner(System.in);
				System.out.println("ingresa el valor de venta: ");
				valor=sc.nextDouble();
				//incrementamos en un 42% =0.42  (42/100)*valor
				incre=(valor*0.42);
				total=(incre+valor);
				//salida de datos o mostrar pantalla
				System.out.println("el valor de una venta en 42% es: "+total);
	}

}
