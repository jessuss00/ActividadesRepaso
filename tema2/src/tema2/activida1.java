package tema2;

import java.util.Scanner;

public class activida1 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Dime un numero: (a)");
		int a = ac.nextInt();
		System.out.println("Dime otro numero. (b)");
		int b = ac.nextInt();
		if(b!=0) {
			System.out.println(a/b);
		}else {
			System.out.println("El numero B no puede ser 0 ");
		}

	}

}
