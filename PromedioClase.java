
/*
 * 
 * 
 * 
 * 
 * 
 * */
 
 import java.util.Scanner;

public class PromedioClase{
	
	
	
	public static void main (String  args[]){
		
		int numAlumnos=0;
		int alumnos=0;
		int nota=0;
		int total=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce el numero de alumnos");
		numAlumnos=sc.nextInt();
		
		
			while(alumnos<numAlumnos){
				
				do{
				System.out.println("introduce tu nota: ");
				nota=sc.nextInt();}while(nota<0 || nota>10);
				
				
				total+=nota;
				
				System.out.printf("el acumulado del total es %d\n", total);
				alumnos++;
				
			}
		
		
			System.out.printf("el promedio de la clase es de %f\n", (float)total/alumnos);
		
	}
}
