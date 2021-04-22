package senati;

// Importando la libreria para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instancia a la clase Scanner
		// Creado un objeto sc a partir de la clase Scanner
		Scanner sc = new Scanner(System.in);
		
		// Primero declaramos la variable
		int numero = 0;
		
		// Lectura, se usa solo print para la lectura de datos
		System.out.print("Ingrese número: ");
		numero = sc.nextInt();
		
		// Impresión
		System.out.println("\nNúmer Ingresado");
		System.out.println("-----------------");
		System.out.println("Número.....: " + numero);
	}

}



