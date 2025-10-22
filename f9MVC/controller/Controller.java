package f9MVC.controller;


import f9MVC.model.Djur;
import f9MVC.model.Person;

public class Controller {
	private Person person;

	public Controller(Person person) {
		this.person = person;	
	}
	
	public String getFirstDjur() {
		return person.getHusdjur().get(0).toString(); //VARNING listan kan vara tom
	}

}
