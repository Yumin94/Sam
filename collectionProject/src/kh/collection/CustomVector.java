package kh.collection;

public class CustomVector {
	private Object[] objArr;
	private int size;
	
	public CustomVector(){
		objArr = new Object[10];
	}
	public CustomVector(int capacity){
		objArr = new Object[capacity];
	}
	
	public int capacity(){		
		return objArr.length;
	}
	
	public int size(){		
		return size;
	}
	
	public boolean isEmpty(){
		//해당 배열의 값이 있는지 확인하는 메소드
//		boolean result = true;
//		for(int i=0;i<objArr.length;i++){
//			if(objArr[i] != null){
//				result = false;
//				break;
//			}
//		}		
//		return result;
		return size == 0;
	}
	
	public void add(Object obj){
//		해당 값을 마지막에 추가, size 변수 1 증가
//		(단, 배열의 길이를 초과 할 경우, 배열의 길이를 2배로 생성 후, 기존 값 복사)
		Object[] temp = null;
		if(size() == capacity()){
			 temp = objArr;
			 objArr = new Object[temp.length * 2 ];
			 for(int i=0;i<temp.length;i++){
				 objArr[i] = temp[i];
			 }
		}
			objArr[size] = obj;
			size++;	
	}
	
	public Object get(int index){
		//해당 인덱스 번째 객체 반환
		//없는 인덱스 요청 시 IndexOutOfBoundsException 발생 시킴
		if(index<0 || size<=index){
			throw new IndexOutOfBoundsException();
		}
		return objArr[index];
		
	}
	
	public int indexOf(Object obj){
//		전달 받은 객체와 같은 객체의 인덱스 반환
		int index = -1;
		for(int i=0;i<size;i++){
			if(objArr[i].equals(obj)){
				index = i;
				break;
			}
		}
		return index;
		
	}
	
	public boolean remove(Object obj){
//		해당 객체의 존재 여부를 확인하여 배열에서 삭제 한다.
//		- 삭제 성공 시 true, 삭제 실패시 false 
		boolean result = false;
		int index = indexOf(obj);
		if(index != -1 ){
			objArr[index] = null;
			System.arraycopy(objArr, index+1, objArr, index,size-index); // 앞칸으로 옮기기
			objArr[size-1] = null; //마지막칸 지우기
			size--;
			result = true;			
		}
		
		return result;
		
		
	}
	
	@Override
	public String toString(){
		String result ="";
		for(int i=0;i<size;i++){
			result += objArr[i].toString() + " ";	
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
