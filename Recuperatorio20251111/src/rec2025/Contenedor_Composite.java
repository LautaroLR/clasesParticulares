package rec2025;

import java.util.ArrayList;

public class Contenedor_Composite extends Compra{
	
	ArrayList<Compra> compras;
	
	
	public Contenedor_Composite() {
		super();
		this.compras = new ArrayList<Compra>();
	}
	public void add(Compra nuevoElemento) {
		if(nuevoElemento.getDestino().equals(this.getDestino())) {
			this.compras.add(nuevoElemento);
		}
	}

	@Override
	public boolean isDelivered() {
		for(Compra a:compras) {
			if(!a.isDelivered()) {//invertimos la condición para que entre al bloque
								//si algún elemento no fue entregado
				return false;
			}
		}
		return true;
	}

	@Override
	public String getDestino() {
		return this.compras.get(0).getDestino();
		//pido el destino del elemento cero de las compras de este objeto.
	}

	@Override
	public int getTiempoEstimado() {
		int max=0;
		for(Compra a:compras) {
			if(a.getTiempoEstimado()>max) {
				max=a.getTiempoEstimado();
			}
		}
		return max;
	}
	
	

}
