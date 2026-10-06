public class ContaCorrente extends Conta {
	public class ContaCorrente(String titular, double saldo) {
		super(titular, saldo);
	}
	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		descontar(valor + 2.0);
	}
}
