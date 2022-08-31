package desafiomodelandoobjetos;

public class TesteConta {

	public static void main(String[] args) {

		Transacoes operacao = new Transacoes();

		Cliente thaisRibeiro = new Cliente("Thais Ribeiro", 54, "789456123-00");
		Conta contaCorrente = new Conta(001, 1506, 258963);
		operacao.depositar(contaCorrente, 1000);
		operacao.retirar(contaCorrente, 50);
		System.out.println("Saldo thaisRibeiro: " + operacao.verificarSaldo(contaCorrente));

		Cliente ritaSilva = new Cliente("Rita Silva", 34, "123456789-23");
		Conta contaPoupanca = new Conta(001, 1506, 123456789);
		operacao.depositar(contaPoupanca, 800);
		operacao.retirar(contaPoupanca, 10);
		System.out.println("Saldo ritaSilva: " + operacao.verificarSaldo(contaPoupanca));

		Cliente mariaRita = new Cliente("Maria Rita", 74, "456789132-32");
		Conta contaInvestimento = new Conta(001, 1506, 7894);
		operacao.depositar(contaInvestimento, 10000);
		System.out.println("Saldo mariaRita: " + operacao.verificarSaldo(contaInvestimento));

	}
}
