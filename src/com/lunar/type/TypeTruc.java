package com.lunar.type;

/**
 * http://www.xemngay.com/webLog.aspx?blog=wld&postid=6 Các loại trực (12 loại)
 * 
 * va chi tiet cua 1 truc http://maphuong.com/dichly/amlich2/12truc.htm
 * */
public enum TypeTruc {
	/** Kiến */
	Kien,
	/** Trừ */
	Tru,
	/** Mãn */
	Man,
	/** Bình */
	Binh,
	/** Định */
	Dinh,
	/** Chấp */
	Chap,
	/** Phá */
	Pha,
	/** Nguy */
	Nguy,
	/** Thành */
	Thanh,
	/** Thu */
	Thu,
	/** Khai */
	Khai,
	/** Bế */
	Be;
	@Override
	public String toString() {
		String result="";
		switch (this) {
		case Kien:
			result="Kiến";
			break;
		case Tru:
			result="Trừ";
			break;
		case Man:
			result="Mãn";
			break;
		case Binh:
			result="Bình";
			break;
		case Dinh:
			result="Định";
			break;
		case Chap:
			result="Chấp";
			break;
		case Pha:
			result="Phá";
			break;
		case Nguy:
			result="Nguy";
			break;
		case Thanh:
			result="Thành";
			break;
		case Thu:
			result="Thu";
			break;
		case Khai:
			result="Khai";
			break;
		case Be:
			result="Bế";
			break;
		default:
			break;
		}
		return result;
	}

}
