package tema2;

import java.util.Scanner;

public class actividad5 {

	public static void main(String[] args) {
		Scanner ac = new Scanner(System.in);
		
		System.out.println("Dame el punto X1");
		int x1 = ac.nextInt();
		System.out.println("Dame el punto y1");
		int y1 = ac.nextInt();
		System.out.println("Dame el punto X2");
		int x2 = ac.nextInt();
		System.out.println("Dame el punto Y2");
		int y2 = ac.nextInt();
		System.out.println("Dame el punto R1");
		int r1 = ac.nextInt();
		System.out.println("Dame el punto R2");
		int r2 = ac.nextInt();
		double Xcuadrado = Math.pow((x1+x2),2);
		double Ycuadrado = Math.pow((y1+y2),2);
		double distancia = Math.sqrt(Ycuadrado+Xcuadrado);
		int diferencia = Math.abs(r2-r1);
		
		if(distancia>(r1+r2)) {
			System.out.println("Exteriores");
		}else if(distancia==(r1-r2)) {
			System.out.println("Tangentes exteriores");
		}else if(distancia<(r1+r2)&&distancia>diferencia) {
			System.out.println("Secantes");
		}else if(distancia==diferencia) {
			System.out.println("Tangantes interiores");
		}else if(distancia>0&&distancia <diferencia) {
			System.out.println("Interiores");
		}else if(distancia==0) {
			System.out.println("Concentricasd");
		}

	}

}
