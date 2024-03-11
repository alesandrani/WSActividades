package actividad18;

public class Muniemon {
	private String nombre;
	private int vida;
	private int ataque;
	private int defensa;
	private TipoMuniemon tipo;

	public Muniemon() {
		super();
	}

	public Muniemon(String nombre, int vida, int ataque, int defensa, TipoMuniemon muniemon) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		this.tipo = muniemon;
	}

	@Override
	public String toString() {
		return "Muniemon [nombre=" + nombre + ", vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa
				+ ", muniemon=" + tipo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public TipoMuniemon getMuniemon() {
		return tipo;
	}

	public void setMuniemon(TipoMuniemon muniemon) {
		this.tipo = muniemon;
	}

	public void atacar(Muniemon objetivo) {
		System.out.println(this.nombre + "ataca a  :" + objetivo.getNombre() + "!");
		if (this.vida < 0) {
			System.out.println("No se puede atacar porque " + this.nombre + "esta muerto");

		} else {
			if (objetivo.getVida() <= 0) {
				System.out.println(objetivo.getNombre() + "ya esta muerto. No se puede atacar");

			}else {
				int ataqueReal = this.ataque - objetivo.defensa;
				System.out.println("El ataque real es: " + ataqueReal);
				if(ataqueReal > 0) {
					objetivo.vida -= ataqueReal;
					System.out.println(objetivo.getNombre() + " pierde " + ataqueReal + " puntos de vida.");
					if (objetivo.getVida() <= 0) {
						System.out.println(objetivo.getNombre() + " ha sido derrotado.");
					}
				}
				
			}
			
		}

	}
}
