package rec2025;

import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Compra>{
	
	@Override
	public int compare(Compra o1, Compra o2) {
		//devuelve negativo si el primero es menor que el segundo;
		//devuelve cero si son iguales;
		//devuevle positivo si el segundo es mayor que el primero;
		
		//o1.getTiempoEstimado = 1
		//o2.getTiempoEstimado = 1
		return o2.getTiempoEstimado()-o1.getTiempoEstimado();
	}

}
