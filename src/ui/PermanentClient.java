package ui;

import java.util.List;

import data.Excercise;
import data.Nutrition;

public class PermanentClient extends NewClient{

	private Long idTicket;
	private List<Excercise> excerciseList;
	private List<Nutrition> nutritionList;
	private Trainer trainer;
	private Long idProgram;
	private Excercise ex;
	private Nutrition nutrition;
	
	public void setIdTicket(Long id) {
		idTicket = id;
	}
	
	public Long getIdTicket() {
		return idTicket;
	}
	
	public void setIdProgram(Long id) {
		idProgram = id;
	}
	
	public Long getIdProgram() {
		return idProgram;
	}
	
	public Trainer addTrainer() {
		return trainer;
	}
	
	public void removeTrainer(Trainer trainer) {}
	
	public List<Excercise> showExcercise() {
		return excerciseList;
	}
	
	/*!*/
	public Excercise addExcercise(Excercise ex) {
		excerciseList.add(ex);
		return ex;
	}
	
	public void removeExcercise(Excercise ex) {
		excerciseList.remove(ex);
	}
	/*!*/
	public Nutrition showNutrition() {
		return nutrition;
	}
	
	/*!*/
	public Nutrition addNutrition(Nutrition nutrition) {
		nutritionList.add(nutrition);
		return nutrition;
	}
	
	public void removeNutrition(Nutrition nutrition) {
		nutritionList.remove(nutrition);
	}
}
