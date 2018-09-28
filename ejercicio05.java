/*
Ejercicio 5

Escribir una aplicación que utilice ciclos para imprimir la siguiente tabla de
valores:

N		10*N		100*N		1000*N

1		10			100		1000
2		20			200		2000
3		30			300		3000
.		.			.			.
.		.			.			.
*/


public class ejercicio05{
	
	
	
	
		public static void main(String args[]){
			
			int n=1, count=5;
			
			
			System.out.printf("N\t10*N\t100*N\t1000*N\n\n");
				while(n<=count){
					
					System.out.printf("%d\t%d\t%d\t%d\n",n, n*10, n*100,n*1000);
				
					
					n++;
							
				}
	
			
		}
	

	
}
