package myApp;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ClassAdapter extends LinkedList<Character> implements Pilha {
	private static final long serialVersionUID = 1L;

	@Override
	public void empilhar(char ele) {
		this.addFirst(ele);
	}

	@Override
	public char desempilhar() throws Exception {
		try {
			return this.removeFirst();
		} catch(NoSuchElementException e) {
			throw new Exception("A pilha está vazia!");
		}
	}

	@Override
	public char topo() throws Exception {
		try {
			return this.getFirst();
		} catch(NoSuchElementException e) {
			throw new Exception("A pilha está vazia!");
		}
	}

	@Override
	public int tamanho() {
		return this.size();
	}

	@Override
	public void limpar() {
		this.clear();
	}
}
