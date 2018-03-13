package kh.list.vo;

import java.util.Comparator;


public class JoinDateDesc implements Comparator<MemberVo>{
	@Override
	public int compare(MemberVo o1,MemberVo o2){
		// 0,음수 일경우 변경하지 않습니다.
		//양수(1) 일때는 변경합니다.
		int result = -1;
		if(o2.getJoinDate().getTime() - o1.getJoinDate().getTime()>0){
			result = 1;
		}
		return result;
	}

}
