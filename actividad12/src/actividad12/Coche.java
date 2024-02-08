package actividad12;

public class Coche {
	String id;

	String marca;

	String modelo;

	double precio;

	String fecha_matricula;

	double kilometros;

	//constructor sin parametros

	public Coche() {

	super();

	}



	//constructor con parametros

	public Coche(String id, String marca, String modelo, double precio, String fecha_matricula, double kilometros) {

	super();

	this.id = id;

	this.marca = marca;

	this.modelo = modelo;

	this.precio = precio;

	this.fecha_matricula = fecha_matricula;

	this.kilometros = kilometros;

	System.out.println(this.id);

	System.out.println(this.marca);

	System.out.println(this.modelo);

	System.out.println(this.precio);

	System.out.println(this.fecha_matricula);

	System.out.println(this.kilometros);

	}



	//mostar todos los datos por pantalla con toString

	@Override

	public String toString() {

	return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio

	+ ", fecha_matricula=" + fecha_matricula + ", kilometros=" + kilometros + "]";

	}

	//año de matriculacion

	public void obtenerAnioMatriculacion() {

	       String anio=this.fecha_matricula.substring(6,this.fecha_matricula.length());

	       System.out.println("el año de matriculacion es :" + anio);

	     

	}

	//año bisiesto

	public void anio_bisiesto() {

	String anio_bisiesto = this.fecha_matricula.substring(6,this.fecha_matricula.length());

	int anio = Integer.parseInt(anio_bisiesto);

	boolean bisiesto =((anio % 4 == 0)&&(anio % 100 != 0)|| (anio % 400 == 0));

	if(bisiesto) {

	System.out.println("el año es bisiesto");

	}else {

	System.out.println("el año NO ES bisiesto");

	}

	}

	//Los objetos tendrán la opción de devolver su precio en función de los kilómetros. En caso de que el coche tenga menos de 10000 km,

	//el precio a devolver será el mismo que el precio base, en caso de que los kilómetros sean mas de 10000 y menos de 50000,

	//el precio será un 80% del precio base, y en caso de que los kilómetros sean mayores

	//o iguales a 50000, el precio a devolver será un 50% del precio base.

	public double precioKm() {

	if(this.kilometros<10000) {

	return precio;

	} else if(this.kilometros<1000) {

	return precio * 0.8;

	}else {

	return precio * 0.5;

	}

	}

	//Los objetos tendrán la opción de devolver si el número de kilómetros que tienen es primo.

	public boolean esKilometrajePrimo() {

	       if (this.kilometros <= 1) {

	           return false; // 0 y 1 no son primos

	       }



	       for (int i = 2; i <= Math.sqrt(this.kilometros); i++) {

	           if (this.kilometros % i == 0) {

	               return false; // Si es divisible por algún número, no es primo

	           }

	       }



	       return true; // Si no es divisible por ningún número, es primo

	   }

	public int calcularKilometrosFaltantes() {

	        int kilometrajeObjetivo = 200000;

	        int kilometrosFaltantes = (int) (kilometrajeObjetivo - this.kilometros);

	        return Math.max(0, kilometrosFaltantes); // No mostrar números negativos

	}

	public int obtenerLongitudMarca() {

	        return marca.length();

	}



	public int obtenerLongitudModelo() {

	    return modelo.length();

	}

	public int calcularDiferenciaKilometros(Coche otroCoche) {

	        return (int) Math.abs(this.kilometros- otroCoche.kilometros);

	    }

	public Coche determinarCocheMasCaro(Coche otroCoche) {

	        if (this.precio > otroCoche.precio) {

	            return this;

	        } else if (this.precio < otroCoche.precio) {

	            return otroCoche;

	        } else {

	           

	            return this;

	        }

	    }





	}

