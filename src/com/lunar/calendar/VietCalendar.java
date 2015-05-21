package com.lunar.calendar;

import com.lunar.math.MathFunc;
import com.lunar.type.TypeCan;
import com.lunar.type.TypeChi;
import com.lunar.type.TypeCung;
import com.lunar.type.TypeLunarDay;
import com.lunar.type.TypeMenh;
import com.lunar.type.TypeNhiThapBatTu;
import com.lunar.type.TypeSex;
import com.lunar.type.TypeTruc;

public class VietCalendar {

	public static String[] CAN = new String[] { "Giáp", "Ất", "Bính", "Đinh",
			"Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý" };

	public static String[] CHI = new String[] { "Tý", "Sửu", "Dần", "Mão",
			"Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi" };

	public static String[] Gio_HD = new String[] { "110100101100",
			"001101001011", "110011010010", "101100110100", "001011001101",
			"010010110011" };

	public static String[] TIET_KHI = new String[] { "Xuân phân", "Thanh minh",
			"Cốc vũ", "Lập hạ", "Tiểu mãn", "Mang chủng", "Hạ chí", "Tiểu thử",
			"Đại thử", "Lập thu", "Xử thử", "Bạch lộ", "Thu phân", "Hàn lộ",
			"Sương giáng", "Lập đông", "Tiểu tuyết", "Đại tuyết", "Đông chí",
			"Tiểu hàn", "Đại hàn", "Lập xuân", "Vũ Thủy", "Kinh trập" };

	
	/**Bang tinh cung
	 * BANG_CUNG[sex][mod]
	 * chi tiet https://sites.google.com/site/xemboitrongngayhomnay/cach-xem-cung-menh
	 * */
	public static TypeCung[][] BANG_CUNG=new TypeCung[][]{
		
		/*Female*/
		{
			TypeCung.Ton,TypeCung.Can,TypeCung.Ca_n,TypeCung.Doai,TypeCung.Can,TypeCung.Ly,TypeCung.Kham,TypeCung.Khon,TypeCung.Chan
		},
		/*Male*/
		{
			TypeCung.Khon,TypeCung.Kham,TypeCung.Ly,TypeCung.Can,TypeCung.Doai,TypeCung.Ca_n,TypeCung.Khon,TypeCung.Ton,TypeCung.Chan
		}
	};
	
