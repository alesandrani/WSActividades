package actividad11;


public class Videojuego {
	String id;
	String nombre;
	double puntuacion;
	double precio;
	String fechaDeCreacion;
	boolean esDeSegundaMano;

	public Videojuego() {
		this.fechaDeCreacion = "01/01/1970";
		System.out.println("la fecha de creacion es :" + this.fechaDeCreacion);

	}

	public Videojuego(String id, String name, double point, double price, String dateOfCreation, boolean secondHand) {
		this.id = id;
		this.nombre = name;
		this.puntuacion = point;
		this.precio = price;
		this.fechaDeCreacion = dateOfCreation;
		this.esDeSegundaMano = secondHand;
	}

	public Videojuego(String name, String dateOfCreation) {
		this.nombre = name;
		this.fechaDeCreacion = dateOfCreation;
		System.out.println("nombre de videojuego es :" + this.nombre);
		System.out.println("fecha de creacion de videojuego es:" + this.fechaDeCreacion);
	}

	// opcion de mostrar los datos por pantalla
	public void show() {
		System.out.println(this.id);
		System.out.println(this.nombre);
		System.out.println(this.puntuacion);
		System.out.println(this.precio);
		System.out.println(this.fechaDeCreacion);
		System.out.println(this.esDeSegundaMano);
	}

	// mostrar su nombre y puntuacion
	public void namePoint() {
		System.out.println("el nombre es:" + this.nombre);
		System.out.println("la puntuacion: " + this.puntuacion);
	}

	// precio en libras
	public double obtenerPrecioEnLibra() {
		double precioEnLibras = 0;
		precioEnLibras = this.precio * 0.86;
		return precioEnLibras;
	}

	// formato fecha
	public void formatoFecha() {
		String date = "01/01/1970";
		String [] array= date.split("/");
		String nuevaFecha = array[2] + "-" + array[1]+ "-"+ array[0];
		System.out.println(nuevaFecha);
	}
	public double obtenerPrecioConDescuento() {

		boolean segundaMano = true;
		if (segundaMano) {
			// Aplicar un 30% de descuento si es de segunda mano
			return precio * 0.7;
		} else {
			// Si no es de segunda mano, devolver el precio original
			return precio;

		}

	}
	// Los objetos tendrán la opción de mostrar si un videojuego es apto para jugar
	// o no.
	// Un videojuego es apto para jugar si su puntuación es de 5 o mas.

	public void puntuacionApta() {
		if (this.puntuacion >= 5) {
			System.out.println("el juego es apto para jugar");
		} else {
			System.out.println("el juego no es apto para jugar");

		}
	}

	// Los objetos tendrán la opción de mostrar todos los números
	// naturales que hay entre su nota y el número 10

	public void nota() {
		if (this.puntuacion <= 10) {
			System.out.println("Números naturales entre " + this.puntuacion + " y 10:");
			for (double i = this.puntuacion; i <= 10; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("la puntuacion tiene que ser entre 0 y 10");
		}
	}
	
	public boolean juegoMasCaro(Videojuego OtroVideojuego) {
		if(this.precio > OtroVideojuego.precio ) {
			System.out.println(this.nombre + "es mas caro que: " + OtroVideojuego.nombre);
			return true;
		}else {
			System.out.println(OtroVideojuego.nombre + "es mas caro que :" + this.nombre);
			return false;
		}
	}
	
	public void mostrarPuntuacionHastaElDiez() {
		int iPuntuacion=(int)this.puntuacion;
		for(int i =iPuntuacion;i<=10;i++) {
			System.out.println(i);
		}
	}
}
