package recup20231109;

public class CondConsumo extends Condicion {
	
	private int consumoBuscado;//100
	
	public CondConsumo (int consumoBuscado) {
	
		this.consumoBuscado=consumoBuscado;
	
	}

	@Override
	public boolean cumple(TarjetaRDIF tarjeta) {
	
		return tarjeta.getGastoDeBateria()<consumoBuscado;
	}
	
}
