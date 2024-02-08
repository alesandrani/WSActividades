package actividad10;

public class Main {

	public static void main(String[] args) {
		Coche c1= new Coche();
		c1.marca = "BMW";
		c1.modelo = "Serie 7";
		c1.matricula = "197KFC";
		c1.peso = 2525;
		c1.antiguedad = 2;
		c1.esElectrico = true;
		
		Coche c2 = new Coche();
		c2.marca = "Toyota";
		c2.modelo = "GR Supra";
		c2.matricula = "195KLC";
		c2.peso = 1470;
		c2.antiguedad = 1;
		c2.esElectrico = false;
		
		Coche c3 = new Coche();
		c3.marca = "Ferrari";
		c3.modelo = "250GT Berlinetta";
		c3.matricula = "195KLC";
		c3.peso = 1050;
		c3.antiguedad = 62;
		c3.esElectrico = false;
		
		imprimir(c1);
		imprimir(c2);
		imprimir(c3);
	}
		public static void imprimir(Coche c) {
			
		System.out.println(c.antiguedad);
		System.out.println(c.esElectrico);
		System.out.println(c.marca);
		System.out.println(c.matricula);
		System.out.println(c.modelo);
		System.out.println(c.peso);
		
		

	}

}
