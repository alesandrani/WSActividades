package actividad11;

public class MainVideojuego {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
		
		Videojuego v2 = new Videojuego("12698U", "The Last Of Us", 9, 29, "15.02.2013", false);
		System.out.println(v2.id);
		System.out.println(v2.nombre);
		System.out.println(v2.puntuacion);
		System.out.println(v2.precio);
		System.out.println(v2.fechaDeCreacion);
		System.out.println(v2.esDeSegundaMano);
		
		Videojuego v3 = new Videojuego("The Last Of Us", "15.02.2013");
		Videojuego v4 =  new Videojuego("12698U", "Fornite", 9, 50, "15.02.2013", false);
		v4.show();
		v4.namePoint();
		System.out.println("el precio en libras es :"+ v4.obtenerPrecioEnLibra());
		
		//v4.fecha("13/02/2013", "yyyy-MM-dd");
		v4.formatoFecha();
		System.out.println("el precio con descuento es : "+ v4.obtenerPrecioConDescuento() );
		v4.puntuacionApta();
		v4.nota();
		v4.juegoMasCaro(v4);
	}
	

}
