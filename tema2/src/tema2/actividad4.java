package tema2;

import java.util.Scanner;

public class actividad4 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Dime tu nota");
		int nota = ac.nextInt();
		System.out.println("Dime tu edad: ");
		int edad = ac.nextInt();
		System.out.println("Dime como tienes la matricula(S/P)");
		String matricula = ac.next();
		
		if (nota>=5 && edad >= 18 && matricula.equalsIgnoreCase("s") ) {
			System.out.println("Aceptada");
		}else if(nota>=5 && edad >= 18 && matricula.equalsIgnoreCase("p")) {
			System.out.println("Posible");
		}else {
			System.out.println("No aceptada");
		}
	}

}
