package com.lunar.type;

/*http://www.blogphongthuy.com/menh-cung-dung-trong-phong-thuy.html
*
*/
public enum TypeStar {
	/** Sao Tham Lang thuộc Mộc – Sinh Khí */
	SinhKhi,
	/** Sao Cự Môn thuộc Thổ – Thiên Y */
	ThienY,
	/** Sao Vũ Khúc thuộc Kim – Phúc Đức (Diên niên) */
	PhucDuc,
	/** Sao Phụ Bật thuộc Thuỷ – Phục Vị */
	PhucVi,
	/** Sao Lộc Tồn thuộc Thổ – Hoạ Hại */
	HoaHai,
	/** Sao Văn Khúc thuộc Thuỷ – Lục Sát */
	LucSat,
	/** Sao Phá Quân thuộc Kim – Tuyệt Mệnh */
	TuyetMenh,
	/** Sao Liêm Trinh thuộc Hoả – Ngũ Quỷ */
	NguQuy;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		switch (this) {
		case SinhKhi:
			result = "Sinh Khí";
			break;
		case ThienY:
			result = "Thiên Y";
			break;
		case PhucDuc:
			result = "Phúc Đức";
			break;
		case PhucVi:
			result = "Phục Vị";
			break;
		case HoaHai:
			result = "Họa Hại";
			break;
		case LucSat:
			result = "Lục Sát";
			break;
		case TuyetMenh:
			result = "Tuyệt Mệnh";
			break;
		case NguQuy:
			result = "Ngũ Quỷ";
			break;
		default:
			break;
		}
		return result;
	}

}
