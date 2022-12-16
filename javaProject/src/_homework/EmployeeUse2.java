package _homework;

public class EmployeeUse2 {

	public static void main(String[] args) {
	//	이름    부서    직위 기본급 보너스 총액 세액 실수령액
	//  김철수 관리부 과장 300      900    1200 39   1161
		
		Employee2 k = new Employee2();
		k.setName("김철수");
		k.setPart("관리부");
		k.setPosition("과장");
		k.setBasic(300);
		k.calculator();
		k.print();
		
	}

}
