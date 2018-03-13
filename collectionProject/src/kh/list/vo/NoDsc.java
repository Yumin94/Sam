package kh.list.vo;

import java.util.Comparator;

public class NoDsc implements Comparator<MemberVo> {

	@Override
	public int compare(MemberVo o1,MemberVo o2){
		// 0,음수 일경우 변경하지 않습니다.
		//양수(1) 일때는 변경합니다.
		int num=0;
		if(o1.getMemberNo() > o2.getMemberNo()){
			num=-1;
		}
		return num;
	}
	
}
