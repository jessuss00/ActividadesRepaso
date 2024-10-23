package tema2;

import java.util.Scanner;

public class actividad7 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		System.out.println("Dime un año");
		int ano = ac.nextInt();
		if ((ano%4==0 && ano %100!=0)||(ano%100==0&&ano%400==0)) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}

	}

}
