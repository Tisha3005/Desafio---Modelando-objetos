package desafiomodelandoobjetos;

public class Conta {

    int numBanco;
    String banco;
    int agencia;
    int numConta;
    double saldo;
    double valor;


    public Conta(int numBanco, int agencia, int numConta) {
        this.numBanco = numBanco;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = 0;
    }

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    public void depositar(double valor, Conta contaDestino) {
        if (this.saldo >= valor){
            contaDestino.saldo += valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
    public double verificarSaldo(Conta conta) {
        return conta.saldo;
    }

}