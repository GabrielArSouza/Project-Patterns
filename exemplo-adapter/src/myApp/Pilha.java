package myApp;

public interface Pilha {
	public void empilhar(char ele);
	public char desempilhar() throws Exception;
	public char topo() throws Exception;
	public int tamanho();
	public void limpar();
}