package myApp;

import java.util.Scanner;

public class Client {
	private Pilha pilha;
	
	public Client(Pilha pilha) {
		this.pilha = pilha;
	}
	
	public void setPilha(Pilha pilha) {
		this.pilha = pilha;
	}
	
	public boolean verificarParenteses(String str) {
		pilha.limpar();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			try {
				if(c == '(' || c == '[' || c == '{')
					pilha.empilhar(c);
				else if( c == ')' ) {
					if(pilha.topo() == '(')
						pilha.desempilhar();
					else
						return false;
				} else if( c == ']' ) {
					if(pilha.topo() == '[')
						pilha.desempilhar();
					else
						return false;
				} else if( c == '}' ) {
					if(pilha.topo() == '{')
						pilha.desempilhar();
					else
						return false;
				}
			} catch(Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Client c1 = new Client(new MinhaPilha());
		Client c2 = new Client(new ObjectAdapter());
		Client c3 = new Client(new ClassAdapter());
		
		System.out.println("Digite uma parentização para ser analisada:");
		String str = in.nextLine();
		
		System.out.print("Resultados:\n  MinhaPilha: ");
		if(c1.verificarParenteses(str))
			System.out.println("Parentização válida!");
		else
			System.out.println("Parentização inválida!");
		
		System.out.print("  ObjectAdapter: ");
		if(c2.verificarParenteses(str))
			System.out.println("Parentização válida!");
		else
			System.out.println("Parentização inválida!");
		
		System.out.print("  ClassAdapter: ");
		if(c3.verificarParenteses(str))
			System.out.println("Parentização válida!");
		else
			System.out.println("Parentização inválida!");
		
		in.close();
		
		System.out.println("Fim da execução!");
	}
}
