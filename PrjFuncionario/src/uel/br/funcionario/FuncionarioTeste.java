package uel.br.funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario fun1 = new Funcionario("Carlos", 10);
		Funcionario fun2 = new Funcionario("Pedro", 12);

		System.out.printf("nome: %s%nsalario: %f%nvale: %f%nsalário + vale = %f%n%n", fun1.getNome(), fun1.getSalario(), Funcionario.vale, fun1.getSalarioTotal());
		System.out.printf("nome: %s%nsalario: %f%nvale: %f%nsalário + vale = %f%n%n", fun2.getNome(), fun2.getSalario(), Funcionario.vale, fun2.getSalarioTotal());

		Funcionario.vale = 10;
		fun1.changeVale(1.1);

		System.out.printf("nome: %s%nsalario: %f%nvale: %f%nsalário + vale = %f%n%n", fun1.getNome(), fun1.getSalario(), Funcionario.vale, fun1.getSalarioTotal());
		System.out.printf("nome: %s%nsalario: %f%nvale: %f%nsalário + vale = %f%n%n", fun2.getNome(), fun2.getSalario(), Funcionario.vale, fun2.getSalarioTotal());
	}

}
