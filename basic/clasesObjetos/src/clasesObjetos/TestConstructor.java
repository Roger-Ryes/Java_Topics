package clasesObjetos;

public class TestConstructor {
	public static void main(String[] args) {
		Constructor c = new Constructor("Roger", 23, 1.70);
		double altura = c.getAltura();
		int edad = c.getEdad();
		String nombre = c.getNombre();
		System.out.println("Constructor con parametros");
		System.out.println(nombre+" - "+edad+" - "+altura);
		 
		Constructor c2 = new Constructor();
		String nombre2 = c2.getNombre();
		double altura2 = c2.getAltura();
		int edad2 = c2.getEdad();
		System.out.println("Constructor vacio");		
		System.out.println(nombre2+" - "+edad2+" - "+altura2);
		
	}
}
