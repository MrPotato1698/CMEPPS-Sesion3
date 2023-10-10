package pkg;

public class Movimiento {
	private double importe;
	private enum signo{D, H}; //D -> Reintegro , H -> Ingreso
	private String detalle;
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
}