	/**BANG_MENH[can][chi]*/
	public static TypeMenh[][] BANG_MENH=new TypeMenh[][]{
		/*Can: Giáp*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.HaiTrungKim,TypeMenh.Unknown,
			TypeMenh.DaiKheThuy,TypeMenh.Unknown,
			TypeMenh.PhucDangHoa,TypeMenh.Unknown,
			TypeMenh.SaTrungKim,TypeMenh.Unknown,
			TypeMenh.TuyenTrungThuy,TypeMenh.Unknown,
			TypeMenh.SonDauHoa,TypeMenh.Unknown
		},
		/*Can: Ất*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.Unknown,TypeMenh.HaiTrungKim,
			TypeMenh.Unknown,TypeMenh.DaiKheThuy,
			TypeMenh.Unknown,TypeMenh.PhucDangHoa,
			TypeMenh.Unknown,TypeMenh.SaTrungKim,
			TypeMenh.Unknown,TypeMenh.TuyenTrungThuy,
			TypeMenh.Unknown,TypeMenh.SonDauHoa
		},
		/*Can: Bính*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.GiangHaThuy,TypeMenh.Unknown,
			TypeMenh.LuTrungHoa,TypeMenh.Unknown,
			TypeMenh.SaTrungTho,TypeMenh.Unknown,
			TypeMenh.ThienHaThuy,TypeMenh.Unknown,
			TypeMenh.SonHaHoa,TypeMenh.Unknown,
			TypeMenh.OcThuongTho,TypeMenh.Unknown
		},
		/*Can: Đinh*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.Unknown,TypeMenh.GiangHaThuy,
			TypeMenh.Unknown,TypeMenh.LuTrungHoa,
			TypeMenh.Unknown,TypeMenh.SaTrungTho,
			TypeMenh.Unknown,TypeMenh.ThienHaThuy,
			TypeMenh.Unknown,TypeMenh.SonHaHoa,
			TypeMenh.Unknown,TypeMenh.OcThuongTho
		},
		/*Can: Mậu*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.ThichLichHoa,TypeMenh.Unknown,
			TypeMenh.ThanhDauTho,TypeMenh.Unknown,
			TypeMenh.DaiLamMoc,TypeMenh.Unknown,
			TypeMenh.ThienThuongHoa,TypeMenh.Unknown,
			TypeMenh.DaiTrachTho,TypeMenh.Unknown,
			TypeMenh.BinhDiaMoc,TypeMenh.Unknown
		},
		/*Can: Kỷ*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.Unknown,TypeMenh.ThichLichHoa,
			TypeMenh.Unknown,TypeMenh.ThanhDauTho,
			TypeMenh.Unknown,TypeMenh.DaiLamMoc,
			TypeMenh.Unknown,TypeMenh.ThienThuongHoa,
			TypeMenh.Unknown,TypeMenh.DaiTrachTho,
			TypeMenh.Unknown,TypeMenh.BinhDiaMoc
		},
		/*Can: Canh*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.BichThuongTho,TypeMenh.Unknown,
			TypeMenh.TungBachMoc,TypeMenh.Unknown,
			TypeMenh.BachLapKim,TypeMenh.Unknown,
			TypeMenh.LoBangTho,TypeMenh.Unknown,
			TypeMenh.ThachLuuMoc,TypeMenh.Unknown,
			TypeMenh.ThoaXuyenKim,TypeMenh.Unknown
		},
		/*Can: Tân*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.Unknown,TypeMenh.BichThuongTho,
			TypeMenh.Unknown,TypeMenh.TungBachMoc,
			TypeMenh.Unknown,TypeMenh.BachLapKim,
			TypeMenh.Unknown,TypeMenh.LoBangTho,
			TypeMenh.Unknown,TypeMenh.ThachLuuMoc,
			TypeMenh.Unknown,TypeMenh.ThoaXuyenKim
		},
		/*Can: Nhâm*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.TangDoMoc,TypeMenh.Unknown,
			TypeMenh.BachLapKim,TypeMenh.Unknown,
			TypeMenh.TruongLuuThuy,TypeMenh.Unknown,
			TypeMenh.DuongLieuMoc,TypeMenh.Unknown,
			TypeMenh.KiemPhongKim,TypeMenh.Unknown,
			TypeMenh.DaiHaiThuy,TypeMenh.Unknown
		},
		/*Can: Quý*/
		{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeMenh.Unknown,TypeMenh.TangDoMoc,
			TypeMenh.Unknown,TypeMenh.BachLapKim,
			TypeMenh.Unknown,TypeMenh.TruongLuuThuy,
			TypeMenh.Unknown,TypeMenh.DuongLieuMoc,
			TypeMenh.Unknown,TypeMenh.KiemPhongKim,
			TypeMenh.Unknown,TypeMenh.DaiHaiThuy
		}
	};
	
	
	/*
	 * Theo bang http://www.xemngay.com/webLog.aspx?blog=wld&postid=6
	 */
	/**BANG_TRA_TRUC[month][chi]*/
	public static TypeTruc[][] BANG_TRA_TRUC = new TypeTruc[][] {
			/* Thang 1 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Khai, TypeTruc.Be, TypeTruc.Kien, TypeTruc.Tru,
					TypeTruc.Man, TypeTruc.Binh, TypeTruc.Dinh, TypeTruc.Chap,
					TypeTruc.Pha, TypeTruc.Nguy, TypeTruc.Thanh, TypeTruc.Thu },
			/* Thang 2 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Thu, TypeTruc.Khai, TypeTruc.Be, TypeTruc.Kien,
					TypeTruc.Tru, TypeTruc.Man, TypeTruc.Binh, TypeTruc.Dinh,
					TypeTruc.Chap, TypeTruc.Pha, TypeTruc.Nguy, TypeTruc.Thanh },
			/* Thang 3 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Thanh, TypeTruc.Thu, TypeTruc.Khai, TypeTruc.Be,
					TypeTruc.Kien, TypeTruc.Tru, TypeTruc.Man, TypeTruc.Binh,
					TypeTruc.Dinh, TypeTruc.Chap, TypeTruc.Pha, TypeTruc.Nguy },
			/* Thang 4 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Nguy, TypeTruc.Thanh, TypeTruc.Thu, TypeTruc.Khai,
					TypeTruc.Be, TypeTruc.Kien, TypeTruc.Tru, TypeTruc.Man,
					TypeTruc.Binh, TypeTruc.Dinh, TypeTruc.Chap, TypeTruc.Pha },
			/* Thang 5 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Pha, TypeTruc.Nguy, TypeTruc.Thanh, TypeTruc.Thu,
					TypeTruc.Khai, TypeTruc.Be, TypeTruc.Kien, TypeTruc.Tru,
					TypeTruc.Man, TypeTruc.Binh, TypeTruc.Dinh, TypeTruc.Chap },
			/* Thang 6 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Chap, TypeTruc.Pha, TypeTruc.Nguy, TypeTruc.Thanh,
					TypeTruc.Thu, TypeTruc.Khai, TypeTruc.Be, TypeTruc.Kien,
					TypeTruc.Tru, TypeTruc.Man, TypeTruc.Binh, TypeTruc.Dinh },
			/* Thang 7 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Dinh, TypeTruc.Chap, TypeTruc.Pha, TypeTruc.Nguy,
					TypeTruc.Thanh, TypeTruc.Thu, TypeTruc.Khai, TypeTruc.Be,
					TypeTruc.Kien, TypeTruc.Tru, TypeTruc.Man, TypeTruc.Binh },
			/* Thang 8 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Binh, TypeTruc.Dinh, TypeTruc.Chap, TypeTruc.Pha,
					TypeTruc.Nguy, TypeTruc.Thanh, TypeTruc.Thu, TypeTruc.Khai,
					TypeTruc.Be, TypeTruc.Kien, TypeTruc.Tru, TypeTruc.Man },
			/* Thang 9 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Man, TypeTruc.Binh, TypeTruc.Dinh, TypeTruc.Chap,
					TypeTruc.Pha, TypeTruc.Nguy, TypeTruc.Thanh, TypeTruc.Thu,
					TypeTruc.Khai, TypeTruc.Be, TypeTruc.Kien, TypeTruc.Tru },
			/* Thang 10 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Tru, TypeTruc.Man, TypeTruc.Binh, TypeTruc.Dinh,
					TypeTruc.Chap, TypeTruc.Pha, TypeTruc.Nguy, TypeTruc.Thanh,
					TypeTruc.Thu, TypeTruc.Khai, TypeTruc.Be, TypeTruc.Kien },
			/* Thang 11 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Kien, TypeTruc.Tru, TypeTruc.Man, TypeTruc.Binh,
					TypeTruc.Dinh, TypeTruc.Chap, TypeTruc.Pha, TypeTruc.Nguy,
					TypeTruc.Thanh, TypeTruc.Thu, TypeTruc.Khai, TypeTruc.Be },
			/* Thang 12 */
			{
			/* ty, suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
			TypeTruc.Be, TypeTruc.Kien, TypeTruc.Tru, TypeTruc.Man,
					TypeTruc.Binh, TypeTruc.Dinh, TypeTruc.Chap, TypeTruc.Pha,
					TypeTruc.Nguy, TypeTruc.Thanh, TypeTruc.Thu, TypeTruc.Khai },

	};

	/*
	 * Theo bang 1
	 * https://sites.google.com/site/binhan8289/--trang-tin-tuc-can-biet/nhung-tin-bai-suu-tam/ngay-goi-hoang-dao---hac-dao
	 */
	public static DayLunar[][] BANG_HOANG_DAO_HAC_DAO = new DayLunar[][] {
			/* Thang Gieng */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay, TypeChi.Ty),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Suu),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay, TypeChi.Dan),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Mao),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Thin),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Ti_),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Ngo),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Mui),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Than),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Dau),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Tuat),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Hoi) },
			/* Thang 2 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Dan),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Mao),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay,
							TypeChi.Thin),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Ti_),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Ngo),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Mui),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Than),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Dau),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Tuat),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Hoi),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Ty),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Suu) },
			/* Thang 3 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Thin),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Ti_),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay, TypeChi.Ngo),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Mui),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Than),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Dau),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Tuat),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Hoi),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Ty),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Suu),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Dan),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Mao) },
			/* Thang 4 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Ngo),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Mui),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay,
							TypeChi.Than),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Dau),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Tuat),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Hoi),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Ty),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Suu),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Dan),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Mao),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Thin),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Ti_) },
			/* Thang 5 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Than),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Dau),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay,
							TypeChi.Tuat),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Hoi),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Ty),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Suu),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Dan),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Mao),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Thin),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Ti_),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Ngo),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Mui) },
			/* Thang 6 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Tuat),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Hoi),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay, TypeChi.Ty),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Suu),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Dan),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Mao),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Thin),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Ti_),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Ngo),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Mui),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Than),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Dau) },
			/* Thang 7 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay, TypeChi.Ty),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Suu),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay, TypeChi.Dan),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Mao),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Thin),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Ti_),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Ngo),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Mui),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Than),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Dau),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Tuat),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Hoi) },
			/* Thang 8 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Dan),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Mao),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay,
							TypeChi.Thin),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Ti_),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Ngo),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Mui),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Than),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Dau),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Tuat),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Hoi),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Ty),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Suu) },
			/* Thang 9 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Thin),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Ti_),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay, TypeChi.Ngo),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Mui),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Than),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Dau),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Tuat),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Hoi),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Ty),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Suu),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Dan),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Mao) },
			/* Thang 10 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Ngo),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Mui),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay,
							TypeChi.Than),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Dau),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Tuat),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Hoi),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Ty),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Suu),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Dan),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Mao),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Thin),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Ti_) },
			/* Thang 11 */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Than),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Dau),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay,
							TypeChi.Tuat),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Hoi),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Ty),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Suu),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Dan),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Mao),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Thin),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Ti_),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Ngo),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Mui) },
			/* Thang 12 - thang chap */
			{
					new DayLunar("Thanh Long", TypeLunarDay.GoodDay,
							TypeChi.Tuat),
					new DayLunar("Minh Đường", TypeLunarDay.GoodDay,
							TypeChi.Hoi),
					new DayLunar("Thiên Hình", TypeLunarDay.BadDay, TypeChi.Ty),
					new DayLunar("Chu Tước", TypeLunarDay.BadDay, TypeChi.Suu),
					new DayLunar("Kim Quỹ", TypeLunarDay.GoodDay, TypeChi.Dan),
					new DayLunar("Bảo Quang (Kim Đường)", TypeLunarDay.GoodDay,
							TypeChi.Mao),
					new DayLunar("Bạch Hổ", TypeLunarDay.BadDay, TypeChi.Thin),
					new DayLunar("Ngọc Đường", TypeLunarDay.GoodDay,
							TypeChi.Ti_),
					new DayLunar("Thiên Lao", TypeLunarDay.BadDay, TypeChi.Ngo),
					new DayLunar("Nguyên Vũ", TypeLunarDay.BadDay, TypeChi.Mui),
					new DayLunar("Tư Mệnh", TypeLunarDay.GoodDay, TypeChi.Than),
					new DayLunar("Câu Trận", TypeLunarDay.BadDay, TypeChi.Dau) } };

	public static final double PI = Math.PI;

	/**
	 *
	 * @param dd
	 * @param mm
	 * @param yy
	 * @return the number of days since 1 January 4713 BC (Julian calendar)
	 */
	public static int jdFromDate( int dd, int mm, int yy ) {
		int a = (14 - mm) / 12;
		int y = yy + 4800 - a;
		int m = mm + 12 * a - 3;
		int jd = dd + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400
				- 32045;
		if (jd < 2299161) {
			jd = dd + (153 * m + 2) / 5 + 365 * y + y / 4 - 32083;
		}
		// jd = jd - 1721425;
		return jd;
	}

	/**
	 * http://www.tondering.dk/claus/calendar.html Section: Is there a formula
	 * for calculating the Julian day number?
	 * 
	 * @param jd
	 *            - the number of days since 1 January 4713 BC (Julian calendar)
	 * @return
	 */
	public static int[] jdToDate( int jd ) {
		int a, b, c;
		if (jd > 2299160) { // After 5/10/1582, Gregorian calendar
			a = jd + 32044;
			b = (4 * a + 3) / 146097;
			c = a - (b * 146097) / 4;
		} else {
			b = 0;
			c = jd + 32082;
		}
		int d = (4 * c + 3) / 1461;
		int e = c - (1461 * d) / 4;
		int m = (5 * e + 2) / 153;
		int day = e - (153 * m + 2) / 5 + 1;
		int month = m + 3 - 12 * (m / 10);
		int year = b * 100 + d - 4800 + m / 10;
		return new int[] { day, month, year };
	}

	/**
	 * Solar longitude in degrees Algorithm from: Astronomical Algorithms, by
	 * Jean Meeus, 1998
	 * 
	 * @param jdn
	 *            - number of days since noon UTC on 1 January 4713 BC
	 * @return
	 */
	public static double SunLongitude( double jdn ) {
		// return CC2K.sunLongitude(jdn);
		return SunLongitudeAA98(jdn);
	}

	public static double SunLongitudeAA98( double jdn ) {
		double T = (jdn - 2451545.0) / 36525; // Time in Julian centuries from
												// 2000-01-01 12:00:00 GMT
		double T2 = T * T;
		double dr = PI / 180; // degree to radian
		double M = 357.52910 + 35999.05030 * T - 0.0001559 * T2 - 0.00000048
				* T * T2; // mean anomaly, degree
		double L0 = 280.46645 + 36000.76983 * T + 0.0003032 * T2; // mean
																	// longitude,
																	// degree
		double DL = (1.914600 - 0.004817 * T - 0.000014 * T2)
				* Math.sin(dr * M);
		DL = DL + (0.019993 - 0.000101 * T) * Math.sin(dr * 2 * M) + 0.000290
				* Math.sin(dr * 3 * M);
		double L = L0 + DL; // true longitude, degree
		L = L - 360 * (INT(L / 360)); // Normalize to (0, 360)
		return L;
	}

	public static double NewMoon( int k ) {
		// return CC2K.newMoonTime(k);
		return NewMoonAA98(k);
	}

	/**
	 * Julian day number of the kth new moon after (or before) the New Moon of
	 * 1900-01-01 13:51 GMT. Accuracy: 2 minutes Algorithm from: Astronomical
	 * Algorithms, by Jean Meeus, 1998
	 * 
	 * @param k
	 * @return the Julian date number (number of days since noon UTC on 1
	 *         January 4713 BC) of the New Moon
	 */

	public static double NewMoonAA98( int k ) {
		double T = k / 1236.85; // Time in Julian centuries from 1900 January
								// 0.5
		double T2 = T * T;
		double T3 = T2 * T;
		double dr = PI / 180;
		double Jd1 = 2415020.75933 + 29.53058868 * k + 0.0001178 * T2
				- 0.000000155 * T3;
		Jd1 = Jd1 + 0.00033
				* Math.sin((166.56 + 132.87 * T - 0.009173 * T2) * dr); // Mean
																		// new
																		// moon
		double M = 359.2242 + 29.10535608 * k - 0.0000333 * T2 - 0.00000347
				* T3; // Sun's mean anomaly
		double Mpr = 306.0253 + 385.81691806 * k + 0.0107306 * T2 + 0.00001236
				* T3; // Moon's mean anomaly
		double F = 21.2964 + 390.67050646 * k - 0.0016528 * T2 - 0.00000239
				* T3; // Moon's argument of latitude
		double C1 = (0.1734 - 0.000393 * T) * Math.sin(M * dr) + 0.0021
				* Math.sin(2 * dr * M);
		C1 = C1 - 0.4068 * Math.sin(Mpr * dr) + 0.0161 * Math.sin(dr * 2 * Mpr);
		C1 = C1 - 0.0004 * Math.sin(dr * 3 * Mpr);
		C1 = C1 + 0.0104 * Math.sin(dr * 2 * F) - 0.0051
				* Math.sin(dr * (M + Mpr));
		C1 = C1 - 0.0074 * Math.sin(dr * (M - Mpr)) + 0.0004
				* Math.sin(dr * (2 * F + M));
		C1 = C1 - 0.0004 * Math.sin(dr * (2 * F - M)) - 0.0006
				* Math.sin(dr * (2 * F + Mpr));
		C1 = C1 + 0.0010 * Math.sin(dr * (2 * F - Mpr)) + 0.0005
				* Math.sin(dr * (2 * Mpr + M));
		double deltat;
		if (T < -11) {
			deltat = 0.001 + 0.000839 * T + 0.0002261 * T2 - 0.00000845 * T3
					- 0.000000081 * T * T3;
		} else {
			deltat = -0.000278 + 0.000265 * T + 0.000262 * T2;
		}
		;
		double JdNew = Jd1 + C1 - deltat;
		return JdNew;
	}

	public static int INT( double d ) {
		return (int) Math.floor(d);
	}

	public static double getSunLongitude( int dayNumber, double timeZone ) {
		return SunLongitude(dayNumber - 0.5 - timeZone / 24);
	}

	public static int getNewMoonDay( int k, double timeZone ) {
		double jd = NewMoon(k);
		return INT(jd + 0.5 + timeZone / 24);
	}

	public static int getLunarMonth11( int yy, double timeZone ) {
		double off = jdFromDate(31, 12, yy) - 2415021.076998695;
		int k = INT(off / 29.530588853);
		int nm = getNewMoonDay(k, timeZone);
		int sunLong = INT(getSunLongitude(nm, timeZone) / 30);
		if (sunLong >= 9) {
			nm = getNewMoonDay(k - 1, timeZone);
		}
		return nm;
	}

	public static int getLeapMonthOffset( int a11, double timeZone ) {
		int k = INT(0.5 + (a11 - 2415021.076998695) / 29.530588853);
		int last; // Month 11 contains point of sun longutide 3*PI/2 (December
					// solstice)
		int i = 1; // We start with the month following lunar month 11
		int arc = INT(getSunLongitude(getNewMoonDay(k + i, timeZone), timeZone) / 30);
		do {
			last = arc;
			i++;
			arc = INT(getSunLongitude(getNewMoonDay(k + i, timeZone), timeZone) / 30);
		} while (arc != last && i < 14);
		return i - 1;
	}
	
	/**
	 * julianDay=VietCalendar.jdFromDate(birthDay.getDate(), birthDay.getMonth(), birthDay.getYear());
		int[] s = VietCalendar.jdToDate(julianDay);
		int[] l = VietCalendar.convertSolar2Lunar(s[0], s[1], s[2], DEFAULT_TIME_ZONE);
	 * 
	 * => 
	 * convertSolarDate2LunarDate(int dd,int mm,int yy,double timeZone);
	 * 
	 * @param dd 
	 * @param mm
	 * @param yy
	 * @param timeZone
	 * @return array of [lunarDay, lunarMonth, lunarYear, leapOrNot]
	 * 
	 * */
	public static int[] convertSolarDate2LunarDate(int dd,int mm,int yy,double timeZone){
		int julianDay=VietCalendar.jdFromDate(dd, mm, yy);
		int[] s = VietCalendar.jdToDate(julianDay);
		return VietCalendar.convertSolar2Lunar(s[0], s[1], s[2], timeZone);
	}
	
	
	/**
	 *
	 * @param dd 
	 * @param mm
	 * @param yy
	 * @param timeZone
	 * @return array of [lunarDay, lunarMonth, lunarYear, leapOrNot]
	 */
	public static int[] convertSolar2Lunar( int dd, int mm, int yy,
			double timeZone ) {
		int lunarDay, lunarMonth, lunarYear, lunarLeap;
		int dayNumber = jdFromDate(dd, mm, yy);
		int k = INT((dayNumber - 2415021.076998695) / 29.530588853);
		int monthStart = getNewMoonDay(k + 1, timeZone);
		if (monthStart > dayNumber) {
			monthStart = getNewMoonDay(k, timeZone);
		}
		int a11 = getLunarMonth11(yy, timeZone);
		int b11 = a11;
		if (a11 >= monthStart) {
			lunarYear = yy;
			a11 = getLunarMonth11(yy - 1, timeZone);
		} else {
			lunarYear = yy + 1;
			b11 = getLunarMonth11(yy + 1, timeZone);
		}
		lunarDay = dayNumber - monthStart + 1;
		int diff = INT((monthStart - a11) / 29);
		lunarLeap = 0;
		lunarMonth = diff + 11;
		if (b11 - a11 > 365) {
			int leapMonthDiff = getLeapMonthOffset(a11, timeZone);
			if (diff >= leapMonthDiff) {
				lunarMonth = diff + 10;
				if (diff == leapMonthDiff) {
					lunarLeap = 1;
				}
			}
		}
		if (lunarMonth > 12) {
			lunarMonth = lunarMonth - 12;
		}
		if (lunarMonth >= 11 && diff < 4) {
			lunarYear -= 1;
		}
		return new int[] { lunarDay, lunarMonth, lunarYear, lunarLeap };
	}

	public static int[] convertLunar2Solar( int lunarDay, int lunarMonth,
			int lunarYear, int lunarLeap, double timeZone ) {
		int a11, b11;
		if (lunarMonth < 11) {
			a11 = getLunarMonth11(lunarYear - 1, timeZone);
			b11 = getLunarMonth11(lunarYear, timeZone);
		} else {
			a11 = getLunarMonth11(lunarYear, timeZone);
			b11 = getLunarMonth11(lunarYear + 1, timeZone);
		}
		int k = INT(0.5 + (a11 - 2415021.076998695) / 29.530588853);
		int off = lunarMonth - 11;
		if (off < 0) {
			off += 12;
		}
		if (b11 - a11 > 365) {
			int leapOff = getLeapMonthOffset(a11, timeZone);
			int leapMonth = leapOff - 2;
			if (leapMonth < 0) {
				leapMonth += 12;
			}
			if (lunarLeap != 0 && lunarMonth != leapMonth) {
				System.out.println("Invalid input!");
				return new int[] { 0, 0, 0 };
			} else if (lunarLeap != 0 || off >= leapOff) {
				off += 1;
			}
		}
		int monthStart = getNewMoonDay(k + off, timeZone);
		return jdToDate(monthStart + lunarDay - 1);
	}

	public static String getLunar_CanChi_Year( int yy ) {
		return CAN[(yy + 6) % 10] + " " + CHI[(yy + 8) % 12];
	}

	public static String getLunar_CanChi_Month( int yy, int mm ) {
		return CAN[(yy * 12 + mm + 3) % 10] + " " + CHI[(mm + 1) % 12];
	}

	/**
	 * Julius Day: jd
	 */
	public static String getLunar_CanChi_Day( int jd ) {
		return CAN[(jd + 9) % 10] + " " + CHI[(jd + 1) % 12];
	}

	/**
	 * Julius Day: jd
	 */
	public static TypeChi get_Chi_Day( int jd ) {
		return TypeChi.values()[(jd + 1) % 12];
	}

	/**
	 * Compute the sun segment at start (00:00) of the day with the given
	 * integral Julian day number. The time zone if the time difference between
	 * local time and UTC: 7.0 for UTC+7:00. The function returns a number
	 * between 0 and 23. From the day after March equinox and the 1st major term
	 * after March equinox, 0 is returned. After that, return 1, 2, 3 ...
	 */
	public static int getSunLongitude_TietKhi( int jd, double timeZone ) {
		return INT(SunLongitude(jd - 0.5 - timeZone / 24.0) / 180 * 12);
	}

	public static String getTietKhi( int jd, double timeZone ) {
		return TIET_KHI[getSunLongitude_TietKhi(jd, timeZone)];
	}

	public static String getGioChi( float hours , boolean isDetail ) {
		
		int index = 0;
		int i, j;
		String detail="(23 - 1h)";
		if (hours >= 1 && hours < 23) {
			for (i = 1, j = 1; i <= 21; i += 2, j++) {
				if (hours >= i && hours < i + 2) {
					index = j;
					detail="("+i+" - "+(i+2)+"h)";
					break;
				}
			}
		}
		return CHI[index]+" "+(isDetail?detail:"");

	}
	
	public static String getGioChi(float hours){
		return getGioChi(hours, false);
	}
	
	public static TypeChi getTypeGioChi(float hours){
		int index = 0;
		int i, j;
		
		if (hours >= 1 && hours < 23) {
			for (i = 1, j = 1; i <= 21; i += 2, j++) {
				if (hours >= i && hours < i + 2) {
					index = j;
					break;
				}
			}
		}
		return TypeChi.values()[index];
	}
	
	public static String getGioHoangDao( int jd ) {
		int chiOfDay = (jd + 1) % 12;
		String gioHd = Gio_HD[chiOfDay % 6];
		String result = "";
		for (int i = 0; i < 12; i++) {
			if (gioHd.charAt(i) == '1') {
				result += CHI[i];
				result += " (" + (i * 2 + 23) % 24 + "-" + (i * 2 + 1) % 24
						+ ") ,";
			}
		}
		return result;
	}

	/**
	 * Checking good day or bad day
	 * 
	 * @param MonthLunar
	 *            in [1,12]
	 * 
	 * @return TypeLunarDay (GoodDay,NormalDay,BadDay)
	 * */
	public static DayLunar getDay_HoangDao( int MonthLunar, TypeChi DayLunar ) {
		if (MonthLunar >= 1 && MonthLunar <= 12) {
			DayLunar[] HoangDao_HacDao_Month = BANG_HOANG_DAO_HAC_DAO[MonthLunar - 1];

			for (int i = 0; i <= 11; i++) {
				if (HoangDao_HacDao_Month[i].chiOfDay == DayLunar) {
					return HoangDao_HacDao_Month[i];
				}
			}
		}
		return null;

	}

	/**
	 * @return null if cannot find
	 */
	public static TypeTruc get_Truc( int MonthLunar, TypeChi DayLunar ) {
		return (MonthLunar>=1&&MonthLunar<=12)?BANG_TRA_TRUC[MonthLunar-1][DayLunar.ordinal()]:null;
	}
	
	
	/*
	 * Ve cach tinh nay co hoi khac so voi cach tinh tren
	 * http://www.bachkhoatrithuc.vn/encyclopedia/3903-1035-633670097947396250/Nhung-kien-thuc-co-ban-ve-Lich-phap-co-dai-phuong-Dong-va-thuat-Chiem-tinh/Nhi-thap-bat-tu.htm
	 * */
	/**
	 * 
	 * @return null if cannot find
	 */
	public static TypeNhiThapBatTu get_NhiThapBatTu(int jd){
		int temp=jd-16;
		if(temp>=0){
			return TypeNhiThapBatTu.values()[temp%28];
		}
		return null;
	}
	
	/**
	 * Year lunar
	 * */
	public static TypeMenh get_Menh(TypeCan canOfYear,TypeChi chiOfYear){
		return BANG_MENH[canOfYear.ordinal()][chiOfYear.ordinal()];
	}
	
	public static TypeMenh get_MenhOfYear(int year){
		return get_Menh(getCanOfYear(year), getChiOfYear(year));
	}
	
	public static TypeCan getCanOfYear(int year){
		return TypeCan.values()[(year + 6) % 10];
	}
	
	public static TypeChi getChiOfYear(int year){
		return TypeChi.values()[(year + 8) % 12];
	}
	
	public static TypeCung getCungOfYear(int year,TypeSex sex){
		return BANG_CUNG[sex.getValue()][MathFunc.sumEachCharacterOfNumber(year)%9];
	}
}
