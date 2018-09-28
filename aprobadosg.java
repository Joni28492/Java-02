/*


aprobados interfaz grafica
*/

import javax.swing.*;



public class aprobadosg{
	
	
	
	
		public static void main(String args[]){
		
			int alumnos=10;
			int contador=0;
			int succes=0;
			int fail=0;
			int res=0;
			
				while (contador<=10){
				
					res=Integer.parseInt(JOptionpane.showInputDialog(null,"introduce nota"));
					
					if(res>=5) succes++;
					else fail++;
			
				
				contador++;
				
				}
		
		JOptionPane.showMessageDialog(null, "hay %d aprobados y %d suspensos", succes, fail);
		
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
}
