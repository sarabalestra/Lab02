package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word>dizionario;
	
	public AlienDictionary() {
		dizionario = new LinkedList<Word>();
	}
	
	//Se la parola è già presente, la traduzione deve essere aggiornata
	public void addWord(String alienWord, String translation) {
		
		Word parola = new Word(alienWord, translation);
		
		for(Word w: dizionario) {
			if(w.equals(parola)) {
				w.setTranslation(translation);
				return;
			}
		}
		
		dizionario.add(parola);	
	}
	
	
	public String translateWord(String alienWord) {
		
		for(Word w :dizionario) {
			if(w.getAlienWord().compareTo(alienWord) == 0) {
				return w.getTranslation();
			}
		}
		
		return "Traduzione non presente!";
		
	}

}
