package actividad20;

public class Coche {
	private int id;
	private String matricula;
	private String marca;
	private static int contadorId = 0;
	//CONSTANTES DE LOS COCHES MAS USADOS
	public static final String MARCA_MAS_USADA1 ="RENAULT";
	public static final String MARCA_MAS_USADA2 ="TOYOTA";
	//CONSTRUCTOR SIN PARAMETROS
	public Coche() {
		this.id = ++contadorId; //incrementa contador
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public static int getContadorId() {
		return contadorId;
	}
	//METODO TOSTRING
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	//mostrar valor actual
	public static void valorActual() {
		System.out.println(contadorId);
	}
	//resetear el contador
	public static void resetearValorActual() {
		 contadorId = 0;
		 Coche.contadorId = ++contadorId;
		 System.out.println(contadorId);
	}
}
