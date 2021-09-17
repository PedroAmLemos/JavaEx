package br.uel.combustivel;
import java.util.ArrayList;
import java.util.Scanner;

public class Bomba {
	private int numeroId;

	public ArrayList<Combustivel> getCombustiveis() {
		return combustiveis;
	}

	public void setCombustiveis(ArrayList<Combustivel> combustiveis) {
		this.combustiveis = combustiveis;
	}

	private ArrayList<Combustivel> combustiveis = new ArrayList<>();

	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}
	
	public void addCombustivel(String nome, double preco) {
		Combustivel novoCombustivel = new Combustivel(nome, preco);
		this.combustiveis.add(novoCombustivel);
	}

	public void selectCombustivel(String nome, Scanner input) {
		int opcao;
		double qntLitro;
		double qntDinheiro;
		int flag = 0;
		for(Combustivel combustivel : combustiveis) {
			if(nome.equals(combustivel.getNomeCombustivel())) {
				flag = 1;
				do {
					System.out.println("O preço do combustível "+ combustivel.getNomeCombustivel()+ " é "+ combustivel.getPreco());
					System.out.println("Escolha uma opção: ");
					System.out.println("1) Inserir por litro");
					System.out.println("2) Inserir por dinheiro");
					System.out.println("3) Sair");
					opcao = input.nextInt();
					input.nextLine();
					switch(opcao) {
						case 1:
							System.out.println("Insira a quantidade de litros: ");
							qntLitro = Double.parseDouble(input.nextLine());
							combustivel.absLitro(qntLitro);
							System.out.println("Digite (3) para voltar ou (0) para abastecer novamente");
							opcao = Integer.parseInt(input.nextLine());
							break;
						case 2:
							System.out.println("Insira a quantidade de dinheiro: ");
							qntDinheiro = Double.parseDouble(input.nextLine());
							combustivel.absDin(qntDinheiro);
							System.out.println("Digite (3) para voltar ou (0) para abastecer novamente");
							opcao = Integer.parseInt(input.nextLine());
							break;
						case 3:
							break;
					}
				} while(opcao != 3);
				break;
			}
		}
		if(flag == 0) {
			System.out.println("O combustivel " +nome +" não foi encontrada");
		}
	}

}
