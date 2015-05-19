package com.lunar.type;

/*http://www.phongthuygia.vn/tham-khao-tuoi-ket-hon-cho-ban-theo-thap-nhi-dia-chi-thien-can-hop-khac-ngu-hanh-nap-am-sinh-khac.html*/
public enum TypeDiaChi {
	/** Tam hợp */
	TamHop,
	/** Lục hợp */
	LucHop,
	/** Lục xung */
	LucXung,
	/** Tứ hành xung */
	TuHanhXung,
	/** Xung */
	Xung,
	/** Kỵ */
	Ky,
	/** Tứ tuyệt */
	TuTuyet,
	/** Lục Hại */
	LucHai,
	/** Bình thư�?ng */
	Binh;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		switch (this) {
		case TamHop:
			result="Tam hợp (tốt)";
			break;
		case LucHop:
			result="Lục hợp (tốt)";
			break;
		case LucXung:
			result="Lục xung (xấu)";
			break;
		case TuHanhXung:
			result="Tứ hành xung (xấu)";
			break;
		case Xung:
			result="Xung (xấu)";
			break;
		case Ky:
			result="Kỵ (xấu)";
			break;
		case TuTuyet:
			result="Tứ tuyệt (xấu)";
			break;
		case LucHai:
			result="Lục hại (xấu)";
			break;
		default:
			result="Bình";
			break;
		}
		return result;
	}
}
