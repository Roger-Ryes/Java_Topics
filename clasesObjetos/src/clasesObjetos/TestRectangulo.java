package clasesObjetos;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		System.out.println("r1 base: "+r1.base);
		System.out.println("r2 base: "+r2.base);
		
		int resp = r1.calcularPerimetro();
		System.out.println("Perimetro: "+resp);
		
		r1.base = 10;
		r1.altura = 20;
		int resp1 = r1.calcularPerimetro();
		System.out.println("Perimetro1: "+resp1);
		int resp1a = r1.calcularArea();
		System.out.println("Perimetro1: "+resp1a);
	}

}
