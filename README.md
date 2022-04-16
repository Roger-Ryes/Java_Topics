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


# Exceptions
## Tipos Exceptions
### Checked
Son las que molestan en compilacion en cada punto
|Ejm: 	IOException		|
|:---: 				|
|	 WhateverException	|	

### Unchecked o RunTimeException
Solo muestra el erro una vez se corra el proyecto
|Ejm:	ArrayIndexOutOfBoundsException	|
|:---: 					|
|	NullPointerException		|

## Lanzar Exceptiones
	public void throwExceptionOne(int x) throws Exception{
		if (x<0){
			throw new Exception(); // Checked
		}
	}

	public void throwExceptionTwo(int y) {
		if (y<0){
			throw new RuntimeException(); // Unchecked
		}
	}

## Tratar Exceptiones
- Envolverlo en un try/catch
	A_Lanzar thr = new A_Lanzar();
	try{
		thr.throwExceptionOne(20);
	}catch (Exception e){
		e.printStackTrace();
	}
- Propagar la exception (throws Exception)

	public void tryExceptionTwo() throws Exception {
		// spread this exception, First method
		A_Lanzar thr = new A_Lanzar();
		thr.throwExceptionOne(20);
	}

SI una clase se hereda de una exception, entonces esa clase es una excepcion
Ver (B_heredarException y A_TratarException)

Exception
|- RunTimeException
|- IOException
|- WhateverException

# Flujo Exception
El orden de la exceptiones influye dependiendo de la jerarquia.
Primero van los hijos, luego los padres
	
	// Correcto
	try {
		System.out.println("Start");
		value.toLowerCase();
		num[1] = "2";
		System.out.println("End");
	} catch (NullPointerException ex) {
		System.out.println("Execute catch");
		ex.printStackTrace();
	} catch (Exception ex){
		System.out.println("Execute catch General");
		ex.printStackTrace();
	} finally {
		// Siempre entra al "finally", con o sin exception
		System.out.println("Entro al finally");
	}
	// Incorrecto
	try {
		System.out.println("Start");
		value.toLowerCase();
		num[1] = "2";
		System.out.println("End");
	} catch (Exception ex){
		System.out.println("Execute catch General");
		ex.printStackTrace();
	} catch (NullPointerException ex) {
		System.out.println("Execute catch");
		ex.printStackTrace();
	}


# Tipos de datos
## Primitivos
    byte by = 0;    // 8 ocupa bites
    short sh = 0;   // 16
    int in = 0;     // 32
    long lo = 0;    // 64

    float f = 0;    // 32
    double d = 0;   // 64

    char c='a';     //16

    boolean boo = true; // 1


En un contenedor (byte) no se puede colocar algo mas grande (int)
	
	byte by = 0;     // 8 ocupa bites
	int in = 0;      //32

    	by=in;		// No se puede

Un "entero" puedo guardar en un "flotante"
        f = lo;

A un "char" se le puedo mandar codigo ASCII
        c=123;
        
Un char se puede guardar en un entero
        in = c;

Flotantes
        
	f=10;
        f=10.10; // Es un Double, un double es mayor a un float
        d=10.10;

Existen algunos sufijos para indicar explicitamente el tipo de dato
        
	f=10.10f; 	// f/F, float
        d= 100.110D;	// d/D, double
        lo=10L;		// l/L,	long

## Casting
Ya que en un contenedor (byte) no se puede colocar algo mas grande (int), se castea
	
	by = (byte)in;
	fl = (float)100.1;

## Operadores
	"Suma"
        num1 + num2 + num3

        // Cuando se junta un string, se concatena
        "Concatenacion: "+num1 + num2 + num3
        
		// Para que sume y concatene
        "ConcatenacionYSuma: "+(num1 + num2 + num3)

## Valor Por Defecto
	byte by;     // 0
        short sh;    // 0
        int in;      // 0
        long lo;     // 0

        float fl;    // 0.0
        double db;   // 0.0

        char ch;     // u0000 "Espacio en blanco"

        boolean bl; // false

