package com.lunar.util;

import java.util.Date;

@SuppressWarnings( "serial" )
public class DateTime extends Date {
	
	/**
	 * 
	 * */
	public  DateTime(int year,int month,int date) {
		// TODO Auto-generated constructor stub
		this(year, month, date, 0, 0, 0);
	}
	
	public DateTime(int year,int month,int date,int hours,int minutes){
		this(year, month, date, hours, minutes, 0);
	}
	
	@SuppressWarnings( "deprecation" )
	public DateTime(int year,int month,int date,int hours,int minutes,int second){
		super(year-1900, month-1, date, hours, minutes, second);
	}
	
	
	
	/**
	 * 
	 * 
	 * month change from [0,11] to [1,12];
	 * */
	@SuppressWarnings( "deprecation" )
	@Override
	public int getMonth() {
		// TODO Auto-generated method stub
		return super.getMonth()+1;
	}
	
	@SuppressWarnings( "deprecation" )
	@Override
	public int getYear() {
		// TODO Auto-generated method stub
		return super.getYear()+1900;
	}
	
	@SuppressWarnings( "deprecation" )
	@Override
	public void setMonth( int month ) {
		// TODO Auto-generated method stub
		super.setMonth(month-1);
	}
	
	@SuppressWarnings( "deprecation" )
	@Override
	public void setYear( int year ) {
		// TODO Auto-generated method stub
		super.setYear(year-1900);
	}
	
}
