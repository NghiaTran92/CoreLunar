package com.lunar.calendar;

import com.lunar.type.TypeCan;
import com.lunar.type.TypeChi;
import com.lunar.type.TypeCung;
import com.lunar.type.TypeDiaChi;
import com.lunar.type.TypeNguHanh;
import com.lunar.type.TypeQuality;
import com.lunar.type.TypeStar;

public class Relation {

	public TypeDiaChi[] checkDiaChi( TypeChi chiOne, TypeChi chiTwo ) {
		return BANG_DIA_CHI_HOP_KHAC[chiOne.ordinal()][chiTwo.ordinal()];
	}

	public TypeQuality checkThienCan( TypeCan canOne, TypeCan canTwo ) {
		return BANG_THIEN_CAN_HOP_KHAC[canOne.ordinal()][canTwo.ordinal()];
	}

	public TypeQuality checkNguHanh( TypeNguHanh nguHanhOne,TypeNguHanh nguHanhTwo ) {
		return BANG_NGU_HANH_TUONG_SINH_TUONG_KHAC[nguHanhOne.ordinal()][nguHanhTwo.ordinal()];
	}

	public TypeStar checkCungHopKhac( TypeCung cungOne, TypeCung cungTwo ) {
		return BANG_CUNG_HOP_KHAC[cungOne.ordinal()][cungTwo.ordinal()];
	}

	
	/** 
	 * 
	 * @return -1 if it have exeption
	 *			otherwise the summing Can_luong 
	 * */
	public int checkCanLuong(TypeCan yearLunarCan, TypeChi yearLunarChi,int monthLunar,int dayLunar,TypeChi chiHours){
		if(monthLunar>=1 && monthLunar<=12 && dayLunar>=1 && dayLunar<=30){
			int sum=0;
			int weightYear=BANG_CAN_LUONG_YEAR[yearLunarCan.ordinal()][yearLunarChi.ordinal()];
			int weightMonth=BANG_CAN_LUONG_MONTH[monthLunar-1];
			int weightDay=BANG_CAN_LUONG_DAY[dayLunar-1];
			int weightHours=BANG_CAN_LUONG_HOURS[chiHours.ordinal()];
			if(weightYear>0){
				sum=weightYear+weightMonth+weightDay+weightHours;
			}else{
				return -1;
			}
			return sum;
		}
		return -1;
	}
	
	
	
	/**
	 * theo giờ 12 con giáp
	 * BANG_CAN_LUONG_HOURS[chi]*/
	private final int[] BANG_CAN_LUONG_HOURS=new int[]{
			/*ty,suu,dan,mao,thin,,ti_,ngo,mui,than,dau,tuat,hoi*/
			16,6,7,10,9,16,10,8,8,9,6,6
	};
	
	/**
	 * từ ngày mùng 1 đến 30
	 * BANG_CAN_LUONG_DAY[day in month]
	 * */
	private final int[] BANG_CAN_LUONG_DAY=new int[]{
			5,10,8,15,16,15,8,16,8,16,
			9,17,8,17,10,8,9,18,5,15,
			10,9,8,9,15,18,7,8,16,6
	};
	
	/**BANG_CAN_LUONG_MONTH[month]*/
	private final int[] BANG_CAN_LUONG_MONTH = new int[] { 
			6, 7, 8, 9, 5, 6, 9, 15, 18, 18, 9, 5 };

