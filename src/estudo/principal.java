package estudo;

import java.util.Scanner;

public class principal {

	
	
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		
		
		
	
		
		System.out.println("---------------------------------------------------");
		System.out.println("DIGITE O NOME QUE DESEJA:");
		System.out.println("---------------------------------------------------");
		
		Integer valor = scan.nextInt();
		
		System.out.println("O VALOR QUE FOI ESCOLHIDO FOI: " + valor);
		
		
		System.out.println("A SOMA DO VALOR + 20 �: " + (valor + 20));
	
	}

}
