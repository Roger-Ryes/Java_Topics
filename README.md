# 1_CONSTRUCTORS
<p><strong>super():</strong>
	Utilizado con extends, invoco al constructor de la clase padre
	Esta implicito en el constructor
		Se colocar primero dentro del constructor
</p>
<p><strong>this():</strong>
 	Invoco al otro constructor de la misma clase
	Se debe colocar primero dentro del constructor
</p> 

# 2_APUNTADORES
<p>
Es una referencia que apunta a un objeto
Los objetos creados depende cuando se llama a la palabra clave "new"
</p>

# Clase Abstracta (extends)

Solo representa la firma de un metodo

Si la clase tiene un metodo "abstract", entonces toda la clase debe ser "abstract"

	Ver clase A_Figura.java

Si es una clase abstracta entonces, no se puede instanciar la clase

Clase abstracta, metodo solo con la firma y no el cuerpo (Dentro de {})
	
	public abstract double calcularPerimetro();



# Interface (implements)

Solo se definen metodos abstractos (Contienen solo la firma y no el cuerpo)

Es opcional colocar o no la palabra "abstract" en un metodo
	// Por defecto ya viene la palabra abstract
	public abstract void dibujar();
	public void dibujar();

La ventaja de usar interfaces en vez de las herencias, es que en java puedo llamar varias interfaces, una clase solo
se puede llamar una clase

	// Solo se puede llamar a una clase, no a dos
	// public class B_Paisaje extends A_Animal, A_Perro { // No posible

	// Puedo llamar a varias interfaces
	public class B_Paisaje extends A_Animal implements A_Dibujable, A_Lavable {



# Reglas Abstractas e Interfaces
Los metodos de las clases abstractas se implementan en las clases hijas
ver Res y Comible (5_Abstractas_Interfaces / com.cmc.reglas)

## Interface
- Todos los metodos deben ser abstractos
- Los metodos no necesitan el modificador abstract
- No hace falta poner el modificador abstract a la interface


## Abstractas
- Puede tener metodos abstractos e implementados
- Si el metodo no tiene implementacion se debe poner el modificador abstract
- Si hay un metodo abstracto en la clase, se debe poner el modificado abstracto en la clase


## Heredar los metodos de Interface, o no
Al implementar la interfaz se debe implementar los metodos de la interfaz
o
NO quedarse con la herencia de metodos y colocar a la clase en "abstract"
ver Dinero.java

	public abstract class Dinero implements Lavable{
		// Al implementar la interfaz se debe implementar los metodos de la interfaz
		// o
		// NO quedarse con la herencia de metodos y colocar a la clase en abstract
	}


# Modificador De Acceso
### Public
- Se puede acceder a los datos desde cualquier clase y de cualquier paquete

### Private
- Solo desde la misma clase

### Default
- Puede acceder a los datos desde la misma clase y miembros de clases del mismo paquete

### Protected
- Similar a Default y tambien se puede acceder desde las clases heredadas


### Gerarquia de re-estrictivo
| PUBLIC        |public String x;   |menos rees.|
| :---:   	| :-: 		    | :-: 	|
| PROTECTED     |protected String x;|		|
| :---:   	| :-: 		    | :-: 	|
| DEFAULT       |String x;	    |		|
| :---:   	| :-: 		    | :-: 	|
| PRIVATE       |private String x;  |mas rees.  |

ver en: 5_Abstractas_Interfaces | com.cmc.modificadorDeAcceso


# Sobreescribir un modificador de acceso

Se puede sobreescribir un modificador de acceso, pero solo se puede hacerlo menos reestrictivo

### Gerarquia de re-estrictivo
| PUBLIC        |public String x;   |menos rees.|
| :---:   	| :-: 		    | :-: 	|
| PROTECTED     |protected String x;|		|
| :---:   	| :-: 		    | :-: 	|
| DEFAULT       |String x;	    |		|
| :---:   	| :-: 		    | :-: 	|
| PRIVATE       |private String x;  |mas rees.  |

	Ejemplo 1                               Ejemplo 2

	class Padre{                            class Padre{
	    public void m1(){}                      void m1(){}     // Defaul
	}                                       }
	---Correct---                           ---Correct---
	class Hijo extends Padre{               class Hijo extends Padre{
	    public void m1(){}                       public void m1(){}
	}                                       }
	---Incorrect---                         ---Correct---
	class Hijo extends Padre{               class Hijo extends Padre{
	    protecter void m1(){}                   protecter void m1(){}
	}                                       }
	---Incorrect---                         ---Correct---
	class Hijo extends Padre{               class Hijo extends Padre{
	    private void m1(){}                     void m1(){}
	}                                       }
						---Incorrect---
						class Hijo extends Padre{
						    private void m1(){}
						}

### Interfaces
	class Test{
		void m1(){} // Default
	}
	interface Lavable(){
		public void m1()
	}
	interface COnvertible(){
		void m1(); // Es public no Defaul (Solo en interfaces)
	}
	// OJO: Si no coloco nada en una clase es un "Default", pero en una interface es un "Public"
	// EN interfaces no se puede colocar private o protected

# Estaticos
## Atributos Estaticos
Pertenecen a la CLASE, no se crean en cada objeto 
Como los estaticos pertenecen a la clase, se acceden asi
	NombreClase.atributoEstatico
	Count.valorStatic = 10

## Metodos Estaticos
En compilacion, se analizan los metodos estaticos
Un metodo estatico no puede acceder sin "apuntador" a un atributo del objeto

	// Incorrect
	public static void main(String[] args) { valor = 5 }
	// Correct
	public static void main(String[] args) { 
		Test t1 = new Test();
		t1.valor = 5;
	}
	//
	int valor;
    static int valueSta;
    public static void main(String[] args) {
		valor = 100; // Sin apuntador en metodo estatico

        A_AtributosEstaticos ae = new A_AtributosEstaticos();
        ae.valor = 100; // Con apuntador en metodo estatico

        valueSta = 10; // Al ser estatico puedo acceder en metodo estatico
    }
En un metodo estatico el "this", no funciona
	int a;
	void static test(){
		this.a = 20; // No vale, genera error de compilacion
	}
### Regla metodos estaticos
	public static void metodoEstatico(){
		System.out.println("");
	}

	public void metodoSimple(){
		System.out.println("");
	}

	public static void main(String[] args) {
		metodoSimple(); //Error Compilation, No puedo acceder al metodo si no es estatico

		metodoEstatico();
	}

## Import Estaticos
Al importar un statico no solo se llama a la clase, sino tambien al metodo

	import static java.lang.Math.random;
	import static java.lang.Math.abs;
	import static java.lang.Math.PI;
	import static java.lang.Integer.*;

	public class D_ImportsEstaticos {
		// Sin import
	//    double valor = Math.random();
	//    double valor2 = Math.abs(valor) + Math.PI;

	//    int x = Integer.parseInt("10");


		// Con import
		double valor = random();
		double valor2 = abs(valor) + PI;

		int x = parseInt("10");
	}