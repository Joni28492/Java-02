/*



Ejercicio 10

El factorial de un entero n no negativo se escribe como n! y se define de la
siguiente manera:

n!= n (n-1) (n-2) ... 1

y

n! = 1 (para n = 0)

Escribe un programa 	que calcule el factorial del número que se le pasa, si es
negativo mensaje de error.

*/


import java.util.Scanner;



public class ejercicio10{
	
	
	public static int factorial(int n){
	
	
	
	if(n==0)	
	return 1;
		
	else 
	return n*factorial(n-1);
	

	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int n=0;
		
		System.out.printf("introduce un numero: \n");
		n=sc.nextInt();
		System.out.println("el factorial es");
		System.out.println(factorial(n));
		
		
	}
	

	
}
