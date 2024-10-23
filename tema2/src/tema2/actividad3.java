package tema2;

import java.util.Scanner;

public class actividad3 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Dime una letra");
		String letra = ac.next();
		
		if(letra.length()!=1) {
			System.out.println("No as introducido una letra");
		}

	}

}
