package edu.uark.csce.sentencebuilder;

import android.util.Log;

public class Word {

	public String word;
	public String designator;
	public String wordTranslate;
	public int bgcolor;
	public int textcolor;
	
	
	public Word() {
		this.word = "";
		this.bgcolor = 0;
		this.textcolor = 0;
	}
	
	public Word(String w, int bgc, int tc) {
		this.word = new String(w);
		this.bgcolor = bgc;
		this.textcolor = tc;
	}
}
