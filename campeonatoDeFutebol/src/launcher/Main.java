package launcher;

import java.util.ArrayList;
import java.util.Scanner;

import model.Funcionario;
import model.Time;

public class Main {

	static Scanner ent = new Scanner(System.in);
	static ArrayList<Time> times = new ArrayList<Time>();
	
	public static void main(String[] args) {
		
		Integer op;
		do {
			op = mostrarMenu();
			switch(op) {
			case 1: cadastrarTime();
				break;
			case 2:
				mostrarTimes();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Encerrando execução");
				break;
			default:
				System.out.println("Opção inválida.");
			}
			
		} while (op != 8);
	}
	
	public static Integer mostrarMenu() {
		Integer opcao;
		System.out.println("1- Cadastrar time");
		System.out.println("2- Mostrar times");
		System.out.println("3- Atualizar Salario");
		System.out.println("4- Time com melhor ataque");
		System.out.println("5- Artilheiro do campeonato");
		System.out.println("6- Times do G4");
		System.out.println("7- Despesas de cada time");
		System.out.println("8- Finalizar");
		System.out.println("Qual a opção desejada?");
		opcao = ent.nextInt();
		return opcao;
	}

	public static void cadastrarTime() {
		Time novoTime = new Time();
		System.out.println("Qual o nome do time? ");
		novoTime.setNome(ent.next());
		System.out.println("Total de pontos obtidos? ");
		novoTime.setPontosObtidos(ent.nextInt());
		System.out.println("Total de gols feitos? ");
		novoTime.setGolsFeitos(ent.nextInt());
		System.out.println("Total de gols tomados? ");
		novoTime.setGolsTomados(ent.nextInt());
	//Cadastro do Técnico
		Funcionario tecnico = new Funcionario();
		tecnico.setTipo('T');
		System.out.println("Qual o nome do técnico? ");
		tecnico.setNome(ent.next());
		System.out.println("Qual o salário do técnico? ");
		tecnico.setSalario(ent.nextDouble());
		System.out.println("Qual a data de térmico do contrato do técnico? ");
		tecnico.setDtTerminoContrato(ent.next());

		novoTime.getFunc().add(tecnico);
		
		//Cadastrar jogadores
		for (int i = 0; i <= 1; i++) {
			
			Funcionario jogador = new Funcionario();
			jogador.setTipo('J');
			System.out.println("Qual o nome do jogador? ");
			jogador.setNome(ent.next());
			System.out.println("Qual o salário do jogador? ");
			jogador.setSalario(ent.nextDouble());
			System.out.println("Qual a data de térmico do contrato do jogador? ");
			jogador.setDtTerminoContrato(ent.next());
			System.out.println("Total de gols feitos?");
			jogador.setGolsfeitos(ent.nextInt());
			System.out.println("Posição em que joga? ");
			jogador.setPosicao(ent.next());
			novoTime.getFunc().add(jogador);
			
		}
		
		times.add(novoTime);
	}
	
	public static void mostrarTimes() {
		
		//for (int i=0; i< times.size(); i++)
		
		for(Time t: times) {
			
			System.out.println(t.toString());	
			
		}
		
		
	}
	
}
