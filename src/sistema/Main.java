package sistema;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		//Criando sistema:
		SistemaVac sisvac = new SistemaVac();
		
		
		//Criando usuario 1, nao habilitado a dose 1:
		ArrayList<String> atributosStr1 = new ArrayList<>();
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
		
		sisvac.cadastrar(atributosStr1, idade1, endereco1);
		
		
		//Criando usuario 2, habilitado a dose 1 por idade:
		ArrayList<String> atributosStr2 = new ArrayList<>();
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
		
		System.out.println(sisvac.toString());
		
		
		//Vacinando usuario nao habilitado a dose 1: 
		//sisvac.vacinar("111.111.111.11");
		
		
		//Alterando idade do usuario 1. Agora esta habilitado a dose 1:
		sisvac.alterarIdade(60, "111.111.111.11");
		System.out.println(sisvac.toString());
		
		
		//Vacinando usuario habilitado a dose 1: 
		sisvac.vacinar("111.111.111.11");
		System.out.println(sisvac.toString());
		
		
		//Vacinando usuario nao habilitado a dose 2:
		//sisvac.vacinar("111.111.111.11");
		//System.out.println(sisvac.toString());
		
		
		//Alterando a quantidade de dias apos a dose 1. Usuario agora habilitado a dose 2:
		sisvac.alterarDiasAposDose1(21, "111.111.111.11");
		System.out.println(sisvac.toString());

		
		//Vacinando usuario habilitado a dose 2. Vacina finalizada para ele:
		sisvac.vacinar("111.111.111.11");
		System.out.println(sisvac.toString());
		
		
		//Vacinando usuario com vacina finalizada:
		//sisvac.vacinar("111.111.111.11");
		
		//Alterando metodo que pode alterar o estado. Usuario com vacina finalizada:
		sisvac.alterarComorbidade("positivo", "111.111.111.11");
		System.out.println(sisvac.toString());
	}
}
