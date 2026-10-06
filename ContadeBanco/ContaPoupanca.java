public class ContaPoupanca extends Conta {
	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}
	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		descontar(valor);
	}
	public void renderjuros() {
		depositar (getSaldo() * 0.01);
	}
}
