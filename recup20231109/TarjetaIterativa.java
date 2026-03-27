package recup20231109;

public class TarjetaIterativa extends TarjetaRDIF{
	
	private TarjetaRDIF iterable;
	private int iteraciones; 
	
	
	
	
	
	public TarjetaIterativa(TarjetaRDIF iterable, int iteraciones) {
		super();
		this.iterable = iterable;
		this.iteraciones = iteraciones;
	}

	@Override
	public String getInstrucciones() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTiempoEjecucion() {
		return iterable.getTiempoEjecucion()*iteraciones;
	}

	@Override
	public int getGastoDeBateria() {
		return iterable.getGastoDeBateria()*iteraciones;
	}
	
}
