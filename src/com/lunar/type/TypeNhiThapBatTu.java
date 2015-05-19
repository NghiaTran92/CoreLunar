package com.lunar.type;


/*
 * http://maphuong.com/dichly/amlich2/28tu.htm
 * http://www.xemngay.com/webLog.aspx?blog=wld&postid=25
 * http://www.bachkhoatrithuc.vn/encyclopedia/3903-1035-633670097947396250/Nhung-kien-thuc-co-ban-ve-Lich-phap-co-dai-phuong-Dong-va-thuat-Chiem-tinh/Nhi-thap-bat-tu.htm*/
public enum TypeNhiThapBatTu {
	/** Chẩn */
	Chan,
	/** Giác */
	Giac,
	/** Cang */
	Cang,
	/** �?ê */
	De,
	/** Phòng */
	Phong,
	/** Tâm */
	Tam,
	/** Vỹ */
	Vy,
	/** Cơ */
	Co,
	/** �?ẩu */
	Dau,
	/** Ngưu */
	Nguu,
	/** Nữ */
	Nu,
	/** Hư */
	Hu,
	/** Nguy */
	Nguy,
	/** Thất */
	That,
	/** Bích */
	Bich,
	/** Khuê */
	Khue,
	/** Lâu */
	Lau,
	/** Vị */
	Vi_,
	/** Mão */
	Mao,
	/** Tất */
	Tat,
	/** Chủy */
	Chuy,
	/** Sâm */
	Sam,
	/** Tỉnh */
	Ti_nh,
	/** Quỷ */
	Quy,
	/** Liễu */
	Lieu,
	/** Tinh */
	Tinh,
	/** Trương */
	Truong,
	/** Dực */
	Duc;
	@Override
	public String toString() {
		String result = "";
		switch (this) {
		case Chan:
			result="Chẩn";
			break;
		case Giac:
			result="Giác";
			break;
		case Cang:
			result="Cang";
			break;
		case De:
			result="�?ê";
			break;
		case Phong:
			result="Phòng";
			break;
		case Tam:
			result="Tâm";
			break;
		case Vy:
			result="Vỹ";
			break;
		case Co:
			result="Cơ";
			break;
		case Dau:
			result="�?ẩu";
			break;
		case Nguu:
			result="Ngưu";
			break;
		case Nu:
			result="Nữ";
			break;
		case Hu:
			result="Hư";
			break;
		case Nguy:
			result="Nguy";
			break;
		case That:
			result="Thất";
			break;
		case Bich:
			result="Bích";
			break;
		case Khue:
			result="Khuê";
			break;
		case Lau:
			result="Lâu";
			break;
		case Vi_:
			result="Vị";
			break;
		case Mao:
			result="Mão";
			break;
		case Tat:
			result="Tất";
			break;
		case Chuy:
			result="Chủy";
			break;
		case Sam:
			result="Sâm";
			break;
		case Ti_nh:
			result="Tỉnh";
			break;
		case Quy:
			result="Quỷ";
			break;
		case Lieu:
			result="Liễu";
			break;
		case Tinh:
			result="Tinh";
			break;
		case Truong:
			result="Trương";
			break;
		case Duc:
			result="Dực";
			break;

		default:
			break;
		}
		return result;
	}
}
