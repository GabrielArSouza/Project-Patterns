package myApp;

public class MinhaPilha implements Pilha {
	private char[] conteudo;
	private char tam;
	private char capacidade;
	
	public MinhaPilha() {
		conteudo = new char[10];
		tam = 0;
		capacidade = 10;
	}
	
	@Override
	public void empilhar(char ele) {
		if(tam == capacidade) {
			char[] temp = new char[2*capacidade];
			for(int i = 0; i < capacidade; i++) {
				temp[i] = conteudo[i];
			}
			conteudo = temp;
			capacidade *= 2;
		}	
		conteudo[tam++] = ele;
	}

	@Override
	public char desempilhar() throws Exception {
		if (tam == 0)
			throw new Exception("A pilha está vazia!");
		return conteudo[(tam--)-1];
	}

	@Override
	public char topo() throws Exception {
		if (tam == 0)
			throw new Exception("A pilha está vazia!");
		return conteudo[tam-1];
	}

	@Override
	public int tamanho() {
		return this.tam;
	}
	
	@Override
	public void limpar() {
		tam = 0;
	}
}
