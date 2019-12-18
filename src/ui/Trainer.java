package ui;

import data.Account;
import data.Excercise;
import data.Nutrition;
import data.Program;

public class Trainer extends Account {

	private String name;
	private String surname;
	/*!*/
	//private Client client;
	private Program program;
	private Nutrition nutrition;
	private Excercise excercise;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSurame(String surname) {
		this.surname = surname;
	}
	
	public String getSurame() {
		return surname;
	}
	/*!*/
	public void showClients() {}
	
	public void showClientProfile() {}
	
	public Program addProgramToClient() {
		return program;
	}
	
	public Excercise addExcerciseToClient() {
		return excercise;
	}
	
	public void removeExcerciseFromClient() {}
	
	public Nutrition addNutritionToClient() {
		return nutrition;
	}
	
	public void removeNutritionFromClient() {}
	
}
