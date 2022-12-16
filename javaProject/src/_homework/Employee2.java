package _homework;

public class Employee2 {
	
	private String name; //이름
	private String part; //부서
	private String position; //직위
	private int basic; //기본급
	private int bonus; //	보너스(기본급의 300%)
	private int total; //	총액(기본급+보너스)
	private int tax; //	세액(총액의 3.3%)
	private int salary; //	실수령액(총액-세액)
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getBonus() {
		return bonus;
	}
	public int getTotal() {
		return total;
	}
	public int getTax() {
		return tax;
	}
	public int getSalary() {
		return salary;
	}
	
	public void calculator() {
		bonus = basic * 3;
		total = basic + bonus;
		tax = (int)(total * 0.033);
		salary = total - tax;
	}
	
	public void print() {
		System.out.println("이름\t부서\t직위\t기본급\t보너스\t총액\t세액\t실수령액");
		System.out.println(name +"\t"+ part +"\t"+
		position +"\t"+ basic +"\t"+ getBonus() +"\t"+
		getTotal() +"\t"+ getTax() +"\t"+ getSalary());
	}	
}
