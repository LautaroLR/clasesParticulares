package rec2025;
import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<Compra> {

		private Comparator<Compra> c1, c2;

		@Override
		public int compare(Compra o1, Compra o2) {
			int resultado=c1.compare(o1, o2);
			if (resultado==0) {
				resultado=c2.compare(o1, o2);
			}
			return resultado;
		}
		
}