## Wrappers
Son clases que envuelven un valor primitivo.
Al ser clases, el valor por defecto de un atributo wrapper es NULL 
Es declaran con mayusculas, y no hay para "char"
		
	Byte by;     // 0
        Short sh;    // 0
        Int in;      // 0
        Long lo;     // 0

        Float fl;    // 0.0
        Double db;   // 0.0

        Boolean bl; // false
En operaciones de wrappers, se debe usar equals y no ==
		
	Integer i1 = 1200;
        Integer i2 = 1200;
        // No apuntan al mismo objeto
        if(i1==i2){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }

        // Usar equals a usar wrappers
        if(i1.equals(i2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }


## Unboxing
Implicitamente llama al metodo
		
	Integer i1= 100; // Internamente i1 = new Integer(100)

        // unboxing Permite que se comporte como un primitivo
        int i2 = i1; // Unboxing | internamente i2 = i1.intValue();

## Constructores
Dependiendo del tipo van a aceptar su tipo o valores de string
		
	Short sh = new Short((short)0);
        Short sh1 = new Short("10");

        Long lg = new Long("20");

        Float ft = new Float(10.10D);

        Boolean bl0 = new Boolean(false);
        Boolean bl1 = new Boolean("true");
        Boolean bl2 = new Boolean("True");
        Boolean bl3 = new Boolean("Python");

## Sobrecarga
Busca el metodo exacto, del atributo de dato exacto	
Si no encuentra el dato del atributo, se va al primitivo mas grande (de "int" va a "long")
Si no encuentra hace BOXING y busca su WRAPPER correspondiente ("double" va a "Integer")
Si no encuentra el wrapper especifico busca una clase padre del Wrapper (Numbre, Object)
ver (A_SobreCargaData)

    public void m1(int x){
	System.out.println("int");
    }
    public void m1(Integer x){
        System.out.println("Integer");
    }
    public void m1(long x){
        System.out.println("long");
    }
	public void m1(Object x){
        System.out.println("Object");
    }

    public void m1(Number x){
        System.out.println("Number");
    }

    public static void main(String[] args) {
        int x = 100;
        long y = 100;
        double z = 100;
        A_SobreCargaData a_sobre = new A_SobreCargaData();
        a_sobre.m1(x);
        a_sobre.m1(y);
        a_sobre.m1(z);
    }

# String
## String
String es inmutable. Los metodos de String DEVUELVEN UN NUEVO String, no modifica el String original
	
	String a = "abc"; // abc
        String result = a.toUpperCase(); // ABC
	
## StringBuffer
StringBuffer si es inmutable. Los metodos de StringBuffer NO DEVUELVEN UN NUEVO String, MODIFICA EL STRING
Se debe inicializar
        
	StringBuffer sb = new StringBuffer("test");
        StringBuffer sb = "asd"; // NO se puede, se debe instanciar
	
### Constructor StringBuffer
	// Asigno un valor
	StringBuffer sb2 = new StringBuffer("Hola mundo");
	// Asigno la capacidad (.capacity)
	StringBuffer sb3 = new StringBuffer(5);
	
## toString - Convertir StringBuffer a String
	StringBuffer val = new StringBuffer(5);
        val.append("Hola ");
	 String con = val.toString();

## StringBuffer y StringBuilder
Tienen los mismos metodos.
StringBuffer es ThreadSafe, es decir tiene metodos Synchronized, lo que permite que en un esquema multihilos,
si exista un metodo de un objeto accedido por multiples hilos a la vez, solo uno puede entrar y el otro
espera hasta que el primero termine

## Metodos equivalentes
| String        			| StringBuffer/StringBuilder					|
| :---:   				| :---:		    						|
| str.concat("va")			| sb.append("va");						|
|str.replace("origin", "toReplace")	|sb.replace(init,end, "text"); //init: NoIncluida, end: Incluido|

## Metodos NO equivalentes
	// Origin: Hola mundo programer
	// Delete
		sb1.delete(5, 10); 		// Hola  programer
        // Insert
		sb1.insert(6, "COLADO");	// Hola  COLADOprogramer
        // Reverse
        	sb1.reverse();			// remargorpODALOC  aloH

## Metodos Comunes
Se usan igual tanto para String, StringBuffer y StringBuilder
	
	// Origin: Hola mundo java metodos comunes
	// CharAt
        	sb1.charAt(9)			// o

        // IndexOF
        	sb1.indexOf("do")		// 8
        	sb1.indexOf("do", 12) 	// 20
        
	// length
        	sb1.length()			// 32

	// SubString
		String ret = sb1.substring(2, 10);	// la mundo
En StringBuffer y StringBuilder al usar "substring", se debe guardar en otra variable

## Equals en String, StringBuffer/StringBuilder
String: Sobreescribe "equals" para comparar el contenido de la cadena
StringBuffer/StringBuilder: NO SOBREESCRIBE equals
ver E_MetodoEquals

## Metodos Solo en String
		// Origin: " Hola Mundo ";
		// Trim
			cadena.trim();			// "Hola Mundo"
		// isEmpty
			cadena.isEmpty());		// false

		// equals
			"Hola Mundo".equals("hOla mUndo") 		// false
		// equalsIgnoreCase
			"Hola Mundo".equalsIgnoreCase("hOla mUndo")	// true, ignora el case

