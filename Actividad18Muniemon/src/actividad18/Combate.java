package actividad18;

public class Combate {
	private Muniemon primerMuniemon;
	private Muniemon segundoMuniemon;
	
	public Combate(Muniemon primerMuniemon, Muniemon segundoMuniemon) {
		super();
		this.primerMuniemon = primerMuniemon;
		this.segundoMuniemon = segundoMuniemon;
	}

	 public Muniemon empezarCombate () {
		 int turno = 0;
		 Muniemon primerAtacante = null;
		 Muniemon segundoAtacante = null;
		 if(this.primerMuniemon.getVelocidad() > this.segundoMuniemon.getVelocidad()) {
			 primerAtacante = primerMuniemon;
			 segundoAtacante = segundoMuniemon;
		 }else {
			 primerAtacante = segundoMuniemon;
			 segundoAtacante = primerMuniemon;
		 }
		
		 
		 return null;
	 }
}
