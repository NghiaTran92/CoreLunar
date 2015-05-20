package com.lunar.type;

public enum TypeCan {
	Giap, At, Binh, Dinh, Mau, Ky, Canh, Tan, Nham, Quy;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		switch (this) {
		case Giap:
			result="Giáp";
			break;

		case At:
			result="Ất";
			break;
		case Binh:
			result="Bính";
			break;
		case Dinh:
			result="Đinh";
			break;
		case Mau:
			result="Mậu";
			break;
		case Ky:
			result="Kỷ";
			break;
		case Canh:
			result="Canh";
			break;
		case Tan:
			result="Tân";
			break;
		case Nham:
			result="Nhâm";
			break;
		case Quy:
			result="Quý";
			break;
		default:
			break;
		}
		return result;
	}
}
