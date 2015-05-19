package com.lunar.type;

public enum TypeQuality {
	Good("Tương sinh"),
	Bad("Tương khắc"),
	Normal("Bình");
	
	private final String value;
	
	private TypeQuality(String val){
		value=val;
	}
	public String getValue(){
		return value;
	}
}
