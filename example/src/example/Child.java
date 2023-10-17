package example;

public class Child extends Parent {
	
	@Override
	public void run() {
		System.out.println("invoing run in child");
	}
	
	public void walk() {
		System.out.println("invoing walk in child");

	}

}
