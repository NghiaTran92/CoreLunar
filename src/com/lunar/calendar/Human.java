package com.lunar.calendar;



import com.lunar.type.TypeCan;
import com.lunar.type.TypeChi;
import com.lunar.type.TypeCung;
import com.lunar.type.TypeDiaChi;
import com.lunar.type.TypeMenh;
import com.lunar.type.TypeNguHanh;
import com.lunar.type.TypeQuality;
import com.lunar.type.TypeSex;
import com.lunar.type.TypeStar;
import com.lunar.util.DateTime;

public class Human {
	
	private DateTime birthDay;
	private DateTime birthDayLunar;
	private int julianDay;
	private TypeCan birthYearCan;
	private TypeChi birthYearChi;
	
	private TypeMenh menh;
	private TypeCung cung;
	private TypeSex sex;
	
	private double DEFAULT_TIME_ZONE=0;
	
	/**
	 * DEFAULT_TIME_ZONE=0;
	 * */
	public Human( DateTime birthDay, TypeSex sex ) {
		this(birthDay,sex,0);
	}
	
	public Human( DateTime birthDay, TypeSex sex, double timeZone ) {
		this.birthDay = birthDay;
		this.sex = sex;
		this.DEFAULT_TIME_ZONE=timeZone;
		init();
	}
	
	@SuppressWarnings( "deprecation" )
	private void init(){
		julianDay=VietCalendar.jdFromDate(birthDay.getDate(), birthDay.getMonth(), birthDay.getYear());
		int[] s = VietCalendar.jdToDate(julianDay);
		int[] l = VietCalendar.convertSolar2Lunar(s[0], s[1], s[2], DEFAULT_TIME_ZONE);
		birthDayLunar=new DateTime(l[2], l[1], l[0],birthDay.getHours(),birthDay.getMinutes(),birthDay.getSeconds());
		birthYearCan=VietCalendar.getCanOfYear(birthDayLunar.getYear());
		birthYearChi=VietCalendar.getChiOfYear(birthDayLunar.getYear());
		menh=VietCalendar.get_Menh(birthYearCan, birthYearChi);
		cung=VietCalendar.getCungOfYear(birthDayLunar.getYear(), sex);
	}
	
	
	@SuppressWarnings( "deprecation" )
	public String checkCanLuong(){
		int sum=new Relation().checkCanLuong(birthYearCan, birthYearChi, 
				birthDayLunar.getMonth(), birthDayLunar.getDate(),
				VietCalendar.getTypeGioChi((float)(birthDay.getHours()+birthDay.getMinutes()/60.0)));
		String result="";
		if(sum>0){
			result=String.format("%02d", sum);
			result=result.charAt(0)+" lượng "+result.charAt(1)+" chỉ";
			return result;
		}
		
		return "Unknown";
	}
	public TypeDiaChi[] checkDiaChi(TypeChi chiOther){
		return new Relation().checkDiaChi(birthYearChi, chiOther);
	}
	
	public TypeQuality checkThienCan(TypeCan canOther )
	{
		return new Relation().checkThienCan(birthYearCan, canOther);
	}
	
	public TypeQuality checkMenhNguHanh(TypeNguHanh nguHanhOther){
		return new Relation().checkNguHanh(menh.getNguHanh(), nguHanhOther);
	}
	
	public TypeStar checkCung(TypeCung cungOther){
		return new Relation().checkCungHopKhac(cung, cungOther);
	}
	
	public DateTime getBirthDay() {
		return birthDay;
	}

	public DateTime getBirthDayLunar() {
		return birthDayLunar;
	}

	public TypeCan getBirthYearCan() {
		return birthYearCan;
	}

	public TypeChi getBirthYearChi() {
		return birthYearChi;
	}

	public TypeMenh getMenh() {
		return menh;
	}

	public TypeCung getCung() {
		return cung;
	}

	public TypeSex getSex() {
		return sex;
	}
}
