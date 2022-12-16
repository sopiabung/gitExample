package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		
		TV tv=new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset();//static 멤버일때는 클래스이름.메소드 접근해야함.
		
		System.out.println();
		
		Computer com=new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
		
	}

}
