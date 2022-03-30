package clasesObjetos;

public class TestEncapsulamiento {

	public static void main(String[] args) {
		Encapsulamiento e = new Encapsulamiento();
		//Asignar valores
		e.setNombre("Roger");
		e.setEdad(24);
		e.setAltura(2.00);
		//Tomar valores
		String nombre = e.getNombre();
		int edad = e.getEdad();
		double altura = e.getAltura();
		//Asignar valores
		System.out.println("nombre: "+ nombre);
		System.out.println("altura: "+ altura);
		System.out.println("edad: "+ edad);
		

	}

}
