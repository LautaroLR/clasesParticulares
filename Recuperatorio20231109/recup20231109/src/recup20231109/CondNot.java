package recup20231109;

public class CondNot extends Condicion {
	
	private Condicion condicion;

	public CondNot (Condicion cond) {
		this.condicion=cond;
	}
	
	
	public boolean cumple (TarjetaRDIF tarjeta) {
		return !condicion.cumple(tarjeta);
	}
	
}
