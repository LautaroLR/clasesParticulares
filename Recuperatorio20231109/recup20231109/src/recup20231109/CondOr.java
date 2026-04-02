package recup20231109;

public class CondOr extends Condicion {

	private Condicion cond1;
	private Condicion cond2;
	
	
	
	public CondOr(Condicion cond1, Condicion cond2) {
		this.cond1=cond1;
		this.cond2=cond2;
	}
	
	
	
	@Override
	public boolean cumple(TarjetaRDIF tarjeta) {
		return cond1.cumple(tarjeta)||cond2.cumple(tarjeta);
	}

	
}