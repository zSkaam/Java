public abstract class Conta {
	private final String titular;
	private double saldo;

	protected Conta(String titular, double saldoInicial) {
		if (saldoInicial < 0) {
			throw new IllegalArgumentException("Saldo negativo");
		}
		this.titular = titular;
		this.saldo = saldoInicial;
	}
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		saldo += valor;
	}
	protected void descontar(double valor) {
		if (valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo -= valor;
	}
	public final double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public abstract void sacar(double valor);
}
