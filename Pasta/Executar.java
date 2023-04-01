package escola;

import java.util.Scanner;
//Menu Principal com dois submenus (Professor e Aluno)
public class Executar {

	public static void main(String[] args) throws Exception {

		Scanner t = new Scanner(System.in);
		Pessoa pe = new Pessoa();
		pe.menuPrincipal(); //MenuPrincipal
		int o;

		//1 - Submenu Professor
		do {
			o = t.nextInt();
			switch (o) {
			case 1: 
				Scanner input = new Scanner(System.in);
				Professor p = new Professor();
				p.menuProfessor();

				int opcao;
				do {
					opcao = input.nextInt();
					switch (opcao) {
					case 1:
						p.cadastroProfessor();
						break;
					case 2:
						p.pesquisarProfessor(null);
						p.menuProfessor();
						break;
					case 3:
						p.listarProfessor();
						break;
					case 4:
						p.atualizarProfessor(null);
						break;
					case 5:
						p.removerProfessor(null);
						break;
					case 0:
						pe.menuPrincipal();
						break;
					default:
						System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES: 0 - 5");
					}
				} while (opcao != 0);
				break;
			case 2:
				//2 - Submenu Aluno
				Scanner sc = new Scanner(System.in);
				Aluno a = new Aluno();
				a.menuAluno();
				int op;

				// O switch case também pode ser feito dessa outra forma:
				do {
					op = sc.nextInt();
					switch (op) {
					case 1:
						a.cadastrarAluno();
						break;
					case 2:
						a.pesquisarAluno(null);
						a.menuAluno();
						break;
					case 3:
						a.listarAluno();
						break;
					case 4:
						a.atualizarAluno(null);
						break;
					case 5:
						a.removerAluno(null);
						break;
					case 0:
						pe.menuPrincipal();
						break;
					default:
						System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES: 0 - 5");
					}
				} while (op != 0);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES: 0 - 2");
				pe.menuPrincipal();
			}
		} while (o != 0);
	
	}

}
