package ch14; //9

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		//List : 순서대로 저장, Map : 순서가 없음
		//Map<key자료형, value자료형>
		Map<String, String> map=new HashMap<>();
		map.put("한국", "서울");//맵.put(key,value) //데이터를 추가
		System.out.println(map.get("한국"));//맵.get(key)
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국", "워싱턴");
		map.put("태국", "방콕");
		map.put("영국", "런던");
		System.out.println(map);
		String nation="영국";
		System.out.println(nation+"의 수도는 "+map.get(nation));
		
		//Iterator : 반복처리를 위한 전용객체(for문과 유사한 기능)
		Iterator<String> itr = map.keySet().iterator();
		while(itr.hasNext()) {//다음 요소가 있으면
			String key=(String)itr.next();//다음요소
			System.out.print("key="+key);
			System.out.println(",value="+map.get(key));
		}		
		
		//ArrayList로 처리한다면
//		List<String> nations = new ArrayList<>();
//		nations.add("영국");
//		nations.add("한국");
//		nations.add("중국");
//		nations.add("미국");
//		nations.add("일본");
//		List<String> city = new ArrayList<>();
//		city.add("런던");
//		city.add("서울");
//		city.add("북경");
//		city.add("워싱턴");
//		city.add("동경");
//		
//		String nation="영국";
//		for(int i=0; i<nations.size(); i++) {
//			if(nations.get(i).equals(nation)) {
//				System.out.println(nations.get(i)+"의 수도는 "+city.get(i));
//				break;
//			}
//		}
		
	}

}
