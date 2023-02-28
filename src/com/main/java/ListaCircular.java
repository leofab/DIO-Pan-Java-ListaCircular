package com.main.java;

public class ListaCircular<T> {

	private No<T> cabeca;
	private No<T> calda;
	private int tamanhoLista;
	
	public boolean isEmpty() {
		return this.tamanhoLista ==0 ? true : false;
		
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("A lista está vazia!");
			
			if(index == 0) {
				return this.calda;
			
		}
			
			No<T> noAuxiliar = this.calda;
			for(int i = 0; (i < index) & (noAuxiliar != null); i++) {
				noAuxiliar = noAuxiliar.getNoProximo();
			}
				
			return noAuxiliar;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
}
