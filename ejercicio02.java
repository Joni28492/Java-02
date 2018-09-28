/*

Ejercicio 2

Utilizando bucles mostrar la tabla de multiplicar del número que se le solicite.
* /
* 
* */
import java.util.Scanner;


public class ejercicio02{
	
	
	
	
		public static void main (String args[]){
		
		int num=0;
		int cont=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce un numero");
		
			num=sc.nextInt();
			
				while(cont<=10){
					
					System.out.printf("%d   *   %d  = %d\n",num,cont, num*cont);
					cont++;
					
					}
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	}
