package tema2;

import java.util.Scanner;

public class actividad2 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Usuario:");
		String usuario = ac.next();
		System.out.println("Contraseña");
		String contraseña = ac.next();

		if (usuario.equals("Vladi")) {
			if (contraseña.equals("daw")) {
			} else {
				System.out.println("Contraseña mal");
			}
		} else {
			System.out.println("Usuario mal");
		}
	}
}
