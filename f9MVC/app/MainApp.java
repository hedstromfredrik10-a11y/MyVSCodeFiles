package f9MVC.app;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import f9MVC.controller.Controller;
import f9MVC.model.Djur;
import f9MVC.model.Hund;
import f9MVC.model.Person;
import f9MVC.view.PersonMedDjurGUI;

public class MainApp {

	public static void main(String[] args) {
		// modellen
		Person person = new Person("Tintin");

		// utöka modellen ge personen ett djur
		Djur hund = new Hund("Milou");
		List<Djur> husdjur = new ArrayList<Djur>();
		husdjur.add(hund);
		person.setHusdjur(husdjur);

		// Controller
		Controller controller = new Controller(person);

		// Viewn
		SwingUtilities.invokeLater(() -> new PersonMedDjurGUI(controller));
	}
}
