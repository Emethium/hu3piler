package br.com.hu3piler.model;

public class Item {
	private Type type;
	private String content;
	
	public Item(Type t, String s) {
		this.type = t;
		this.content = s;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
