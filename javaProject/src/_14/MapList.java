package _14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {

	static void print(Map<String, Object> map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("li");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<Student> list = new ArrayList<>();
		list.add(new Student("201701", "지혀닝", "세무", 2017, "시현하다"));
		list.add(new Student("201702", "승우", "세무", 2017, "시현님"));
		list.add(new Student("201442", "지혜", "실용", 2014, "시현강사님"));
		map.put("li", list);
		print(map);
	}
	
}
