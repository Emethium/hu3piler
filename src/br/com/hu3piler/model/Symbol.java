package br.com.hu3piler.model;

public class Symbol {
	private String name;
	private Type type;
	private boolean isDeclared;
	private boolean isUtilized;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public boolean isDeclared() {
		return isDeclared;
	}
	public void setDeclared(boolean isDeclared) {
		this.isDeclared = isDeclared;
	}
	public boolean isUtilized() {
		return isUtilized;
	}
	public void setUtilized(boolean isUtilized) {
		this.isUtilized = isUtilized;
	}
}
