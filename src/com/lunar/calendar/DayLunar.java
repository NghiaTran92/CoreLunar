package com.lunar.calendar;

import com.lunar.type.TypeChi;
import com.lunar.type.TypeLunarDay;

public class DayLunar {
	public String nameOfDay;
	public TypeLunarDay typeDay;
	public TypeChi chiOfDay;
	public DayLunar( String nameOfDay, TypeLunarDay typeDay,
			TypeChi chiOfDay ) {
		
		this.nameOfDay = nameOfDay;
		this.typeDay = typeDay;
		this.chiOfDay = chiOfDay;
	}
}
