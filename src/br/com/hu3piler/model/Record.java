package br.com.hu3piler.model;

import java.util.HashMap;

public class Record {
	private HashMap<String, Symbol> keeper;
	
	public boolean addSymbol(Symbol symbol) {
		if(this.keeper.containsKey(symbol.getName())) {
			return false;
		} else {
			this.keeper.put(symbol.getName(), symbol);
			return true;
		}
	}
	
	public Symbol getSymbolByName(String name) {
		return this.keeper.get(name);
	}
	
	public boolean checkSymbol(String name) {
		return this.keeper.containsKey(name);
	}
	
	
	
}
