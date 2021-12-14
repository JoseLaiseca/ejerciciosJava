package palabraPalindromo;


import java.util.Scanner;

public class Main {

	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Ingrese la una palabra: "); 
		String palabra = sc.nextLine(); 
		
		
		
	//	System.out.println(esPalindromo(palabra)); 
		
		if (esPalindromo(palabra) == true) {
			System.out.println(" La palabra " + palabra + " es palindromo"); 
		}
		else if  (esPalindromo(palabra) == false) {
				System.out.println("La palabra " + palabra + " no es polindromo" ); 
		}
		else {
			System.out.println("Error");
		}

	}
		
	// En esta funcion compara letra por letra y devuelve un booleano
	
	public static boolean esPalindromo(String palabra) {
	
		for(int i = 0, j = palabra.length() -1 ; i <= j  ; i++, j-- ) { 	
						if (palabra.charAt(i) == palabra.charAt(j)) {
				return true;
			
		}
	}
		return false;
}}
