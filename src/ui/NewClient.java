package ui;

import data.Account;
import data.SeasonTicket;

public class NewClient extends Account implements UserMode{

	private String name;
	private String surname;
	private SeasonTicket ticket;
	
	public NewClient() {
		name = "";
		surname = "";
	}
	
	public SeasonTicket buySeasonTicket() {
		return ticket;
	}
	
	public void showProfile() {
		
	}
	
	@Override
	public void createUI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchMode() {
		// TODO Auto-generated method stub
		
	}
	
}
