package f9MVC.model;

public class Hund extends Djur {

	public Hund(String name) {
		super(name);
	}

	@Override
	public void låta() {
		System.out.println("Vov");
	}
}
