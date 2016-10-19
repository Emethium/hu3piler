package br.com.hu3piler.model;

import java.util.LinkedList;

public class Expression {
	private LinkedList<Item> itemList;
	private int line;
	
	public Expression() {
		itemList = new LinkedList<Item>();
		line = 0;
	}

	public LinkedList<Item> getItemList() {
		return itemList;
	}

	public void setItemList(LinkedList<Item> itemList) {
		this.itemList = itemList;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}
	
	public void addItem(Item item) {
		this.itemList.add(item);
	}
	
	public boolean checkOnlyConstants() {
		for(Item item : itemList) {
			if(item.getType().getValor() == 8) {
				return false;
			}
		}
		return true;
	}
}
