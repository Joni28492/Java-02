/*



Ejercicio 7

Escriba una aplicación que utilice sólo las instrucciones de salida

System.out.print ("* ");
System.out.print (" ");
System.out.println ();

para mostrar el patrón de tablero de damas que se muestra a continuación.

* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
* * * * * * * *
  
Observe que una llamada al método System.out.println sin argumentos hace que el
programa imprima un solo carácter de nueva linea.





*/


public class ejercicio07{
	
		public static void main(String args[]){
		
		
			int i=0;
			int j=0;
			
			
				for(i=1; i<=8;i++){
				
				
					for(j=1;j<=8;j++){
						
						System.out.print ("* ");
							
					}
				
				System.out.println ();
				}
			

		}
	

}
