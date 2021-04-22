package senati;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int base, altura, perimetro;
		
		System.out.print("Ingresar base: ");
		base= sc.nextInt();
		
		System.out.print("Ingresar altura: ");
		altura= sc.nextInt();
		
		perimetro=2 * (base + altura);
		
		System.out.println("El perimetro del triangulo es...: " + perimetro);
		
	}

}
