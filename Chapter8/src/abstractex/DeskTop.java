package abstractex;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("DeskTop display");
		
	}

	@Override
	public void turnOff() {
		System.out.println("desktop turnoff");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

}