package com.senati.eti;
//TODO Auto-generated method stub
		import java.util.Scanner;
		//Importamos scanner para que lea los datos ingresados
		import java.text.DecimalFormat;
		//De igual manera importamos decimal para limitar los decimales
public class Caso17 {

	public static void main(String[] args) {
	
         //Definimos el scanner y la limitacion de decimales
		        Scanner sc = new Scanner(System.in);
		        DecimalFormat df = new DecimalFormat("#.00");
		        
		        
		        //Solicitamos los datos
		        System.out.print("Ingrese numero de aprobados: ");
		        int aprob = sc.nextInt();
		        
		        System.out.print("Ingrese numero de desaprobados: ");
		        int dsprob = sc.nextInt();
		        
		        System.out.print("Ingrese numero de retirados: ");
		        int retrds = sc.nextInt();
		        
		        //Realizamos las operaciones
		        int tlt = (aprob+dsprob+retrds);
		        float ap = (aprob*100)/tlt;
		        float dp = (dsprob*100)/tlt;
		        float rp = (retrds*100)/tlt;
		        
		        //Expresamos la salida de datos
		        System.out.println("\n============"); 
		        System.out.println("Resultados");
		        System.out.println("=============="); 
				System.out.println("Aprobados: " +  df.format(ap)+"%");
				System.out.println("Desaprobados: " +  df.format(dp)+"%");
				System.out.println("Retirados: " +  df.format(rp)+"%");
		        
		        
			}

	

}

	



