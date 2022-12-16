package _14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("2013", "제", "하확", 3, "박썜"));
		list.add(new Student("2014", "졍", "심확", 2, "송썜"));
		list.add(new Student("2015", "꾸", "음확", 4, "김썜"));
		System.out.println("학번\t이름\t전공\t학년\t교수");
		//for-each문
//		for(Student s : list) {
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		//일반for문
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		
		}
	}

}
