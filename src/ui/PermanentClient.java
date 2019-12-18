package ui;

import java.util.List;

import data.Excercise;
import data.Nutrition;
import data.Program;

public class PermanentClient extends NewClient{

	private Long idTicket;
	private List<Excercise> exerciseList;
	private List<Nutrition> nutritionList;
	private Trainer trainer;
	private Long idProgram;
	private Excercise exercise;
	private Nutrition nutrition;
	private Program program;
	
	public void setIdTicket(Long id) {
		idTicket = id;
	}
	
	public Long getIdTicket() {
		return idTicket;
	}
	
	public void setTrainer(Trainer tr) {
		trainer = tr;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	
	public void setIdProgram(Long id) {
		idProgram = id;
	}
	
	public Long getIdProgram() {
		return idProgram;
	}
	
	public void setExercise(Excercise ex) {
		exercise = ex;
	}
	
	public Excercise getExercise() {
		return exercise;
	}
	
	public void setNutrition(Nutrition nutrition) {
		this.nutrition = nutrition;
	}
	
	public Nutrition getNutrition() {
		return nutrition;
	}
	
	public void setProgram(Program pr) {
		program = pr;
	}
	
	public Program getProgram() {
		return program;
	}
	
	public Trainer addTrainer() {
		return trainer;
	}
	
	public void removeTrainer(Trainer trainer) {}
	
	public List<Excercise> showExercise() {
		return exerciseList;
	}
	
	/*!*/
	public Excercise addExercise(Excercise ex) {
		exerciseList.add(ex);
		return ex;
	}
	
	public void removeExcercise(Excercise ex) {
		exerciseList.remove(ex);
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
