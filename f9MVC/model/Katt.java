package f9MVC.model;

public class Katt extends Djur {

	public Katt(String namn) {
		super(namn);
	}

	@Override
	public void låta() {
		System.out.println("Mjau");
	}
}
