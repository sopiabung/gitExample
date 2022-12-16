package _14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("한국", "서울");
		System.out.println(map.get("한국"));
		map.put("일본", "도쿄");
		map.put("미국", "워싱턴");
		map.put("카타르", "도하");
		System.out.println(map);
		String nation = "카타르";
		System.out.println(nation+"의 수도는 "+map.get(nation)+"입니다.");

		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("key="+key+", value="+map.get(key));
		}

	}
}


