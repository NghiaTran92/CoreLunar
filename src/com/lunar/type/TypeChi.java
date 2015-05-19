package com.lunar.type;

public enum TypeChi {
	/**Tý*/
	Ty,
	/**Sửu*/
	Suu,
	/**Dần*/
	Dan,
	/**Mão*/
	Mao,
	/**Thìn*/
	Thin,
	/**Tị*/
	Ti_,
	/**Ng�?*/
	Ngo,
	/**Mùi*/
	Mui,
	/**Thân*/
	Than,
	/**Dậu*/
	Dau,
	/**Tuất*/
	Tuat,
	/**Hợi*/
	Hoi;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String result = "";
		switch (this) {
		case Ty:
			result="Tý";
			break;

		case Suu:
			result="Sửu";
			break;
		case Dan:
			result="Dần";
			break;
		case Mao:
			result="Mão";
			break;
		case Thin:
			result="Thìn";
			break;
		case Ti_:
			result="Tị";
			break;
		case Ngo:
			result="Ng�?";
			break;
		case Mui:
			result="Mùi";
			break;
		case Than:
			result="Thân";
			break;
		case Dau:
			result="Dậu";
			break;
		case Tuat:
			result="Tuất";
			break;
		case Hoi:
			result="Hợi";
			break;
		default:
			break;
		}
		return result;
	}
}
