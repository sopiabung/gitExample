package ch09;

public class ShapeMain {
	public static void main(String[] args) {
		CircleShape c = new CircleShape(5);//객체생성 겸 매개변수가있는 생성자 호출
		TriangleShape t = new TriangleShape(4, 6);
		RectangleShape r = new RectangleShape(5, 8);
		c.draw();
		System.out.println("원의 면적은 "+c.calculateArea()+"입니다.");
		
		t.draw();
		System.out.println("삼각형의 면적은 "+t.calculateArea()+"입니다.");
		
		r.draw();
		System.out.println("사각형의 면적은 "+r.calculateArea()+"입니다.");
	}

}
