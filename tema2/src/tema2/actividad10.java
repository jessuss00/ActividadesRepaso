package tema2;

import java.util.Scanner;

public class actividad10 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Numero de niños");
		int alumnos = ac.nextInt();	
		
		if (alumnos >=100) {
			alumnos = alumnos *65;
			System.out.println("El costo sera de: "+alumnos);
		}else if (alumnos >=50&&alumnos<=99) {
			alumnos = alumnos *70;
			System.out.println("El costo sera de: "+alumnos);
		}else if (alumnos >=30&&alumnos<=49) {
			alumnos = alumnos *95;
			System.out.println("El costo sera de: "+alumnos);
		}else {
			System.out.println("El costo sera de: "+alumnos);
		}
	
	}

}
