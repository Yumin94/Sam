package kh.collection;

public class CustomVectorTest {

	public static void main(String[] args) {
		
		CustomVector myVector = new CustomVector(10);
		System.out.println("capacity1 : " +myVector.capacity());
		System.out.println("비어있음 : " + myVector.isEmpty());
		System.out.println("값의 개수 : " + myVector.size());
		
		myVector.add("3");
		myVector.add("전유민");
		myVector.add("인천");
		myVector.add("01065612016");
		myVector.add("수요일");
		
		System.out.println("capacity2 : " +myVector.capacity());
		System.out.println("비어있음 : "+myVector.isEmpty());
		System.out.println("값의 개수 : "+myVector.size());
		System.out.println(myVector.get(2));
		
		myVector.remove("3");
		System.out.println(myVector.toString());

	}

}