## Resumen Metodos
| String        	| Similar	|StringBuffer/StringBuilder	|
| :---:   		| :---:		|:---:				|
|trim			|length		|delete				|
|toUpperCase		|charAt		|insert				|
|toLowerCase		|indexOf	|				|
|isEmpty		|"substring"	|reverse			|
|replace		|equals		|replace			|
|equalsIgnoreCase	|		|				|

# Compilacion y ejecucion por consola
java -version
javac

## Ejecutar un archivo
|Comando		|Definicion													|
| :---:   		| :---:		   												|
|javac NameText.java	| Este comando compila, creando el archivo "Class" este se puede ejecutar en cualquier SO (Multiplataforma)	|
|java NameText		| Ejecuta el archivo "Class" creado										|

## Paso de parametros
	java ClassName Parametro1 Parametro2 Parametro...
	Ejm:
	java Test true abc "Hola mundo"



# LocalDate y LocalDateTime
## Instanciar
### Local Date 
No tiene constructor accesible
	
	// First instance
	LocalDate ld = LocalDate.now();

        // Second instance
	ld = LocalDate.of(2020,8,20);
        
        // Third instance
	ld = LocalDate.of(2020, Month.FEBRUARY, 18);

	// Time Exception
	ld = LocalDate.of(2020, Month.FEBRUARY, 33); 	// Se ejecuta cada vez que sale del rango

### Local Date Time
No tiene un constructor
        
	// First intance
        LocalDateTime ldt1 = LocalDateTime.now(); 		// yyyy-MM-ddThh:mm:ss.ms
        
        // Second instance
        LocalDateTime ldt2 = LocalDateTime.of(2020,3,15,3,50); 	// yyyy-MM-ddThh:mm
        
        // Third instance
        LocalDateTime ldt3 = LocalDateTime.of(2021, Month.AUGUST,26,8,00, 50, 4); // yyyy-MM-ddThh:mm:ss.ms

## Operaciones con fechas
El LocalDate es inmutable, al igual que String, la fecha original no cambia, devuelve una nueva fecha
        
	//LocalDate
		LocalDate ld1 = LocalDate.now();
		//Days
			LocalDate ld2 = ld1.plusDays(20); // No modifica el locaDate origina, devuelve una nueva locaDate

		//Month
			LocalDate ld3 = ld1.plusMonths(12);

		//Year
			LocalDate ld4 = ld1.plusYears(20);

        //LocalDateTime
        	LocalDateTime ldt1 = LocalDateTime.now();
        	//Months
        		LocalDateTime ldt2 = ldt1.plusMonths(5);

        	//Hours
        		LocalDateTime ldt3 = ldt1.plusHours(9);

        	//Minutess
        		LocalDateTime ldt4 = ldt1.plusMinutes(120);

