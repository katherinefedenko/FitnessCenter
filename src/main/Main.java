package main;

public class Main {
	
	public static void main(String[] args) {
		new Main().start();
	}
	
	public void start() {
		Injector injector = new Injector();
		injector.initialize_obj();
	}

}
