import java.text.SimpleDateFormat;

import com.lunar.calendar.Human;
import com.lunar.type.TypeDiaChi;
import com.lunar.type.TypeQuality;
import com.lunar.type.TypeSex;
import com.lunar.type.TypeStar;
import com.lunar.util.DateTime;
import com.lunar.util.Random;




public class Main {
	public static void main(String[] args) {
		

	
//		double TZ = 7.0;
//    	int start = VietCalendar.jdFromDate(1, 1, 1924);
//    	int step = 365;
//    	int count = -1;
//    	long currentUnixTime=1422594000;
//    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    	Date date=new Date((long)(currentUnixTime*1000));
//    	System.out.println("convert:"+formatter.format(date));
//    	Calendar cal=Calendar.getInstance();
//    	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//    	System.out.println("start:"+start+"-- Time Start:"+simpleDateFormat.format(cal.getTime()));
//    	@SuppressWarnings( "deprecation" )
//		Date date2=new Date(2000-1900, 12-1, 1);
//    	System.out.println(simpleDateFormat.format(date2));
//    	while (count++ < 270) {
//    		int jd = start + step*count;
//    		int[] s = VietCalendar.jdToDate(jd);
//    		int[] l = VietCalendar.convertSolar2Lunar(s[0], s[1], s[2], TZ);
//    		int[] s2 = VietCalendar.convertLunar2Solar(l[0], l[1], l[2], l[3], TZ);
//    		
//    		
//    		
//    		String can_chi_date=VietCalendar.getLunar_CanChi_Day(jd)+"--"+VietCalendar.getLunar_CanChi_Month(l[2], l[1])+"--"+VietCalendar.getLunar_CanChi_Year(l[2]);
//    		String tietkhi=VietCalendar.getTietKhi(jd+1, 7.0);
//    		String gioHD=VietCalendar.getGioHoangDao(jd);
//    		
//    		System.out.println("jd:"+jd+" phan du:"+((jd-16)%28));
//    		
//    		if (s[0] == s2[0] && s[1] == s2[1] && s[2] == s2[2]) {
//    			System.out.println("OK! "+s[0]+"/"+s[1]+"/"+s[2]+" -> "+l[0]+"/"+l[1]+"/"+l[2]+(l[3] == 0 ? "" : " leap")+"      "+can_chi_date+"--- Tiet khi:"+tietkhi +" -- Gio hang dao: "+gioHD);
//    		} else {
//    			System.err.println("ERROR! "+s[0]+"/"+s[1]+"/"+s[2]+" -> "+l[0]+"/"+l[1]+"/"+l[2]+(l[3] == 0 ? "" : " leap"));
//    		}
//    		
//    		
//    		/// tinh menh theo nam
//    		Type_Menh menhOfyear=VietCalendar.get_MenhOfYear(l[2]);
//    		System.out.println("Menh theo nam: "+menhOfyear.toString());
//    		//////////////
//    		
//    		// tinh cung theo nam
//    		TypeCung cungMale=VietCalendar.getCungOfYear(l[2], TypeSex.Male);
//    		TypeCung cungFeMale=VietCalendar.getCungOfYear(l[2], TypeSex.Female);
//    		System.out.println("Cung nam: "+cungMale.toString()+" "+cungMale.getNguHanh()+" -- Cung nu: "+cungFeMale.toString()+" "+cungFeMale.getNguHanh());
////    		TypeChi chiDay=VietCalendar.get_Chi_Day(jd);
////    		
////    		DayLunar typeDay=VietCalendar.getDay_HoangDao(l[1], chiDay);
////    		switch (typeDay.typeDay) {
////			case GoodDay:
////				System.out.println("Ngay Tot --"+typeDay.nameOfDay);
////				break;
////			case BadDay:
////				System.out.println("Ngay Xau--"+typeDay.nameOfDay);
////				break;
////			/*Normal Day*/
////			default:
////				System.out.println("Ngay Binh Thuong");
////				break;
////			}
////    		
////    		// xem truc
////    		TypeTruc typeTrucOfDay=VietCalendar.get_Truc(l[1], chiDay);
////    		System.out.println("Trực:"+typeTrucOfDay.toString());
////    		Type_NhiThapBatTu nhiThapBatTu=VietCalendar.get_NhiThapBatTu(jd);
////    		System.out.println("Nhị thập bát tú: Sao "+nhiThapBatTu.toString());
//    		
//    		System.out.println("-------------------------------------");
//    	}
    	//System.out.println("-- Time end:"+simpleDateFormat.format(cal.getTime()));
		
		
		/// test human
		Random ran=new Random();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Human human1,human2;
		for(int i=0;i<31;i++){
			human1=new Human(new DateTime(2010, 10, i+1,i,ran.randInt(0, 59)), TypeSex.Male);
			human2=new Human(new DateTime(1994, 10, i+1,i,ran.randInt(0, 59)), TypeSex.Female);
			
			System.out.println("-------human1 ");
			System.out.println("sex: "+human1.getSex());
			System.out.println("nam duong: "+dateFormat.format(human1.getBirthDay()));
			System.out.println("nam am: "+dateFormat.format(human1.getBirthDayLunar()));
			System.out.println("can: "+human1.getBirthYearCan().toString()+" chi: "+human1.getBirthYearChi().toString());
			System.out.println("menh: "+human1.getMenh().toString()+" Ngu Hanh: "+human1.getMenh().getNguHanh()+"-- cung: "+human1.getCung().toString());
			System.out.println("Cân lượng: "+human1.checkCanLuong());
			System.out.println("-------human2 ");
			System.out.println("sex: "+human2.getSex());
			System.out.println("nam duong: "+dateFormat.format(human2.getBirthDay()));
			System.out.println("nam am: "+dateFormat.format(human2.getBirthDayLunar()));
			System.out.println("can: "+human2.getBirthYearCan().toString()+"-- chi: "+human2.getBirthYearChi().toString());
			System.out.println("menh: "+human2.getMenh().toString()+" Ngu Hanh: "+human2.getMenh().getNguHanh()+"-- cung: "+human2.getCung().toString());
			System.out.println("Cân lượng: "+human2.checkCanLuong());
			
			System.out.println("*** kiem tra Thien Can: ");
			TypeQuality quality1= human1.checkThienCan(human2.getBirthYearCan());
			System.out.println(quality1.getValue());
			
			System.out.println("*** kiem tra Dia Chi: ");
			TypeDiaChi[] listDiaChi=human1.checkDiaChi(human2.getBirthYearChi());
			for(TypeDiaChi diachi:listDiaChi){
				System.out.println(diachi.toString());
			}
			
			System.out.println("*** kiem tra Menh Ngu Hanh: ");
			TypeQuality quality2= human1.checkMenhNguHanh(human2.getMenh().getNguHanh());
			System.out.println(quality2.getValue());
			
			System.out.println("*** kiem tra Cung : ");
			TypeStar quality3= human1.checkCung(human2.getCung());
			System.out.println(quality3.toString());
			
			System.out.println("--------------------------------------------");
		}
		
	}
}
