package heranca_interface_abstract_class;

public class Triangulo extends Quadrado implements FiguraGeometrica{
	

	Quadrado quadrado;
	
	
	
	
	
	public int getArea() {
		System.out.println("peguei 2");
		
		return 20;
	}
	
	
	public int getPerimetro() {
		System.out.println("peguei3");
		
		return 20;
	}
	
	
}
