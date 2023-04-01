package escola;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Professor extends Pessoa {
	private String materia;
	private ArrayList<Professor> pessoaProfessor = new ArrayList<Professor>();

	/*
	 * public String toString() { return "\nNome: " + this.pessoa.getNome() +
	 * "\nCPF: " + this.pessoa.getCpf() + "\nMatéria: " + this.getMateria(); }
	 */

	public void cadastroProfessor() throws ParseException {
		Scanner input = new Scanner(System.in);
		Professor p = new Professor();

		System.out.println("Cadastro Professor");
		System.out.println("Nome: ");
		p.setNome(input.nextLine());

		System.out.println("CPF: ");
		p.setCpf(input.next());
		System.out.println("Data de Nascimento(dd/mm/aa): ");
		String dataRecebida = input.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(dataRecebida);
		p.setDataDeNascimento(date);

		System.out.println("Idade: ");
		p.setIdade(input.nextInt());
		System.out.println("Matéria: ");
		String materia = input.next();

		pessoaProfessor.add(p);
		System.out.println("Professor adicionado ao banco de dados com sucesso!!!");
		menuProfessor();

	}

	// Remover Cadastro Professores (CPF)
	public Professor pesquisarProfessor(String cpf) {
		Scanner input = new Scanner(System.in);
		System.out.println("Busca Professor");
		System.out.println("CPF: ");
		cpf = input.next();

		for (int i = 0; i < pessoaProfessor.size(); i++) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormata = dateFormat.format(pessoaProfessor.get(i).getDataDeNascimento());

			if (getPessoaProfessor().get(i).getCpf().equals(cpf)) {
				System.out.println("CPF: " + pessoaProfessor.get(i).getCpf());
				System.out.println("Nome: " + pessoaProfessor.get(i).getNome());
				System.out.println("Data de nascimento: " + pessoaProfessor.get(i).getDataDeNascimento());
				System.out.println("Idade: " + pessoaProfessor.get(i).getIdade());
				return pessoaProfessor.get(i);

			}
		}
		System.out.println("Cadastro não localizado!");
		return null;
	}

	// Listagem Todos os Professores
	public void listarProfessor() {

		// FOREACH (PRA CADA)
		for (Professor p : pessoaProfessor) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada = dateFormat.format(p.getDataDeNascimento());

			if (pessoaProfessor.size() > 0) {
				System.out.println("CPF: " + p.getCpf());
				System.out.println("Nome: " + p.getNome());
				System.out.println("Data de nascimento: " + p.getDataDeNascimento());
				System.out.println("Idade: " + p.getIdade());
			} else {
				System.out.println("ERRO: VOCÊ NÃO TEM PROFESSORES CADASTRADOS");
			}
		}
		menuProfessor();
	}

	public void atualizarProfessor(String cpf) throws ParseException {
		Professor m = new Professor();
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o cpf para atualizar: ");
		cpf = sc.next();

		for (int i = 0; i < pessoaProfessor.size(); i++) {

			if (pessoaProfessor.get(i).getCpf().equals(cpf)) {

				System.out.println("Nome: ");
				m.setNome(input.nextLine());

				System.out.println("CPF: ");
				m.setCpf(input.next());
				System.out.println("Data de Nascimento(dd/mm/aa): ");
				String dataRecebida = input.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date date = sdf.parse(dataRecebida);
				m.setDataDeNascimento(date);

				System.out.println("Idade: ");
				m.setIdade(input.nextInt());
				System.out.println("Matéria: ");
				String materia = input.next();
				pessoaProfessor.set(i, m);
				System.out.println("Cadastro Atualizado");
			} else {
				System.out.println("CPF INESISTENTE ");
			}
		}
		menuProfessor();
	}

	public void removerProfessor(String cpf) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o cpf para remover: ");
		cpf = sc.next();

		for (int i = 0; i < pessoaProfessor.size(); i++) {

			if (pessoaProfessor.get(i).getCpf().equals(cpf)) {
				pessoaProfessor.remove(i);
				System.out.println("Removido");
			} else {
				System.out.println("CPF INESISTENTE ");
			}
		}
		menuProfessor();
	}

	public Professor(String nome, String cpf, int idade, Date dataDeNascimento, String materia,
			ArrayList<Professor> pessoaProfessor) {
		// super();
		super(nome, cpf, idade, dataDeNascimento);
		this.setMateria(materia);
	}

	public Professor() {

	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;

	}

	public ArrayList<Professor> getPessoaProfessor() {
		return pessoaProfessor;
	}

	public void setPessoaProfessor(ArrayList<Professor> pessoaProfessor) {
		this.pessoaProfessor = pessoaProfessor;
	}

}
