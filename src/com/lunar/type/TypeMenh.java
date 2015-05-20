package com.lunar.type;

/*
 * Theo chu ki 60 nam
 * 
 http://www.handheld.com.vn/threads/lam-the-nao-tinh-duoc-menh-cua-minh-tu-nam-sinh-am-lich.115368/
 - Giáp Tí, Ất Sửu : Hải Trung Kim
 - Giáp Dần, Ất Mão : Đại Khê Thủy
 - Giáp Thìn, Ất Tỵ : Phú Đăng Hoả
 - Giáp Ngọ, Ất Mùi : Sa Trung Kim
 - Giáp Thân, Ất Dậu : Tuyền Trung Thủy
 - Giáp Tuất, Ất Hợi : Sơn Đầu Hoả
 - Bính Tí, Đinh Sửu : Giản Khê Thuỷ
 - Bính Dần, Đinh Mão : Lô Trung Hoả
 - Bính Thìn, Đinh Tỵ : Sa Trung Thổ
 - Bính Ngọ, Đinh Mùi : Thiên Hà Thuỷ
 - Bính Thân, Đinh Dậu : Sơn Hạ Hoả
 - Bính Tuất, Đinh Hợi : Ốc Thượng Thổ
 - Mậu Tí, Kỷ Sửu : Tích Lịch Hoả
 - Mậu Dần, Kỷ Mão : Thành Đầu Thổ
 - Mậu Thìn, Kỷ Tỵ : Đại Lâm Mộc
 - Mậu Ngọ, Kỷ Mùi : Thiên Thượng Hoả
 - Mậu Thân, Kỷ Dậu : Đại Trạch Thổ
 - Mậu Tuất, Kỷ Hợi : Bình Địa Mộc
 - Canh Tí, Tân Sửu : Bích Thượng Thổ
 - Canh Dần, Tân Mão : Tùng Bách Mộc
 - Canh Thìn, Tân Tỵ : Bạch Lạp Kim
 - Canh Ngọ, Tân Mùi : Lộ Biên Thổ
 - Canh Thân, Tân Dậu : Thạch Lựu Mộc
 - Canh Tuất, Tân Hợi : Thoa Xuyến Kim
 - Nhâm Tí, Quý Sửu : Tang Chá Mộc
 - Nhâm Dần, Quý Mão : Bạch Lạp Kim
 - Nhâm Thìn, Quý Tỵ : Trường Lưu Thuỷ
 - Nhâm Ngọ, Quý Mùi : Dương Liễu Mộc
 - Nhâm Thân, Quý Dậu : Kiếm Phong Kim
 - Nhâm Tuất, Quý Hợi : Đại Hải Thuỷ

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
	/** Lư Trung Hỏa */
	LuTrungHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Đại Lâm Mộc */
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
	/** Sơn Đầu Hỏa */
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
	/** Thành Đầu Thổ */
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
	/** Tuyền Trung Thủy */
	TuyenTrungThuy {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** Ốc Thượng Thổ */
	OcThuongTho {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Thích Lịch Hỏa */
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
	/** Trường Lưu Thủy */
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
	/** Sơn Hạ Hỏa */
	SonHaHoa {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Bình Địa Mộc */
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
	/** Phúc Đăng Hỏa */
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
	/** Đại Trạch Thổ */
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
	/** Tang Đố Mộc */
	TangDoMoc {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** Đại Khê Thủy */
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
	/** Thiên Thượng Hỏa */
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
	/** Đại Hải Thủy */
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
			result = "Lư Trung Hỏa";
			break;
		case DaiLamMoc:
			result = "Đại Lâm Mộc";
			break;
		case LoBangTho:
			result = "Lộ Bàng Thổ";
			break;
		case KiemPhongKim:
			result = "Kiến Phong Kim";
			break;
		case SonDauHoa:
			result = "Sơn Đầu Hỏa";
			break;
		case GiangHaThuy:
			result = "Giang Hà Thủy";
			break;
		case ThanhDauTho:
			result = "Thành Đầu Thổ";
			break;
		case BachLapKim:
			result = "Bạch Lạp Kim";
			break;
		case DuongLieuMoc:
			result = "Dương Liễu Mộc";
			break;
		case TuyenTrungThuy:
			result = "Tuyền Trung Thủy";
			break;
		case OcThuongTho:
			result = "Ốc Thượng Thổ";
			break;
		case ThichLichHoa:
			result = "Thích Lịch H�?a";
			break;
		case TungBachMoc:
			result = "Tùng Bách Mộc";
			break;
		case TruongLuuThuy:
			result = "Trường Lưu Thủy";
			break;
		case SaTrungKim:
			result = "Sa Trung Kim";
			break;
		case SonHaHoa:
			result = "Sơn Hạ Hỏa";
			break;
		case BinhDiaMoc:
			result = "Bình Địa Mộc";
			break;
		case BichThuongTho:
			result = "Bích Thượng Thổ";
			break;
		case KimBacKim:
			result = "Kim Bạc Kim";
			break;
		case PhucDangHoa:
			result = "Phúc Đăng Hỏa";
			break;
		case ThienHaThuy:
			result = "Thiên Hà Thủy";
			break;
		case ThoaXuyenKim:
			result = "Thoa Xuyến Kim";
			break;
		case TangDoMoc:
			result = "Tang Đố Mộc";
			break;
		case DaiKheThuy:
			result = "Đại Khê Thủy";
			break;
		case SaTrungTho:
			result = "Sa Trung Thổ";
			break;
		case ThienThuongHoa:
			result = "Thiên Thượng Hỏa";
			break;
		case ThachLuuMoc:
			result = "Thạch Lựu Mộc";
			break;
		case DaiHaiThuy:
			result = "Đại Hải Thủy";
			break;

		default:
			result="Unkknown";
			break;
		}
		return result;
	}
	public abstract TypeNguHanh getNguHanh();
	
}
