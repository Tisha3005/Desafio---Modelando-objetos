package desafiomodelandoobjetos;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta(001, 1506, 258963);
        Conta contaPoupanca = new Conta(001, 1506, 123456789);
        Conta contaInvestimento = new Conta(001, 1506, 7894);

        Cliente thaisRibeiro = new Cliente("Thais Ribeiro", 54, "789456123-00", contaCorrente);
        Cliente ritaSilva = new Cliente("Rita Silva", 34, "123456789-23", contaPoupanca);
        Cliente mariaRita = new Cliente("Maria Rita", 74, "456789132-32", contaInvestimento);

        contaCorrente.saldo = 200;
        contaPoupanca.saldo = 200;
        contaInvestimento.saldo = 200;

        thaisRibeiro.conta.depositar(200, contaCorrente);
        ritaSilva.conta.depositar(200, contaPoupanca);
        mariaRita.conta.depositar(200, contaInvestimento);

        thaisRibeiro.conta.retirar(100);


        System.out.println("Saldo Conta Corrente: " + thaisRibeiro.conta.verificarSaldo(contaCorrente));
        System.out.println("Saldo Conta Poupanca: " + ritaSilva.conta.verificarSaldo(contaPoupanca));
        System.out.println("Saldo Conta Investimento:: " + mariaRita.conta.verificarSaldo(contaInvestimento));


    }
}
