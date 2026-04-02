package recup20231109;

import java.util.ArrayList;

public class TarjetaIterativa extends TarjetaRDIF{
	
	private TarjetaRDIF iterable;
	private int iteraciones;
	
	
	
	;
	
	public TarjetaIterativa(TarjetaRDIF iterable, int iteraciones) {
		super();
		this.iterable = iterable;
		this.iteraciones = iteraciones;
	}

	@Override
	public ArrayList<String> getInstrucciones() {
		ArrayList<String> retorno = new ArrayList<String>();
		for(int i=0;i<iteraciones;i++) {
			retorno.addAll(iterable.getInstrucciones());
		}
		return retorno;
	}

	@Override
	public int getTiempoEjecucion() {
		return iterable.getTiempoEjecucion()*iteraciones;
	}

	@Override
	public int getGastoDeBateria() {
		return iterable.getGastoDeBateria()*iteraciones;
	}

	@Override
	public int getCantidad() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public TarjetaRDIF getCopia(Condicion cond) {
		if (cond.cumple(this)) {
		TarjetaRDIF retorno = new TarjetaIterativa (this.iterable.getCopia(cond),this.iteraciones);
		return retorno;
		}
		return null;
	}
	
}
