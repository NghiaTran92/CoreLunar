package com.lunar.type;


/* Xem tuong sinh tuong khac
 * https://sites.google.com/site/xemboitrongngayhomnay/cach-xem-cung-menh
 * http://vansu.net/xem-tuoi-ket-hon-theo-ngu-hanh-thien-can-dia-chi.html
*/
public enum TypeNguHanh {
	/** Kim */
	Kim,
	/** Mộc */
	Moc,
	/** Thủy */
	Thuy,
	/** Hỏa */
	Hoa,
	/** Thổ */
	Tho,
	
	Unknown;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		switch (this) {
		case Kim:
			result = "Kim";
			break;
		case Moc:
			result = "Mộc";
			break;
		case Thuy:
			result = "Thủy";
			break;
		case Hoa:
			result = "Hỏa";
			break;
		case Tho:
			result = "Thổ";
			break;
		default:
			break;
		}
		return result;
	}
}
