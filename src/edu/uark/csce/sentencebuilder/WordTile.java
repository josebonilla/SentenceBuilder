package edu.uark.csce.sentencebuilder;

import android.util.Log;

public class WordTile {

	public String word;
	public String designator;
	public String wordTranslate;
	
	public WordTile() {
		
	}
	
	public WordTile(String word, String designator) {
		this.word = word;
		this.designator = designator;
		this.wordTranslate = getTranslation(this);
	}
	
	public String getTranslation(WordTile word) {
		String translation = "";
		String command = "";
		if (MainActivity.language.equals("Japanese")) {
			command +="Select "+ MainActivity.language + " from " + word.designator + " where English is '" + word.word + "'";
		}
		else if (MainActivity.language.equals("Spanish")) {
			
		}
		
		Log.d(null, command);
		return translation;
	}

}
