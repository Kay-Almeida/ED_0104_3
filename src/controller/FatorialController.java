package controller;

import br.org.Kay_Almeida.pilhaint.*;

public class FatorialController {
		
	public FatorialController () {
		
	}
	
	public long fatorial(int n) {
		Pilha p = new Pilha(); 
		
		for(int i = 1; i<n; i++) {
			p.push(i);
		}
		
		long soma = n;  
		
		while(!p.isEmpty()) {
			try {
				soma =+ soma * p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
		return soma; 
		
	}
	
}