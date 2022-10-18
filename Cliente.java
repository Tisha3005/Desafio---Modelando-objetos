package desafiomodelandoobjetos;

public class Cliente {
	String nome;
	int idade;
	String cpf;

	Conta conta;

	public Cliente(String nome, int idade, String cpf, Conta conta) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.conta = conta;

	}
}
