package sistema;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static SistemaVac sisvac = new SistemaVac();
	static Scanner sc = new Scanner(System.in);
	
	
	public static void menu() {
		
		System.out.println("Digite o numero da operacao desejada: ");
		System.out.println("1. Cadastrar novo usuario.");
		System.out.println("2. Registrar vacina de usuario existente.");
		System.out.println("3. Pesquisar usuario.");
		System.out.println("4. Listar usuarios.");
		System.out.println("5. Alterar dados de usuario existente.");
		int operacao = Integer.parseInt(sc.nextLine());
		
		if (operacao == 1) { 
			cadastrar();
		}
		else if (operacao == 2) {
			vacinar();
		}
		else if (operacao == 3) {
			pesquisar();
		}
		else if (operacao == 4) {
			listar();
		}
		else if (operacao == 5) {
			alterarDados();
		}
		else {
			System.out.println("Operacao invalida. Tente novamente.");
			menu();
		}
	}
	
	public static void cadastrar() {
		
		ArrayList<String> atributosStr = new ArrayList<>();
		
		System.out.println("Digite o nome: ");
		atributosStr.add(sc.nextLine());
		
		System.out.println("Digite o CPF: ");
		String cpf = sc.nextLine();
		atributosStr.add(cpf);
		
		System.out.println("Digite o numero do cartao: ");
		atributosStr.add(sc.nextLine());
		
		System.out.println("Digite o email: ");
		atributosStr.add(sc.nextLine());
		
		System.out.println("Digite o telefone: ");
		atributosStr.add(sc.nextLine());
		
		System.out.println("Digite a profissao: ");
		atributosStr.add(sc.nextLine());
		
		System.out.println("Possui comorbidade? Digite positivo ou negativo: ");
		atributosStr.add(sc.nextLine());
		
		System.out.println("Digite a idade: ");
		int idade = Integer.parseInt(sc.nextLine());
		
		ArrayList<String> endereco = criarEndereco();
		
		sisvac.cadastrar(atributosStr, idade, endereco);
		
		System.out.println("Usuario cadastrado com sucesso:\n");
		System.out.println(sisvac.getPessoa(cpf));
		menu();
	}
	
	public static void vacinar() {
		System.out.println("Digite o CPF do usuario: ");
		String cpf = sc.nextLine();
		System.out.println(sisvac.vacinar(cpf));
		menu();
	}
	
	public static void pesquisar() {
		System.out.println("Digite o CPF: ");
		String cpf = sc.nextLine();
		System.out.println(sisvac.getPessoa(cpf));
		menu();
	}
	
	public static void listar() {
		System.out.println(sisvac.listar());
		menu();
	}
	
	public static void alterarDados() {
		System.out.println("Digite o CPF: ");
		String cpf = sc.nextLine();
		
		if (!sisvac.cpfExiste(cpf)) {
			System.out.println("CPF nao cadastrado.");
			menu();
		}
		
		System.out.println("Digite o numero da operacao desejada:");
		System.out.println("1. Alterar nome");
		System.out.println("2. Alterar CPF");
		System.out.println("3. Alterar Numero do Cartao");
		System.out.println("4. Alterar E-mail");
		System.out.println("5. Alterar Telefone");
		System.out.println("6. Alterar Profissao");
		System.out.println("7. Alterar Comorbidade");
		System.out.println("8. Alterar Idade");
		System.out.println("9. Alterar Dias Apos Dose 1");
		System.out.println("10. Alterar Endereco");
		
		int operacao = Integer.parseInt(sc.nextLine());
		
		if (operacao == 1){
			System.out.println("Digite o novo nome: ");
			String nome = sc.nextLine();
			System.out.println(sisvac.alterarNome(nome, cpf));
			menu();
			
		}else if (operacao == 2){
			System.out.println("Digite o novo CPF: ");
			String novoCpf = sc.nextLine();
			System.out.println(sisvac.alterarCpf(cpf, novoCpf));
			menu();
			
		}else if (operacao == 3){
			System.out.println("Digite o novo numero do cartao: ");
			String num = sc.nextLine();
			System.out.println(sisvac.alterarNumCartao(num, cpf));
			menu();
			
		}else if (operacao == 4){
			System.out.println("Digite o novo E-mail: ");
			String email = sc.nextLine();
			System.out.println(sisvac.alterarEmail(email, cpf));
			menu();
			
		}else if (operacao == 5){
			System.out.println("Digite o novo Telefone: ");
			String tel = sc.nextLine();
			System.out.println(sisvac.alterarTel(tel, cpf));
			menu();
			
		}else if (operacao == 6){
			System.out.println("Digite a nova profissao: ");
			String profissao = sc.nextLine();
			System.out.println(sisvac.alterarProfissao(profissao, cpf));
			menu();
			
		}else if (operacao == 7){
			System.out.println("Digite o estado de comorbidade (positivo ou negativo): ");
			String comorbidade = sc.nextLine();
			System.out.println(sisvac.alterarComorbidade(comorbidade, cpf));
			menu();
			
		}else if (operacao == 8){
			System.out.println("Digite a nova idade: ");
			int idade = Integer.parseInt(sc.nextLine());
			System.out.println(sisvac.alterarIdade(idade, cpf));
			menu();
			
		}else if (operacao == 9){
			System.out.println("Digite os dias desde que tomou a dose 1: ");
			int dias = Integer.parseInt(sc.nextLine());
			System.out.println(sisvac.alterarDiasAposDose1(dias, cpf));
			menu();
			
		}else if (operacao == 10){
			ArrayList<String> endereco = criarEndereco();
			System.out.println(sisvac.alterarEndereco(endereco, cpf));
			menu();
			
		}else {
			System.out.println("Operacao invalida! Tente novamente.");
			menu();
			
		}
	}
	
	public static ArrayList<String> criarEndereco() {
		ArrayList<String> endereco = new ArrayList<>();
		
		System.out.println("Digite seu estado: ");
		endereco.add(sc.nextLine());
		
		System.out.println("Digite sua cidade: ");
		endereco.add(sc.nextLine());
		
		System.out.println("Digite seu bairro: ");
		endereco.add(sc.nextLine());
		
		System.out.println("Digite sua rua: ");
		endereco.add(sc.nextLine());
		
		System.out.println("Digite o numero da sua casa: ");
		endereco.add(sc.nextLine());
		
		return endereco;
	}
	
	public static void main(String[] args) {
		menu();
		
		
		/*TESTES:*/
		
		//Criando sistema:
		/*SistemaVac sisvac = new SistemaVac();*/
		
		
		//Criando usuario 1, nao habilitado a dose 1:
		/*ArrayList<String> atributosStr1 = new ArrayList<>();
		int idade1 = 25;
		ArrayList<String> endereco1 = new ArrayList<>();
		
		atributosStr1.add("Joao");
		atributosStr1.add("111.111.111.11");
		atributosStr1.add("1111.1111.1111.11");
		atributosStr1.add("joao@gmail.com");
		atributosStr1.add("1111-1111");
		atributosStr1.add("pedreiro");
		atributosStr1.add("negativo");
		
		endereco1.add("Brasil");
		endereco1.add("Estado");
		endereco1.add("Cidade");
		endereco1.add("Bairro");
		endereco1.add("Rua");
		endereco1.add("Numero");
		
		sisvac.cadastrar(atributosStr1, idade1, endereco1);*/
		
		
		//Criando usuario 2, habilitado a dose 1 por idade:
		/*ArrayList<String> atributosStr2 = new ArrayList<>();
		int idade2 = 80;
		ArrayList<String> endereco2 = new ArrayList<>();
		
		atributosStr2.add("Maria");
		atributosStr2.add("111.111.111.12");
		atributosStr2.add("1111.1111.1111.12");
		atributosStr2.add("maria@gmail.com");
		atributosStr2.add("1111-1112");
		atributosStr2.add("aposentada");
		atributosStr2.add("negativo");
		
		endereco2.add("Brasil");
		endereco2.add("Estado");
		endereco2.add("Cidade");
		endereco2.add("Bairro");
		endereco2.add("Rua");
		endereco2.add("Numero");
		
		sisvac.cadastrar(atributosStr2, idade2, endereco2);
		
		System.out.println(sisvac.toString());*/
		
		
		//Vacinando usuario nao habilitado a dose 1: 
		//sisvac.vacinar("111.111.111.11");
		
		
		//Alterando idade do usuario 1. Agora esta habilitado a dose 1:
		/*sisvac.alterarIdade(60, "111.111.111.11");
		System.out.println(sisvac.toString());*/
		
		
		//Vacinando usuario habilitado a dose 1: 
		/*sisvac.vacinar("111.111.111.11");
		System.out.println(sisvac.toString());*/
		
		
		//Vacinando usuario nao habilitado a dose 2:
		//sisvac.vacinar("111.111.111.11");
		//System.out.println(sisvac.toString());
		
		
		//Alterando a quantidade de dias apos a dose 1. Usuario agora habilitado a dose 2:
		/*sisvac.alterarDiasAposDose1(21, "111.111.111.11");
		System.out.println(sisvac.toString());*/

		
		//Vacinando usuario habilitado a dose 2. Vacina finalizada para ele:
		/*sisvac.vacinar("111.111.111.11");
		System.out.println(sisvac.toString());*/
		
		
		//Vacinando usuario com vacina finalizada:
		//sisvac.vacinar("111.111.111.11");
		
		//Alterando metodo que pode alterar o estado. Usuario com vacina finalizada:
		/*sisvac.alterarComorbidade("positivo", "111.111.111.11");
		System.out.println(sisvac.toString());*/
	}
}
