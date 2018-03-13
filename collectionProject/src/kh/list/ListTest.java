
package kh.list;

import java.util.*;

import kh.list.vo.JoinDateDesc;
import kh.list.vo.MemberVo;
import kh.list.vo.NameAsc;
import kh.list.vo.NoDsc;

public class ListTest {

	public static void main(String[] args) {
//		List list = new ArrayList(); //리스트 객체를 생성 -> 다형성을 이용
//		list.add(5);  // 값을 추가할때 사용하는 API
//		list.add(7);
//		list.add(20);
//		
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
//		
		MemberVo mv1 = new MemberVo(10, "최범석", new Date());
		MemberVo mv2 = new MemberVo(20, "큰별", new Date());
		MemberVo mv3 = new MemberVo(30, "상원", new Date(952280202020L));
		MemberVo mv4 = new MemberVo(40, "보람", new Date());
		MemberVo mv5 = new MemberVo(50, "세준", new Date(94268424216L));
		MemberVo mv6 = new MemberVo(60, "승원", new Date());
		MemberVo mv7 = new MemberVo(70, "성미", new Date(888880202L));
		
//		List list = new ArrayList();
//		list.add(mv3);
//		list.add(mv7);
//		list.add(mv5);
//		list.add(mv2);
//		list.add(mv4);
//		list.add(mv6);
//		list.add(mv1);
//		
//		
//		for(Object obj : list){
//			System.out.println(obj);
//		}
//	
		//제네릭 -> 해당타입만 취급하겠다고 표시
		List<MemberVo> list = new ArrayList<MemberVo>();
		//리스트(컬렉션) 객체 저장 가능(Object)
		list.add(mv3);
		list.add(mv7);
		list.add(mv5);
		list.add(mv2);
		list.add(mv4);
		list.add(mv6);
		list.add(mv1);
		
		
		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
		
//		list.remove(mv4);
//		list.remove(0);
//		
//		System.out.println();
//		
//		for(MemberVo vo : list){
//			System.out.println(vo.toString());
//		}
//		
//
//		System.out.println(list.size());
//
		//정렬에 사용하는 api -> Comparato -> 비교기준을 정의
//		list.sort(new NameAsc());
//		
//		for(Object obj : list){
//			System.out.println(obj);
//		}
//		
//		//값을 묶음으로 추출하여 가지고 있는 객체
//		Iterator<MemberVo> iter = list.iterator();
//		
//		while(iter.hasNext()){ // 다음 칸에 값이있습니까?
//			System.out.println(iter.next()); // 값을 추출할때 사용하는 메소드
//		}
//		
//		ListIterator<MemberVo> listIter = list.listIterator();
//		
//		while(iter.hasNext()){ // 다음 칸에 값이있습니까?
//			System.out.println(iter.next()); // 값을 추출할때 사용하는 메소드
//			if(listIter.hasPrevious()){
//				System.out.println(listIter.previous());
//				System.out.println(listIter.next());
//			}
//		}
		
		//현재 list에 저장되어 있는 객체 값 중, memberno 값을 가지고 정렬하여 출력하시오.(단 No의 내림차순)
		
		//객체 정렬 기준 적용
		System.out.println();
		list.sort(new NoDsc());
		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
 		
		
		list.sort(new JoinDateDesc());
		System.out.println();
		for(MemberVo vo : list){
			System.out.println(vo.toString());
		}
 		
	}

}
