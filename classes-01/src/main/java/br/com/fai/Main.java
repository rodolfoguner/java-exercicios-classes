package br.com.fai;

import br.com.fai.models.Animal;
import br.com.fai.models.Cavalo;
import br.com.fai.models.Girafa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private Scanner scanner = new Scanner(System.in);
	private Map<Integer, Animal> listaAnimais = new HashMap<>();

	private void start() {

		boolean execucao = true;

		while (execucao) {
			exibeMenu();
			int opcao = -1;

			try {
				opcao = scanner.nextInt();
			} catch (Exception e) {
				scanner.next();
				System.out.println(e.getMessage());
				System.out.println("Ocorreu um erro. Tente novamente.");
			}

			switch (opcao) {
			case 1:
				cadastrarCavalo();
				break;

			case 2:
				cadastrarGirafa();
				break;

			case 3:
				listarCavalo();
				break;

			case 4:
				listarGirafa();
				break;

			case 5:
				listarTodos();
				break;

			case 6:
				removerAnimalPorID();
				break;

			case 7:
				exibirQuantidadeDeAnimaisPorTipo();
				break;

			case 8:
				execucao = false;
				break;

			default:
				System.out.println("Opcao invalida");
				break;
			}

		}

	}

	private void exibeMenu() {
		System.out.println("1. Cadastrar cavalo");
		System.out.println("2. Cadastrar girafa");
		System.out.println("3. Listar cavalo");
		System.out.println("4. Listar girafa");
		System.out.println("5. Listar todos os animais");
		System.out.println("6. Remover animal por id");
		System.out.println("7. Exibir a quantidade de animais por tipo");
		System.out.println("8. Sair");

		System.out.print("Sua opcao: ");
	}

	private void cadastrarCavalo() {
		System.out.print("Digite o nome do cavalo: ");

		String nome = scanner.next();

		if (!nome.trim().equals("")) {
			Animal cavalo = new Cavalo(nome);

			System.out.println("Cavalo id:" + cavalo.getId() + ", nome: " + cavalo.getNome() +
					" cadastrado com sucesso");

			listaAnimais.put(cavalo.getId(), cavalo);
		}
	}

	private void cadastrarGirafa() {
		System.out.print("Digite o nome da girafa: ");

		String nome = scanner.next();

		if (!nome.trim().equals("")) {
			Animal girafa = new Girafa(nome);

			System.out.println("Girafa id:" + girafa.getId() + ", nome: " + girafa.getNome() +
					" cadastrado com sucesso");

			listaAnimais.put(girafa.getId(), girafa);
		}
	}

	private void listarCavalo() {
		for (Animal animal: listaAnimais.values()) {
			if (animal instanceof Cavalo) {
				System.out.println("ID: " + animal.getId() + " | Nome: " + animal.getNome());
			}
		}
	}

	private void listarGirafa() {
		for (Animal animal: listaAnimais.values()) {
			if (animal instanceof Girafa) {
				System.out.println("ID: " + animal.getId() + " | Nome: " + animal.getNome());
			}
		}
	}

	private void listarTodos() {
		for (Animal animal: listaAnimais.values()) {
			System.out.println("ID: " + animal.getId() + " | Nome: " + animal.getNome() +
					" | Tipo: " + animal.getClass().getSimpleName());
		}
	}

	private void removerAnimalPorID() {
		System.out.print("Digite o ID do animal que deseja ser removido: ");

		try {
			int id = scanner.nextInt();
			listaAnimais.remove(id);

			System.out.println("Animal removido com sucesso.");
		} catch (Exception e) {
			scanner.next();
			System.out.println("ID inexistente.");
		}
	}

	private void exibirQuantidadeDeAnimaisPorTipo() {
		int qtdCavalo = 0;
		int qtdGirafa = 0;
		for (Animal animal: listaAnimais.values()) {
			if (animal instanceof Cavalo) {
				qtdCavalo += 1;
			} else if (animal instanceof Girafa) {
				qtdGirafa += 1;
			}
		}

		System.out.println("Quantidade de cavalos: " + qtdCavalo);
		System.out.println("Quantidade de girafas: " + qtdGirafa);
	}
}
