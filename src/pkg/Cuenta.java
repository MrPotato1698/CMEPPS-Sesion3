package pkg;

public class Cuenta {

	private double saldo;
	
	public Cuenta(double s) {
		super();
		this.saldo = s;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double s) {
		this.saldo = s;
	}

	public void ingresar(double i) {
		this.setSaldo(this.getSaldo() + i);
	}

	public void retirar(double i) {
		this.setSaldo(this.getSaldo() - i);
	}
}
