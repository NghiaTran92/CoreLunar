package com.lunar.type;

public enum TypeSex {
	Male(1),
	Female(0);
	
	private int value;
	private TypeSex(int val){
		value=val;
	}
	public int getValue(){
		return value;
	}
}
