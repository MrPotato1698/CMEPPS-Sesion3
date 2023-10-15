package pkg;

public class Cuenta {

	private double saldo;
	private String numero;
	private String titular;
	
	public Cuenta(double s) {
		super();
		this.saldo = s;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
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
