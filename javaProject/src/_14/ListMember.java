package _14;

import java.util.ArrayList;
import java.util.List;

import ch14.Member;

public class ListMember {
	public static void main(String[] args) {
		//Member 클래스의 모든 자료형을 사용할 수 있음
		List<_14.Member> list = new ArrayList<>();
		//1)Member 인스턴스생성, setter 활용
		_14.Member m1 = new _14.Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02");
		m1.setEmail("kim@naver.com");
		//list에 Member 객체 1개를 추가
		list.add(m1);
		System.out.println(list.size());
		//2) Member 매개변수있는 생성자 사용
		_14.Member m2 = new _14.Member("hong", "1234", "길", "010","sopia");
		list.add(m2);
		System.out.println(list.size());
		
		//3) 참조변수 재사용 안할거면 참조변수 생성자체를 안하고 바로 new로 add안에 넣기.
		list.add(new _14.Member("so", "1234", "졔","010","sopi"));
		System.out.println(list.size());
		
		System.out.println("id\t비번\t이름\t번호\t메일");
		for(_14.Member s : list) {
			System.out.println(s.getUserid()+"\t"+s.getPasswd()+"\t"+s.getName()+"\t"+s.getTel()+"\t"+s.getEmail());
		}
	}
}
