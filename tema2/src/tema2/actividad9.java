package tema2;

import java.util.Scanner;

public class actividad9 {

	public static void main(String[] args) {
		Scanner ac=new Scanner(System.in);
		System.out.println("Introduce el precio inicial de la uva");
		double precio = ac.nextDouble();
		System.out.println("Dime tipo de uva (a/b)");
		String tipo = ac.next();
		System.out.println("Dime su tamaño (1/2)");
		int tamaño = ac.nextInt();
		//tipo a
		if(tipo.equalsIgnoreCase("A")) {
			if(tamaño == 1) {
				precio = precio +0.2;
			}else if(tamaño ==2) {
				precio = precio +0.3; 
			}else {
				System.out.println("Tamaño de uva invalido");
			}
		}else {
			System.out.println("Tipo de uva no valido");
		}
		//tipo b
		if(tipo.equalsIgnoreCase("B")) {
			if(tamaño == 1) {
				precio = precio -0.3;
			}else if(tamaño ==2) {
				precio = precio -0.5; 
			}else {
				System.out.println("Tamaño de uva invalido");
			}
		}else {
			System.out.println("Tipo de uva no valido");
		}
		System.out.println("El precio final por kilo es:" + precio);

	}

}
