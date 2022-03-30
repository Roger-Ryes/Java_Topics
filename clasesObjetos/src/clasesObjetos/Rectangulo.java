package clasesObjetos;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularPerimetro () {
		int resultado = (2*base)*(2*altura);
		return resultado;
	}
	
	public int calcularArea () {
		int resultadoArea = (base)*(altura);
		return resultadoArea;
	}
	
	
}
