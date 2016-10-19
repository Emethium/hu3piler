package br.com.hu3piler.model;

public enum Type {
	NUMBER(1) , STRING(2), VARIABLE(4), OPERATOR(8);
	private int valor;

	Type(int v) {
		this.valor = v;
	}
	
	public int getValor() {
		return valor;
	}
	
	
}
