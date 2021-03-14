package com.senati.eti;
import java.text.DecimalFormat; 
//importamos el decimal format para delimitar ls decimales
public class Caso7 {
	public static void main(String[] args) {
			
			//Definimos una variable df para aplicar el limite de el decimal
			//Luego realizamos la respectiva operacion
			//Colocando su respectivo parentesis
			DecimalFormat df = new DecimalFormat("#.0");
			float rp =  (float) (( ((17*2) + (float)Math.pow(3,2)-6) / 5 ) +(float) -2 *(4.7+(1.2*-2)));
			    
			    //Mostramos los resutados
				System.out.println("\n========= Resultados ==========");
				System.out.println("Respuesta..........: " + df.format(rp));
			}

}
