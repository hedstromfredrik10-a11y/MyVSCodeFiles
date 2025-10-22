package f9MVC.model;

public abstract class Djur implements Comparable<Djur> {

	protected String namn;
	private int ålder;

	public Djur(String namn) {
		this.namn = namn;
	}

	public void changeName(String newName) {
		this.namn = newName;
	}

	public abstract void låta();

	public void setÅlder(int nyÅlder) {
		this.ålder = nyÅlder;
	}

	public int compareTo(Djur djur) {
		if (this.ålder > djur.ålder)
			return 1;
		else if (this.ålder == djur.ålder)
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() {
		return namn + " med ålder " + ålder;
	}

}
