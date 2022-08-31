package desafiomodelandoobjetos;

public class Transacoes {
	
	double valor;
	
	public void depositar(Conta conta, double valor) {
	conta.saldo += valor;
	}

	public void retirar(Conta conta, double valor) {
		conta.saldo -= valor;
	}

	public double verificarSaldo(Conta conta) {
		return conta.saldo;
	}
}
