package actividad12;

public class MainCoche {

	public static void main(String[] args) {
		

		//La clase scanner tiene un problema, siempre que recojamos

		//un dato que no sea String y luego queráis recoger un String

		//tenéis que hacer un nextLine() extra

		Coche c1 = new Coche();

		Coche c2 = new Coche("65987","BMW", "serie 3", 60560, "23/02/2016", 160.562);

		

		//obtener el año de la matriculacion

		c2.obtenerAnioMatriculacion();

		//año bisiesto

		c2.anio_bisiesto();

		//precio km

		System.out.println("el precio de coche es :"+ c2.precioKm());

		//numero primo

		System.out.println("es numero primo?" +c2.esKilometrajePrimo());

		System.out.println(c2.calcularKilometrosFaltantes());

		c2.obtenerLongitudMarca();

		c2.obtenerLongitudModelo();

		c2.calcularDiferenciaKilometros(c1);

		c2.determinarCocheMasCaro(c1);

		}
}






		






