/*
Ejercicio 9

Desarrolle una aplicación en Java que determine el sueldo bruto para cada
empleado. La empresa paga la cuota normal en las primeras 40 horas de trabajo y
paga cuota y media para el resto de horas. El programa le pedira el número de
trabajadores. Y para cada trabajador el número de horas trabajadas, y la tarifa
para cada hora. Debera de mostrar el sueldo bruto para cada trabajador.

*/


//num trabajadores
	//num horas
//40primeras horas cuota normal, luego media
//tarifa por cada hora
import java.util.Scanner;

public class ejercicio09{
	
	
		public static void main(String args[]){
		
		
			int trabajadores=0;
			int horas=0;
			float tarifa=0;
			int i=0;
			float total=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.printf("introduce el numero de trabajadores:\n");
			trabajadores=sc.nextInt();
			System.out.printf(" a cuanto pagaras la hora\n");
			tarifa=sc.nextFloat();
			
			
				for(i=1; i<=trabajadores; i++){
					
					//horas que trabaja cada trabajador
					System.out.printf("cuantashoras ha trabajado el trabajador %d\n",i);
					horas=sc.nextInt();
					
					
						if(horas>40){
						
							total=40*tarifa;
							
							total+=((horas-40)*(tarifa/2));
						}
						
						else total=horas*tarifa;
					
					
					
					System.out.printf("el trabajador %d ha trabajado %d horas y cobra %.2f\n\n", i,horas, total);	
				}
			
			

		
		}
	
	

	
}
