package nroPrimo;

import java.util.Scanner;

public class porCiento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = sc.nextInt();
		
		int cont = 0; 

		for (int i = 1; i <= numero ; i++) {
			if (numero % i == 0) {
				cont += 1;
			}
		}
		
		if (cont > 2 ) {
			System.out.println("El numero es compuesto : " + numero ) ;
		} else {
			System.out.println("El numero es primo"); 
		}

	}


}
