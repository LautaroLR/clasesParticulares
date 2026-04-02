package recup20231109;

public class condInstruccion extends Condicion {

	private String instruccion;
	
	
	
	public condInstruccion (String instruccion) {
		
		this.instruccion=instruccion;
	
	}
	
	
	
	
	@Override
	public boolean cumple(TarjetaRDIF tarjeta) {
		return tarjeta.getInstrucciones().contains(instruccion);
	}

}
