package view;

import controller.FatorialController;
import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		FatorialController ft = new FatorialController(); 
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
//		int n = 5; 
		
		if(n==0) {
			System.out.println("O fatorial de " + n + " é 0");
		}else if(n>10||n<0) {
			System.out.println("Digite uma entrada válida!. Números entre 0 e 10.");
		}else {
			System.out.println("O fatorial de " + n + " é " + ft.fatorial(n)); 
		}
	}
}
