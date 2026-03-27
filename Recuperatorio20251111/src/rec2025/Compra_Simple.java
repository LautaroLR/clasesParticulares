package rec2025;

public class Compra_Simple extends Compra implements Comparable<Compra>{

	private int id;
	private Destinatario destinatario;
	private int distancia;
	private boolean delivered;
	private String destino;
	private int tiempoEstimado;
	
	public Compra_Simple(int id, Destinatario destinatario, int distancia) {
		super();
		this.id = id;
		this.destinatario = destinatario;
		this.distancia = distancia;
		this.delivered=false;
	}

	@Override
	public boolean isDelivered() {
		// TODO Auto-generated method stub
		return this.delivered;
	}
	
	public void setDelivered() {
		this.delivered=true;
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return this.destino;
	}

	@Override
	public int getTiempoEstimado() {

		return this.tiempoEstimado;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	public int getId() {
		return id;
	}

	public Destinatario getDestinatario() {
		return destinatario;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int compareTo(Compra o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
