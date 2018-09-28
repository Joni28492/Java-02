/*
Ejercicio 6

Un palíndromo es una secuencia de caracteres que se lee igual al derecho y al
revés. Por ejemplo: 12321,55555, 45554 y 11611. Escriba una aplicación que lea
un entero de cinco dígitos y determine si es un palindromo. Si el número no es
de cinco dígitos que muestre un mensaje de error y cuando desaparezca el mensaje
que vuelva a pedir otro número.
*/

import java.util.Scanner;


public class palindromo{
	
	
	
	
		public static void main(String args[]){
			
			int n=0;
			int n2=0;
			Scanner sc=new Scanner(System.in);
			
			do{
			System.out.printf("introduce un numero de 5 cifras: \n");
			n=sc.nextInt();
			}while(n<10000 || n>99999);
			
			n2=n;	//ejemplo 12521
			n2=n2-(n%10000);//se queda en 4 cifras  2521
			n2=n2-(n%10);//utlima cifra a 0    2520
			n2/=10; //se queda en 3 cifras	252
			
			
			
				//pos1 = pos5			pos 2 = pos4
			if( (n/10000 == n%10)  &&  (n2/100 == n2%10)  )
			System.out.println("es un palindromo");
			else
			System.out.println("no es un palindromo");
			
		
			
		}
		
}
