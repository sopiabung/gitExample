package _14;

import java.util.LinkedList;

public class LinkedExam {
	//	Queue구조 : FIFO / offer, poll
	public static void main(String[] args) {
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList<String> list = new LinkedList<>();
		for(String str : fruits) {
			list.offer(str);
		}

		//		System.out.println(linked.toString());
		//		while(!linked.isEmpty()) { // 큐에 데이터가 있을 경우 반복 수행 실시
		//			System.out.println("poll : " + linked.poll());
		//		}
		//		System.out.println(linked.remove());
		//		System.out.println(linked.poll());
		System.out.println(list.toString());
		while (list.poll() != null) { //1) 사과 반환과 동시에 삭제. 포도 반환과 동시에 삭제. 수박 반환과 동시에 삭제.
			System.out.println(list.poll()+" 삭제되었습니다."); //2 )배 반환과 동시에 삭제. 딸기 반환과 동시에 삭제. 모두 삭제되어서 null 반환.
		}
		System.out.println(list.toString());
		
	}
}
