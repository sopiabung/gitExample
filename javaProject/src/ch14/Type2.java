package ch14;

public class Type2 {
	
	private Object value;
	public Object getValue() {//Object는 어떤 자료형이든 처리가능
		return value;
	}
	public void setValue(Object value) {
		this.value=value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue('a');
		System.out.println(t.getValue());
		//이처럼 Object로 모든걸 처리하게되면 내부적으로 형변환 등의 처리가 많아지게된다.
	}
}
