package br.com.fai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private Scanner scanner = new Scanner(System.in);

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

		System.out.println("Sua opcao: ");
	}

	private void cadastrarCavalo() {
	}

	private void cadastrarGirafa() {
	}

	private void listarCavalo() {
	}

	private void listarGirafa() {
	}

	private void listarTodos() {
	}

	private void removerAnimalPorID() {
	}

	private void exibirQuantidadeDeAnimaisPorTipo() {
	}
}