## Obtener informacion
		LocalDate ld1 = LocalDate.now(); // 2022-04-15
        	// Year
			ld1.getYear()); 	// 2022
        	// Month
			ld1.getMonth()); 	// APRIL
        	// MonthValue
			ld1.getMonthValue()); 	// 4
        	// DayOfMonth
			ld1.getDayOfMonth()); 	// 15
        	// DayOfYear
			ld1.getDayOfYear()); 	// 105
        	// DayOfWeek
			ld1.getDayOfWeek()); 	// FRIDAY

## Conversiones
 	// Convert LocalDate to LocalDateTime
        LocalDate ld1 = LocalDate.of(2021, Month.DECEMBER,10);		// 2021-12-10
	     // First Method
    		LocalDateTime ldtConver = ld1.atStartOfDay();		// 2021-12-10T00:00

	     // Second Method
    		LocalDateTime ldtConver2 = ld1.atTime(12, 30);		// 2021-12-10T12:30

	// Convert LocalDateTime to LocalDate
	LocalDateTime ldt1 = LocalDateTime.of(2020,Month.APRIL, 15, 23, 00);	//2020-04-15T23:00
	LocalDate ldConvert = ldt1.toLocalDate();				//2020-04-15

	// Convert LocalDateTime to LocalTime
	LocalDateTime ldt1 = LocalDateTime.of(2020,Month.APRIL, 15, 23, 00);	//2020-04-15T23:00
	LocalTime ltConvert = ldt1.toLocalTime();				//23:00

## Comparaciones
	LocalDate ld1 = LocalDate.of(2020, 12, 4);
        LocalDate ld2 = LocalDate.of(2020, 12, 5);
        LocalDate ld3 = LocalDate.of(2020, 12, 4);

	// Compara la fecha, si esta despues de otra fecha
        	ld1.isAfter(ld2)	// True
       
	// Compara si las fechas son iguales
        	ld1.isEqual(ld3)	// True
        	ld1.equals(ld3)		// True

## Formato
	// LocalDate
		// Formatos por defecto
 		LocalDate ld1 = LocalDate.of(2021, Month.MAY, 16);
        	String ft1 = ld1.format(DateTimeFormatter.ISO_LOCAL_DATE);
        	String ft2 = ld1.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        
		// Diseño propio de formato
        	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        	String fdesing = ld1.format(dtf1);
        	

	// LocalDateTime
		// Formatos por defecto
		LocalDateTime ldt1 = LocalDateTime.now();
        	String fld1 = ldt1.format(DateTimeFormatter.ISO_DATE_TIME);

		// Diseño propio de formato
        	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm:ss MMMM yyyy");
        	String fdesigner= ldt1.format(dtf1);

## Parse
Permite convertir de String a LocalDate o LocalDateTime
	
	// Parse LocalDate
	  // Con formato por defecto
		String date1 = "2021-10-20";
		LocalDate ld = LocalDate.parse(date1); 		// formato ISO_DATE por defecto
		String date2 = "20211020";
		LocalDate ld2 = LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE); // Establecer formato

      	  // Parse Diseñado
		String dateDesig = "2020/01/12";
		LocalDate ldDesig = LocalDate.parse(dateDesig, DateTimeFormatter.ofPattern("yyyy/dd/MM"));
        

	// Parse LocalDateTime
        	String dateTime1 = "2020-12-08T12:30";
        	LocalDateTime ldt1 = LocalDateTime.parse(dateTime1); // formato ISO_DATE_TIME por defecto
        	LocalDateTime ldt2 = LocalDateTime.parse(dateTime1, DateTimeFormatter.ISO_DATE_TIME); // ISO_DATE yyyy-MM-ddT:hh:mm
        
