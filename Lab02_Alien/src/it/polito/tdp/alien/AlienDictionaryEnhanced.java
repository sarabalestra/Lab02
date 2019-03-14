package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionaryEnhanced {
	
	
private List<WordEnhanced>dizionario;
	
	public AlienDictionaryEnhanced() {
		dizionario = new LinkedList<WordEnhanced>();
	}
	
	
	public void addWord(String alienWord, String translation) {
		
		WordEnhanced parola = new WordEnhanced(alienWord);
		
		for(WordEnhanced w: dizionario) {
			if(w.equals(parola)) {
				w.setTranslations(translation);
				return;
			}
		}
		
		dizionario.add(parola);
		parola.setTranslations(translation);
	}
	
	
	public String translateWord(String alienWord) {
		
		for(WordEnhanced w :dizionario) {
			if(w.getAlienWord().compareTo(alienWord) == 0) {
				
				String stampa = "";
				for(String s : w.getTranslations()) {
					stampa = stampa+ s+"\n";
				}
				
				return stampa;
			}
		}
		
		return "Traduzione non presente!";
		
	}


}
