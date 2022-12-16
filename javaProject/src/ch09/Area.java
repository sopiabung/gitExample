package ch09;

public class Area {
	//멤버변수
	private int width;//int 기본 0으로 초기화, 30
	private int length;//0, 20
	//생성자
	public Area() { }
	public Area(int width, int length) {//30, 20
		this.width = width;
		this.length = length;
	}
	//getter,setter
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	//일반메소드
	public int getArea() {
		return width*length;//30*20
	}
}
