package com.senati.eti;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Ingrese Horas trabajadas: ");
        int hrs = sc.nextInt();
        
        System.out.print("Ingrese tarifa por hora: ");
        float trf = sc.nextFloat();
        
        float sld = hrs * trf;
        double dsc = sld * 0.95;
        double bn = sld-dsc;
        double dlr = sld*3.24;
        
        
        System.out.println("\n---------------------");
        System.out.println("Resultados " );
        System.out.println("---------------------");
        System.out.println("Sueldo: " +sld);
        System.out.println("Bono: "+bn);
        System.out.println("Sueldo en dolares: "+df.format(dlr));
        
	}

}
