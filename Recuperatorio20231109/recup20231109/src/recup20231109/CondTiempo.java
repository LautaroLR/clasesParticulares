package recup20231109;

public class CondTiempo extends Condicion {
	
	private int tiempoBuscado;// tiempoBuscado=10
	

	public CondTiempo (int tiempoBuscado) {
		this.tiempoBuscado=tiempoBuscado;
	}
	
	
	public boolean cumple (TarjetaRDIF tarjeta) {
		return tarjeta.getTiempoEjecucion()<tiempoBuscado;
	}
	
}
