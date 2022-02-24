package estudo;

import java.util.ArrayList;
import java.util.List;

public class principal{

	
	
	
	
	public static void main(String[] args) {
		
		
		
		String num1 = "10";

		
		try {
			
			
			Integer numConvertido = Integer.valueOf(num1);
			
			int somar = numConvertido + 10;
			
			
			System.out.println(somar);
		}catch(Exception erro) {
			
			for(int cont = 0; cont < 50;cont++) {
				System.out.println("NÃO É POSSÍVEL CONVERTER " + num1 + " PARA INTEIRO");

			}
			

		}
		
		
	}
	
	

}
