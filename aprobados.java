/*

meter diez notas, y nos diga los aprobados y suspensos
*/

import java.util.Scanner;

public class aprobados{
	
	
		public static void main(String args[]){
		
			int alumnos=10;
			int contador=1;
			int succes=0;
			int fail=0;
			int res=0;
			Scanner sc=new Scanner(System.in);
		
		
			while(contador<=alumnos){
				
				
				do{
				System.out.println("introduce nota");
				res=sc.nextInt();
				}while(res<0 || res>10);
				
					if(res>=5) succes++;
					else fail++;
				
				contador++;	
			}
			
			
			System.out.printf("hay %d aprobados y %d suspensos",succes, fail);
		
		}	
}
