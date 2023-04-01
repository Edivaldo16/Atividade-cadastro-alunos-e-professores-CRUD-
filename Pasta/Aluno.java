package escola;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Aluno extends Pessoa {
	private ArrayList<Aluno> pessoaAluno = new ArrayList<Aluno>();

	public void cadastrarAluno() throws ParseException {
		Scanner input = new Scanner(System.in);
		Aluno a = new Aluno();

		System.out.println("Cadastro Aluno");
		System.out.println("Nome: ");
		a.setNome(input.nextLine());

		System.out.println("CPF: ");
		a.setCpf(input.next());
		System.out.println("Data de Nascimento(dd/mm/aa): ");
		String dataRecebida = input.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(dataRecebida);
		a.setDataDeNascimento(date);

		System.out.println("Idade: ");
		a.setIdade(input.nextInt());

		pessoaAluno.add(a);
		System.out.println("Aluno adicionado ao banco de dados com sucesso!!!");
		menuAluno();

	}

	// Localizar Cadastro Alunos
	public Aluno pesquisarAluno(String cpf) {
		Scanner input = new Scanner(System.in);
		System.out.println("Busca aluno");
		System.out.println("CPF: ");
		cpf = input.next();

		for (int i = 0; i < pessoaAluno.size(); i++) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormata = dateFormat.format(pessoaAluno.get(i).getDataDeNascimento());

			if (getPessoaAluno().get(i).getCpf().equals(cpf)) {
				System.out.println("CPF: " + pessoaAluno.get(i).getCpf());
				System.out.println("Nome: " + pessoaAluno.get(i).getNome());
				System.out.println("Data de nascimento: " + pessoaAluno.get(i).getDataDeNascimento());
				System.out.println("Idade: " + pessoaAluno.get(i).getIdade());
				return pessoaAluno.get(i);
			}
		}
		System.out.println("Cadastro não localizado!");
		return null;
	}

	// Listagem Todos os Alunos
	public void listarAluno() {

		// FOREACH (PRA CADA)
		for (Aluno a : pessoaAluno) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			String dataFormatada = dateFormat.format(a.getDataDeNascimento());

			if (pessoaAluno.size() > 0) {
				System.out.println("CPF: " + a.getCpf());
				System.out.println("Nome: " + a.getNome());
				System.out.println("Data de nascimento: " + a.getDataDeNascimento());
				System.out.println("Idade: " + a.getIdade());
			} else {
				System.out.println("ERRO: VOCÊ NÃO TEM ALUNOS CADASTRADOS");
			}
		}
		menuAluno();
	}
	
	public void atualizarAluno(String cpf) throws ParseException {
		Aluno m = new Aluno();
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o cpf para atualizar: ");
		cpf = sc.next();

		for (int i = 0; i < pessoaAluno.size(); i++) {

			if (pessoaAluno.get(i).getCpf().equals(cpf)) {
				
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
				pessoaAluno.set(i, m);
				System.out.println("Cadastro Atualizado");
			} else {
				System.out.println("CPF INESISTENTE ");
			}
		}
		menuAluno();
	}

	public void removerAluno(String cpf) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o cpf para remover: ");
		cpf = sc.next();

		for (int i = 0; i < pessoaAluno.size(); i++) {

			if (pessoaAluno.get(i).getCpf().equals(cpf)) {
				pessoaAluno.remove(i);
				System.out.println("Removido");
			} else {
				System.out.println("CPF INESISTENTE ");
			}
		}
		menuAluno();
	}

	public Aluno(String nome, String cpf, int idade, Date dataDeNascimento, String materia,
			ArrayList<Aluno> pessoaAluno) {
		// super();
		super(nome, cpf, idade, dataDeNascimento);
	}

	public Aluno() {

	}

	public ArrayList<Aluno> getPessoaAluno() {
		return pessoaAluno;
	}

	public void setPessoaAluno(ArrayList<Aluno> pessoaAluno) {
		this.pessoaAluno = pessoaAluno;
	}

}
