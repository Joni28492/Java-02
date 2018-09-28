/*
 * promedio clase2 centinela -1
 * */
 
 import java.util.Scanner;
 
 public class PromedioClase2{
	 
	 
	 
	 public static void main(String args[]){
		 
	
	
		int total=0;//suma de las notas
		int contador=0;//numero de notas introducidas
		int calificacion=0; //la nota introducida
		
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("introduce -1 para terminar: ");
		calificacion=sc.nextInt();
		
		
			//centinela -1
			while(calificacion!=-1){
				
				total+=calificacion;
				contador++;
				
				System.out.println("introduce -1 para terminar: ");
				calificacion=sc.nextInt();
			
			}
			
			
												//5.2 5 caracteres con 2 decimales
			if(contador!=0)
			System.out.printf("el promedio es %.2f", (double)total/contador);
			else
			System.out.printf("no se han introducido notas");
			
			
			
			
		
			
		 
	}
	 
}
