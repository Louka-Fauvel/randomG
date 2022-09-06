package edu.sio.randomG;

import java.util.ArrayList;

public class Aleatoire {

	private int valeurNum;
	private int tentative;
	private int min;
	private int max;
	//private ArrayList<> propositions;
	
	public Aleatoire(int tentative, int min, int max) {
		this.tentative = tentative;
		this.min = min;
		this.max = max;
		this.valeurNum = (int)(Math.random() * ((this.max - this.min) + 1)) + this.min;
	}
	
	public int getTentative() {
		return tentative;
	}

	public void setTentative(int tentative) {
		this.tentative = tentative;
	}

	public String toString() {
		return "La valeur se situe entre " + min + " et " + max;
	}
	
	public String proposerNombre(int proposition) {
		
		if(proposition == this.valeurNum) {
			
			this.tentative = 0;
			return "Vous avez gagné !!!";
			
		} else {
			
			this.tentative--;
			
			if(this.tentative == 0) {
				
				return "Fin du jeu. Vous avez perdu. C'était " + valeurNum;
				
			} else {
				
				return "Recommencer. Il vous reste " + tentative + " tentative(s)";
				
			}
			
		} 
		
	}
	
}
