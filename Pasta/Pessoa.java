package escola;

import java.util.Date;
import java.util.Scanner;

public class Pessoa {
	// Atributos
	// private static int contador = 0;
	private String nome;
	private String cpf;
	private Date dataDeNascimento;
	private int idade;

	// Métodos Personalizados
	public void menuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("Bem vindo ao banco de dados da Fuctura");
		System.out.println("1 - Professor");
		System.out.println("2 - Aluno");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}

	public void menuProfessor() {
		System.out.println("Menu Professor");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Pesquisa");
		System.out.println("3 - Listar");
		System.out.println("4 - Atualizar");
		System.out.println("5 - Remover");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}

	public void menuAluno() {
		System.out.println("Menu Aluno");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Pesquisa");
		System.out.println("3 - Listar");
		System.out.println("4 - Atualizar");
		System.out.println("5 - Remover");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}

	// Métodos Especiais:
	// Constructor
	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, int idade, Date dataDeNascimento) {
		super();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataDeNascimento(dataDeNascimento);
		this.setIdade(idade);
		// contador += 1;
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String modCpf() {

		StringBuilder strBuilder = new StringBuilder(this.cpf);
		String a = strBuilder.insert(3, ".").toString();
		StringBuilder str = new StringBuilder(a);
		String b = str.insert(7, ".").toString();
		StringBuilder st = new StringBuilder(b);
		String c = st.insert(11, " - ").toString();
		return c;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
