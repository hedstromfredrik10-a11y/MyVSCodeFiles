package f9MVC.model;

import java.util.List;

public class Person {
	private String namn;
	private List<Djur> husdjur;

	public Person(String namn) {
		this.namn = namn;
	}

	public void setHusdjur(List<Djur> djur) {
		this.husdjur = djur;
	}

	public List<Djur> getHusdjur() {
		return husdjur;
	}
}
