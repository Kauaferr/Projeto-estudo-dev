package heranca_interface_abstract_class;

public abstract class Quadrado implements FiguraGeometrica{

	
	protected int lado;

	

	public int getLado() {
		return lado;
	}



	public void setLado(int lado) {
		this.lado = lado;
		
	}

	
	public int pegarArea( ) {
		
		int area = this.lado * this.lado;
		
		return area;
	}

	
	public static void realizarSoma(int valor1, int valor2) {
		
		int soma = valor1 + valor2;
		
		System.out.println("O VALOR DA SOMA É: " + soma);
	}

	
	public int realizarSomaReturn(int valor1, int valor2) {
		
		int soma = valor1 + valor2;
		
		System.out.println("O VALOR DA SOMA É: " + soma);
		
		
		return soma;
		
		
	}
	@Override
	public int getArea() {

		
		return 0;
	}
	
	@Override
	public String getNomeFigura(String nome, String nome2) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public int getPerimetro() {
	// TODO Auto-generated method stub
	return 0;
}
}
