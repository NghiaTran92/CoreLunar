package com.lunar.type;

/*
 * Theo chu ki 60 nam
 * 
 - Giáp Tí, Ất Sửu : Hải Trung Kim
 - Giáp Dần, Ất Mão : �?ại Khê Thủy
 - Giáp Thìn, Ất Tỵ : Phú �?ăng Hoả
 - Giáp Ng�?, Ất Mùi : Sa Trung Kim
 - Giáp Thân, Ất Dậu : Tuy�?n Trung Thủy
 - Giáp Tuất, Ất Hợi : Sơn �?ầu Hoả
 - Bính Tí, �?inh Sửu : Giản Khê Thuỷ
 - Bính Dần, �?inh Mão : Lô Trung Hoả
 - Bính Thìn, �?inh Tỵ : Sa Trung Thổ
 - Bính Ng�?, �?inh Mùi : Thiên Hà Thuỷ
 - Bính Thân, �?inh Dậu : Sơn Hạ Hoả
 - Bính Tuất, �?inh Hợi : �?c Thượng Thổ
 - Mậu Tí, Kỷ Sửu : Tích Lịch Hoả
 - Mậu Dần, Kỷ Mão : Thành �?ầu Thổ
 - Mậu Thìn, Kỷ Tỵ : �?ại Lâm Mộc
 - Mậu Ng�?, Kỷ Mùi : Thiên Thượng Hoả
 - Mậu Thân, Kỷ Dậu : �?ại Trạch Thổ
 - Mậu Tuất, Kỷ Hợi : Bình �?ịa Mộc
 - Canh Tí, Tân Sửu : Bích Thượng Thổ
 - Canh Dần, Tân Mão : Tùng Bách Mộc
 - Canh Thìn, Tân Tỵ : Bạch Lạp Kim
 - Canh Ng�?, Tân Mùi : Lộ Biên Thổ
 - Canh Thân, Tân Dậu : Thạch Lựu Mộc
 - Canh Tuất, Tân Hợi : Thoa Xuyến Kim
 - Nhâm Tí, Quý Sửu : Tang Chá Mộc
 - Nhâm Dần, Quý Mão : Bạch Lạp Kim
 - Nhâm Thìn, Quý Tỵ : Trư�?ng Lưu Thuỷ
 - Nhâm Ng�?, Quý Mùi : Dương Liễu Mộc
 - Nhâm Thân, Quý Dậu : Kiếm Phong Kim
 - Nhâm Tuất, Quý Hợi : �?ại Hải Thuỷ

 * */
public enum TypeMenh {
	/** Hải Trung Kim */
	HaiTrungKim {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Lư Trung H�?a */
	LuTrungHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** �?ại Lâm Mộc */
	DaiLamMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** Lộ Bàng Thổ */
	LoBangTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Kiếm Phong Kim */
	KiemPhongKim {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Sơn �?ầu H�?a */
	SonDauHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Giang Hà Thủy */
	GiangHaThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** Thành �?ầu Thổ */
	ThanhDauTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Bạch Lạp Kim */
	BachLapKim {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Dương Liễu Mộc */
	DuongLieuMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** Tuy�?n Trung Thủy */
	TuyenTrungThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** �?c Thượng Thổ */
	OcThuongTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Thích Lịch H�?a */
	ThichLichHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Tùng Bách Mộc */
	TungBachMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** Trư�?ng Lưu Thủy */
	TruongLuuThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** Sa Trung Kim */
	SaTrungKim {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Sơn Hạ H�?a */
	SonHaHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Bình �?ịa Mộc */
	BinhDiaMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** Bích Thượng Thổ */
	BichThuongTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Kim Bạc Kim */
	KimBacKim {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Phúc �?ăng H�?a */
	PhucDangHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Thiên Hà Thủy */
	ThienHaThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** �?ại Trạch Thổ */
	DaiTrachTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Thoa Xuyến Kim */
	ThoaXuyenKim {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Tang �?ố Mộc */
	TangDoMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** �?ại Khê Thủy */
	DaiKheThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** Sa Trung Thổ */
	SaTrungTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Thiên Thượng H�?a */
	ThienThuongHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Thạch Lựu Mộc */
	ThachLuuMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** �?ại Hải Thủy */
	DaiHaiThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/**Unknow*/
	Unknown {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Unknown;
		}
	};

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		switch (this) {
		case HaiTrungKim:
			result = "Hải Trung Kim";
			break;
		case LuTrungHoa:
			result = "Lư Trung H�?a";
			break;
		case DaiLamMoc:
			result = "�?ại Lâm Mộc";
			break;
		case LoBangTho:
			result = "Lộ Bàng Thổ";
			break;
		case KiemPhongKim:
			result = "Kiến Phong Kim";
			break;
		case SonDauHoa:
			result = "Sơn �?ầu H�?a";
			break;
		case GiangHaThuy:
			result = "Giang Hà Thủy";
			break;
		case ThanhDauTho:
			result = "Thành �?ầu Thổ";
			break;
		case BachLapKim:
			result = "Bạch Lạp Kim";
			break;
		case DuongLieuMoc:
			result = "Dương Liễu Mộc";
			break;
		case TuyenTrungThuy:
			result = "Tuy�?n Trung Thủy";
			break;
		case OcThuongTho:
			result = "�?c Thượng Thổ";
			break;
		case ThichLichHoa:
			result = "Thích Lịch H�?a";
			break;
		case TungBachMoc:
			result = "Tùng Bách Mộc";
			break;
		case TruongLuuThuy:
			result = "Trư�?ng Lưu Thủy";
			break;
		case SaTrungKim:
			result = "Sa Trung Kim";
			break;
		case SonHaHoa:
			result = "Sơn Hạ H�?a";
			break;
		case BinhDiaMoc:
			result = "Bình �?ịa Mộc";
			break;
		case BichThuongTho:
			result = "Bích Thượng Thổ";
			break;
		case KimBacKim:
			result = "Kim Bạc Kim";
			break;
		case PhucDangHoa:
			result = "Phúc �?ăng H�?a";
			break;
		case ThienHaThuy:
			result = "�?ại Trạch Thổ";
			break;
		case ThoaXuyenKim:
			result = "Thoa Xuyến Kim";
			break;
		case TangDoMoc:
			result = "Tang �?ố Mộc";
			break;
		case DaiKheThuy:
			result = "�?ại Khê Thủy";
			break;
		case SaTrungTho:
			result = "Sa Trung Thổ";
			break;
		case ThienThuongHoa:
			result = "Thiên Thượng H�?a";
			break;
		case ThachLuuMoc:
			result = "Thạch Lựu Mộc";
			break;
		case DaiHaiThuy:
			result = "�?ại Hải Thủy";
			break;

		default:
			result="Unkknown";
			break;
		}
		return result;
	}
	public abstract TypeNguHanh getNguHanh();
	
}
