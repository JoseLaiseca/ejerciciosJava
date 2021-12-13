package numeroFibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//   '''Devuelve la serie de Fibonacci '''
		    ArrayList <Integer> fibonacci  = new ArrayList<>();
		    
		    
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Ingrese el numero: "); 
		    Integer num = sc.nextInt();
		    
		    
		    int suma;
		    int aux ;
		    int aux1 ;
		  
		    aux = num - 1;
		    aux1 = num; 
		    
		    if (num > 2) { 
		            fibonacci.add(num);    
		            for (int i = 0; i <10 ; i ++ ) {     	
		                suma = aux + aux1;
		                aux = aux1; 
		                aux1 = suma;
		                fibonacci.add(suma); 
		            }
		            }
		    else { 
		                System.out.println("Ingrese un valor mayor a 2"); 

		    }
		            
		    		
		System.out.println(fibonacci); 
		

	}

}