	/**
	 * BANG_CAN_LUONG_YEAR[can][chi] hàng chục là lượng; hàng đon vị là chỉ -1
	 * la ko xác định
	 * */
	private final int[][] BANG_CAN_LUONG_YEAR = new int[][] {
	/* Giap */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	12, -1, 12, -1, 8, -1, 15, -1, 5, -1, 5, -1 },
	/* At */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	-1, 9, -1, 8, -1, 7, -1, 6, -1, 15, -1, 9 },
	/* Binh */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	16, -1, 6, -1, 8, -1, 13, -1, 5, -1, 6, -1 },
	/* Dinh */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	-1, 8, -1, 7, -1, 6, -1, 5, -1, 14, -1, 16 },
	/* Mau */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	15, -1, 8, -1, 12, -1, 19, -1, 14, -1, 14, -1 },
	/* Ky */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	-1, 8, -1, 9, -1, 5, -1, 6, -1, 5, -1, 9 },
	/* Canh */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	7, -1, 9, -1, 12, -1, 9, -1, 8, -1, 9, -1 },
	/* Tan */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	-1, 7, -1, 12, -1, 6, -1, 8, -1, 16, -1, 17 },
	/* Nham */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	5, -1, 9, -1, 10, -1, 8, -1, 7, -1, 10, -1 },
	/* Quy */
	{
	/* ty,suu,dan,mao,thin,ti_,ngo,mui,than,dau,tuat,hoi */
	-1, 5, -1, 12, -1, 7, -1, 7, -1, 8, -1, 7 }

	};

	/** BANG_CUNG_HOP_KHAC[cung][cung] */
	private final TypeStar[][] BANG_CUNG_HOP_KHAC = new TypeStar[][] {
			/* Kham */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.PhucVi, TypeStar.PhucDuc, TypeStar.NguQuy,
					TypeStar.HoaHai, TypeStar.LucSat, TypeStar.TuyetMenh,
					TypeStar.SinhKhi, TypeStar.ThienY },
			/* Ly */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.PhucDuc, TypeStar.PhucVi, TypeStar.HoaHai,
					TypeStar.NguQuy, TypeStar.TuyetMenh, TypeStar.LucSat,
					TypeStar.ThienY, TypeStar.SinhKhi },
			/* Can */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.NguQuy, TypeStar.HoaHai, TypeStar.PhucVi,
					TypeStar.PhucDuc, TypeStar.ThienY, TypeStar.SinhKhi,
					TypeStar.TuyetMenh, TypeStar.LucSat },
			/* Doai */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.HoaHai, TypeStar.NguQuy, TypeStar.PhucDuc,
					TypeStar.PhucVi, TypeStar.SinhKhi, TypeStar.ThienY,
					TypeStar.LucSat, TypeStar.TuyetMenh },
			/* Ca_n */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.LucSat, TypeStar.TuyetMenh, TypeStar.ThienY,
					TypeStar.SinhKhi, TypeStar.PhucVi, TypeStar.PhucDuc,
					TypeStar.HoaHai, TypeStar.NguQuy },
			/* Khon */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.TuyetMenh, TypeStar.LucSat, TypeStar.SinhKhi,
					TypeStar.ThienY, TypeStar.PhucDuc, TypeStar.PhucVi,
					TypeStar.NguQuy, TypeStar.HoaHai },
			/* Ton */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.SinhKhi, TypeStar.ThienY, TypeStar.TuyetMenh,
					TypeStar.LucSat, TypeStar.HoaHai, TypeStar.NguQuy,
					TypeStar.PhucVi, TypeStar.PhucDuc },
			/* Chan */
			{
			/* kham,ly,can,doai,ca_n,khon,ton,chan */
			TypeStar.ThienY, TypeStar.SinhKhi, TypeStar.LucSat,
					TypeStar.TuyetMenh, TypeStar.NguQuy, TypeStar.HoaHai,
					TypeStar.PhucDuc, TypeStar.PhucVi }, };

	/** BANG_NGU_HANH_TUONG_SINH_TUONG_KHAC[nguhanh][nguhanh] */
	private final TypeQuality[][] BANG_NGU_HANH_TUONG_SINH_TUONG_KHAC = new TypeQuality[][] {
			/* Kim */
			{ TypeQuality.Normal, TypeQuality.Bad, TypeQuality.Good,
					TypeQuality.Bad, TypeQuality.Good },
			/* Moc */
			{ TypeQuality.Bad, TypeQuality.Normal, TypeQuality.Good,
					TypeQuality.Good, TypeQuality.Bad },
			/* Thuy */
			{ TypeQuality.Good, TypeQuality.Good, TypeQuality.Normal,
					TypeQuality.Bad, TypeQuality.Bad },
			/* Hoa */
			{ TypeQuality.Bad, TypeQuality.Good, TypeQuality.Bad,
					TypeQuality.Normal, TypeQuality.Good },
			/* Tho */
			{ TypeQuality.Good, TypeQuality.Bad, TypeQuality.Bad,
					TypeQuality.Good, TypeQuality.Normal }, };

	/** BANG_THIEN_CAN_HOP_KHAC[can][can] */
	private final TypeQuality[][] BANG_THIEN_CAN_HOP_KHAC = new TypeQuality[][] {
			/* Giap */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Bad, TypeQuality.Good,
					TypeQuality.Bad, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal },
			/* At */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Bad,
					TypeQuality.Good, TypeQuality.Bad, TypeQuality.Normal,
					TypeQuality.Normal },
			/* Binh */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Bad, TypeQuality.Good, TypeQuality.Bad,
					TypeQuality.Normal },
			/* Dinh */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Bad, TypeQuality.Good,
					TypeQuality.Bad },
			/* Mau */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Bad, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Bad,
					TypeQuality.Good },
			/* Ky */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Good, TypeQuality.Bad, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Bad },
			/* Canh */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Bad, TypeQuality.Good, TypeQuality.Bad,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal },
			/* Tan */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Bad, TypeQuality.Good,
					TypeQuality.Bad, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal },
			/* Nham */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Bad,
					TypeQuality.Good, TypeQuality.Bad, TypeQuality.Normal,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal },
			/* Quy */
			{
			/* giap,at,binh,dinh,mau,ky,canh,tan,nham,quy */
			TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Bad, TypeQuality.Good, TypeQuality.Bad,
					TypeQuality.Normal, TypeQuality.Normal, TypeQuality.Normal,
					TypeQuality.Normal }

	};
	/** BANG_DIA_CHI_HOP_KHAC[chi][chi] */
	private final TypeDiaChi[][][] BANG_DIA_CHI_HOP_KHAC = new TypeDiaChi[][][] {
	/* Ty */
	{
	/* ty */
	{ TypeDiaChi.Binh },
	/* suu */
	{ TypeDiaChi.LucHop },
	/* dan */
	{ TypeDiaChi.Binh },
	/* mao */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* thin */
	{ TypeDiaChi.TamHop },
	/* ti_ */
	{ TypeDiaChi.TuTuyet },
	/* ngo */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* mui */
	{ TypeDiaChi.LucHai },
	/* than */
	{ TypeDiaChi.TamHop },
	/* dau */
	{ TypeDiaChi.TuHanhXung },
	/* tuat */
	{ TypeDiaChi.Binh },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Suu */
	{
	/* ty */
	{ TypeDiaChi.LucHop },
	/* suu */
	{ TypeDiaChi.Binh },
	/* dan */
	{ TypeDiaChi.Binh },
	/* mao */
	{ TypeDiaChi.Binh },
	/* thin */
	{ TypeDiaChi.TuHanhXung },
	/* ti_ */
	{ TypeDiaChi.TamHop },
	/* ngo */
	{ TypeDiaChi.LucHai },
	/* mui */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* than */
	{ TypeDiaChi.Binh },
	/* dau */
	{ TypeDiaChi.TamHop },
	/* tuat */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Dan */
	{
	/* ty */
	{ TypeDiaChi.Binh },
	/* suu */
	{ TypeDiaChi.Binh },
	/* dan */
	{ TypeDiaChi.Binh },
	/* mao */
	{ TypeDiaChi.Binh },
	/* thin */
	{ TypeDiaChi.Binh },
	/* ti_ */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung, TypeDiaChi.LucHai },
	/* ngo */
	{ TypeDiaChi.TamHop },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* dau */
	{ TypeDiaChi.TuTuyet },
	/* tuat */
	{ TypeDiaChi.TamHop },
	/* hoi */
	{ TypeDiaChi.LucHop } },

	/* Mao */
	{
	/* ty */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* suu */
	{ TypeDiaChi.Binh },
	/* dan */
	{ TypeDiaChi.Binh },
	/* mao */
	{ TypeDiaChi.Binh },
	/* thin */
	{ TypeDiaChi.LucHai },
	/* ti_ */
	{ TypeDiaChi.Binh },
	/* ngo */
	{ TypeDiaChi.TuHanhXung },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.TuTuyet },
	/* dau */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* tuat */
	{ TypeDiaChi.LucHop },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Thin */
	{
	/* ty */
	{ TypeDiaChi.TamHop },
	/* suu */
	{ TypeDiaChi.TuHanhXung },
	/* dan */
	{ TypeDiaChi.Binh },
	/* mao */
	{ TypeDiaChi.LucHai },
	/* thin */
	{ TypeDiaChi.Binh },
	/* ti_ */
	{ TypeDiaChi.Binh },
	/* ngo */
	{ TypeDiaChi.Binh },
	/* mui */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* than */
	{ TypeDiaChi.TamHop },
	/* dau */
	{ TypeDiaChi.LucHop },
	/* tuat */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Ti_ */
	{
	/* ty */
	{ TypeDiaChi.TuTuyet },
	/* suu */
	{ TypeDiaChi.TamHop },
	/* dan */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung, TypeDiaChi.LucHai },
	/* mao */
	{ TypeDiaChi.Binh },
	/* thin */
	{ TypeDiaChi.Binh },
	/* ti_ */
	{ TypeDiaChi.Binh },
	/* ngo */
	{ TypeDiaChi.Binh },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.LucHop, TypeDiaChi.TuHanhXung },
	/* dau */
	{ TypeDiaChi.TamHop },
	/* tuat */
	{ TypeDiaChi.Binh },
	/* hoi */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky } },

	/* Ngo */
	{
	/* ty */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* suu */
	{ TypeDiaChi.LucHai },
	/* dan */
	{ TypeDiaChi.TamHop },
	/* mao */
	{ TypeDiaChi.TuHanhXung },
	/* thin */
	{ TypeDiaChi.Binh },
	/* ti_ */
	{ TypeDiaChi.Binh },
	/* ngo */
	{ TypeDiaChi.Binh },
	/* mui */
	{ TypeDiaChi.LucHop },
	/* than */
	{ TypeDiaChi.Binh },
	/* dau */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* tuat */
	{ TypeDiaChi.TamHop },
	/* hoi */
	{ TypeDiaChi.TuTuyet } },

	/* Mui */
	{
	/* ty */
	{ TypeDiaChi.LucHai },
	/* suu */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* dan */
	{ TypeDiaChi.Binh },
	/* mao */
	{ TypeDiaChi.Binh },
	/* thin */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* ti_ */
	{ TypeDiaChi.Binh },
	/* ngo */
	{ TypeDiaChi.LucHop },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.Binh },
	/* dau */
	{ TypeDiaChi.Binh },
	/* tuat */
	{ TypeDiaChi.TuHanhXung },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Than */
	{
	/* ty */
	{ TypeDiaChi.TamHop },
	/* suu */
	{ TypeDiaChi.Binh },
	/* dan */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* mao */
	{ TypeDiaChi.TuTuyet },
	/* thin */
	{ TypeDiaChi.TamHop },
	/* ti_ */
	{ TypeDiaChi.LucHop, TypeDiaChi.TuHanhXung },
	/* ngo */
	{ TypeDiaChi.Binh },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.Binh },
	/* dau */
	{ TypeDiaChi.Binh },
	/* tuat */
	{ TypeDiaChi.Binh },
	/* hoi */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung, TypeDiaChi.LucHai } },

	/* Dau */
	{
	/* ty */
	{ TypeDiaChi.TuHanhXung },
	/* suu */
	{ TypeDiaChi.TamHop },
	/* dan */
	{ TypeDiaChi.TuTuyet },
	/* mao */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* thin */
	{ TypeDiaChi.LucHop },
	/* ti_ */
	{ TypeDiaChi.TamHop },
	/* ngo */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.Binh },
	/* dau */
	{ TypeDiaChi.Binh },
	/* tuat */
	{ TypeDiaChi.LucHai },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Tuat */
	{
	/* ty */
	{ TypeDiaChi.Binh },
	/* suu */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung },
	/* dan */
	{ TypeDiaChi.TamHop },
	/* mao */
	{ TypeDiaChi.LucHop },
	/* thin */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* ti_ */
	{ TypeDiaChi.Binh },
	/* ngo */
	{ TypeDiaChi.TamHop },
	/* mui */
	{ TypeDiaChi.TuHanhXung },
	/* than */
	{ TypeDiaChi.Binh },
	/* dau */
	{ TypeDiaChi.LucHai },
	/* tuat */
	{ TypeDiaChi.Binh },
	/* hoi */
	{ TypeDiaChi.Binh } },

	/* Hoi */
	{
	/* ty */
	{ TypeDiaChi.Binh },
	/* suu */
	{ TypeDiaChi.Binh },
	/* dan */
	{ TypeDiaChi.LucHop, TypeDiaChi.TuHanhXung },
	/* mao */
	{ TypeDiaChi.Binh },
	/* thin */
	{ TypeDiaChi.Binh },
	/* ti_ */
	{ TypeDiaChi.LucXung, TypeDiaChi.TuHanhXung, TypeDiaChi.Ky },
	/* ngo */
	{ TypeDiaChi.TuTuyet },
	/* mui */
	{ TypeDiaChi.Binh },
	/* than */
	{ TypeDiaChi.Xung, TypeDiaChi.TuHanhXung, TypeDiaChi.LucHai },
	/* dau */
	{ TypeDiaChi.Binh },
	/* tuat */
	{ TypeDiaChi.Binh },
	/* hoi */
	{ TypeDiaChi.Binh } }, };
}
