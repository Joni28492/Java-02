/*


Ejercicio 4

El proceso de encontrar el valor más grande se utiliza frecuentemente en
aplicaciones de ordenador. Escribir un programa que reciba como entrada una
serie de 10 números de un solo dígito como caracteres, y que determine e imprima
el mayor de los números.

*/

import java.util.Scanner;

public class ejercicio04{
	
	
	
		public static void main(String args[]){
			
			Scanner sc=new Scanner(System.in);
			int mayor=Integer.MIN_VALUE; //mayor=Integer.MIN_VALUE;
			int num=0;
			int count=0;
					while(count<10){
						
						do{
						System.out.printf("introduce numero\n");
						num=sc.nextInt();}while(num<-9 || num>9);
						
						if(mayor<num) mayor=num;
						
					count++;
						
					
					
					}
			
				System.out.printf("el numero %d es el mayor", mayor);
		
		}
	
		
}
