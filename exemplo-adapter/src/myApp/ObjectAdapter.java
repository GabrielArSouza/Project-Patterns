package myApp;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ObjectAdapter implements Pilha {
	private LinkedList<Character> list;
	
	public ObjectAdapter() {
		this.list = new LinkedList<>();
	}
	
	@Override
	public void empilhar(char ele) {
		list.addFirst(ele);
	}

	@Override
	public char desempilhar() throws Exception {
		try {
			return list.removeFirst();
		} catch(NoSuchElementException e) {
			throw new Exception("A pilha está vazia!");
		}
	}

	@Override
	public char topo() throws Exception {
		try {
			return list.getFirst();
		} catch(NoSuchElementException e) {
			throw new Exception("A pilha está vazia!");
		}
	}

	@Override
	public int tamanho() {
		return list.size();
	}
	
	@Override
	public void limpar() {
		list.clear();
	}
}
