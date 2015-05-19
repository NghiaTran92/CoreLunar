package com.lunar.type;


/*
 * Dung cho xem phong thuy
 * http://www.blogphongthuy.com/menh-cung-dung-trong-phong-thuy.html
*/
public enum TypeCung {
	/** Khảm */
	Kham {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Thuy;
		}
	},
	/** Ly */
	Ly {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Hoa;
		}
	},
	/** Cấn */
	Can {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** �?oài */
	Doai {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Càn */
	Ca_n {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Kim;
		}
	},
	/** Khôn */
	Khon {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Tho;
		}
	},
	/** Tốn */
	Ton {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	},
	/** Chấn */
	Chan {
		@Override
		public TypeNguHanh getNguHanh() {
			// TODO Auto-generated method stub
			return TypeNguHanh.Moc;
		}
	};
	@Override
	public String toString() {
		String result = "";
		switch (this) {
		case Kham:
			result="Khảm";
			break;
		case Ly:
			result="Ly";
			break;
		case Can:
			result="Cấn";
			break;
		case Doai:
			result="�?oài";
			break;
		case Ca_n:
			result="Càn";
			break;
		case Khon:
			result="Khôn";
			break;
		case Ton:
			result="Tốn";
			break;
		case Chan:
			result="Chấn";
			break;
		default:
			break;
		}
		return result;
	};
	
	public abstract TypeNguHanh getNguHanh();
}
