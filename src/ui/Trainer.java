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
	private Excercise exercise;
	
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
	
	public void setProgram(Program pr) {
		program = pr;
	}
	
	public Program getProgram() {
		return program;
	}
	
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}
	
	public Nutrition getNutrition() {
		return nutrition;
	}
	
	public void setExercise(Excercise ex) {
		exercise = ex;
	}
	
	public Excercise getExercise() {
		return exercise;
	}
	
	/*!*/
	public void showClients() {}
	
	public void showClientProfile() {}
	
	public Program addProgramToClient() {
		return program;
	}
	
	public Excercise addExerciseToClient() {
		return exercise;
	}
	
	public void removeExerciseFromClient() {}
	
	public Nutrition addNutritionToClient() {
		return nutrition;
	}
	
	public void removeNutritionFromClient() {}
	
}
