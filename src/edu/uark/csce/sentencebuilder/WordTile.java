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
				switch (this.word) {
				case "dog": return "inu"; 
				case "cat": return "neko"; 
				case "boy": return "otokonoko"; 
				case "girl": return "onnanoko";
				case "man": return "otokonohito"; 
				case "pokes": return "tsukimasu";
				case "punches": return "nagurimasu";
				case "eats": return "tabemasu";
				case "jumps": return "tobimasu";
				case "helps": return "tasukemasu";

				default: return this.word;
				}
			}
		else if (MainActivity.language.equals("Spanish")) {
			
		}
		
		Log.d(null, command);
		return translation;
	}

}
