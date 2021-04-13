package sistema;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		SistemaVac sisvac = new SistemaVac();
		
		ArrayList<String> atributosStr1 = new ArrayList<>();
		int idade1 = 25;
		ArrayList<String> endereco1 = new ArrayList<>();
		
		atributosStr1.add("Joao");
		atributosStr1.add("111.111.111.11");
		atributosStr1.add("1111.1111.1111.11");
		atributosStr1.add("joao@gmail.com");
		atributosStr1.add("1111-1111");
		atributosStr1.add("saude");
		atributosStr1.add("negativo");
		
		endereco1.add("Brasil");
		endereco1.add("Estado");
		endereco1.add("Cidade");
		endereco1.add("Bairro");
		endereco1.add("Rua");
		endereco1.add("Numero");
		
		sisvac.cadastrar(atributosStr1, idade1, endereco1);
		
		System.out.println(sisvac.toString());
		
	}
}
