package ch10;

public class StaticVar2 {
	
	static int total;//static메모리영역에 바로 로딩 3
	String model;//heap 영역에 생성됨(non-static, new) , (100번지)쏘나타, (200번지)모닝, (300번지)아반떼
	
	public StaticVar2(String model) {//매개변수가 있는 생성자
		this.model=model;
		total++;
	}
}
