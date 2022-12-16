package ch14; //1

import java.util.Vector;

//컬렉션(Collection) - 배열의 단점을 보완한 클래스들
//배열의 단점 - 사이즈 조절 불가. 삽입,삭제가 어려움, 다양한 자료형을 저장할 수 없음.
//Map계열 - 순서X. 키로 조회.
//List계열 - 순서O, 인덱스로 조회. - arraylist, vector, stack, linkedlist
//Vector 대신 요즘은 ArrayList를 많이쓴다.
public class VectorExam {
	public static void main(String[] args) {
		//Vector v=new Vector();//에러는 아니지만 아래처럼 처리하는게 좋다.
		Vector<Object> v = new Vector();
		//모든 자료형 처리 가능
		//사이즈가 자동으로 늘어남
		//10개의 사이즈값을 기본으로 갖는다.
		System.out.println("초기 사이즈 : "+v.capacity());
		v.add("first"); //add("추가할 자료")
		v.add("Second");
		v.add(3.5);
		v.add(true);
		v.add(100);
		v.add(101);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);

		System.out.println("중간 사이즈 : "+v.capacity());
		//입력된 데이터가 벡터가 만들어 놓은
		//초기 10개의 사이즈가 넘어가면 또 10개의 사이즈를 추가로 만든다.
		System.out.println("데이터의갯수 : "+v.size());//벡터.size()
		//참고로 배열은 length를 쓴다.

		System.out.println("초기 데이터 : ");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
			//주의점: 배열[i]처럼 쓰면 안된다.
		}

		System.out.println();
		v.remove(0);//벡터의 인덱스 0번 요소 삭제
		v.add(5, 102);//벡터의 인덱스 5번에 102 라는 데이터 추가

		System.out.println("데이터 조정 후 : ");
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+"\t");
		}
	}
}
//초기 사이즈 : 10
//중간 사이즈 : 20
//데이터의갯수 : 11
//초기 데이터 : 
//first	Second	3.5	true	100	101	103	104	105	106	107	
//데이터 조정 후 : 
//Second	3.5	true	100	101	102	103	104	105	106	107	
