package recup20231109;

import java.util.ArrayList;

public class TarjetaSimple extends TarjetaRDIF{
	
	
	private String instruccion;
	private int gastoDeBateria;
	private int tiempoEjecucion;
	
	
	
	public TarjetaSimple (String comando, int gastoDeBateria, int tiempoEjecucion) {
		this.instruccion=comando;
		this.gastoDeBateria=gastoDeBateria;
		this.tiempoEjecucion=tiempoEjecucion;
	}
	
	
	
	public int getTiempoEjecucion() {
		return tiempoEjecucion;
	}



	public void setTiempoEjecucion(int tiempoEjecucion) {
		this.tiempoEjecucion = tiempoEjecucion;
	}



	public int getGastoDeBateria() {
		return gastoDeBateria;
	}


	@Override
	public ArrayList<String> getInstrucciones() {
		ArrayList<String> instrucciones=new ArrayList<String>();
		instrucciones.add(this.instruccion);
		return instrucciones;
	}



	@Override
	public int getCantidad() {
		// TODO Auto-generated method stub
		return 1;
	}



	@Override
	public TarjetaRDIF getCopia(Condicion cond) {
		if (cond.cumple(this)) {
				TarjetaRDIF retorno = new TarjetaSimple (this.instruccion, 
				this.gastoDeBateria, this.tiempoEjecucion);
				return retorno;
		}
		return null;
	}
	
	
}
