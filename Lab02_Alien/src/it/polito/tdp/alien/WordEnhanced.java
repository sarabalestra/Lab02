package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	
	//Ad ogni parola è associata una lista di traduzioni.
	
	private String alienWord;
	private List<String>translations;
	
	public WordEnhanced(String alienWord) {
		this.alienWord = alienWord;
		translations = new LinkedList<String>();
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public List<String> getTranslations() {
		return translations;
	}

	
	//Se la traduzione inserita non è già presente la aggiungo alla lista di traduzioni per quella parola.
	public void setTranslations(String translation) {
		
		boolean flag = false;
		
		for(String s : translations) {
			if(s.compareTo(translation) == 0) {
				flag = true;	
			}
		}
		
		if(flag == false){
			this.translations.add(translation);
		}
			
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnhanced other = (WordEnhanced) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	
	
	

	
	
}
