package recup20231109;

import java.util.ArrayList;

public class TarjetaBloque extends TarjetaRDIF{

	private static int tiempoExtra = 5;
	private ArrayList<TarjetaRDIF> listaComandos;//en el composite, el tipado de la lista siempre
	//es el del abstracto
	
	
	
	public TarjetaBloque() {
		super();
		this.listaComandos = new ArrayList<TarjetaRDIF>();
	}
	
	public void add (TarjetaRDIF tarjeta) {
		listaComandos.add(tarjeta);
	}
	
	
	public boolean estaVacia () {
		return listaComandos.isEmpty();
	}

	
	public void setTiempoExtra(int tiempo) {
		tiempoExtra=tiempo;
	}
	
	public int getCantidad() {
		int cantidad = 0;
		for (TarjetaRDIF a:listaComandos) {
			cantidad+=a.getCantidad();
		}
		return cantidad;
	}
	
	
	@Override
	public ArrayList<String> getInstrucciones() {
		ArrayList<String> instrucciones=new ArrayList<String>();
		for(TarjetaRDIF a:listaComandos) {
			instrucciones.addAll(a.getInstrucciones());
		}
		return instrucciones;
	}


	@Override
	public int getTiempoEjecucion() {
		int tiempo = 0;
		for (TarjetaRDIF a:listaComandos) {
			tiempo+=a.getTiempoEjecucion();
		}
		return tiempo;
	}

	@Override
	public int getGastoDeBateria() {
		int gasto=0;
		for (TarjetaRDIF a:listaComandos) {
			gasto+=a.getGastoDeBateria();
		}
		gasto=gasto+this.getTiempoEjecucion()*tiempoExtra;
		return gasto;
	}


	@Override
	public TarjetaRDIF getCopia(Condicion cond) {
		TarjetaBloque retorno = new TarjetaBloque();
		for (TarjetaRDIF a:listaComandos) {
			if (cond.cumple(a)) 
				retorno.add(a.getCopia(cond));
		}
		if (!retorno.estaVacia()) {
			return retorno;
		}
		return null;
	}

}
