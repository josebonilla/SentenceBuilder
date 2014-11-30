package edu.uark.csce.sentencebuilder;

import java.util.ArrayList;

public class Verb extends Word{

	private Noun object;
	private Adverb adverb;
	
	public Verb() {
	
	}
	
	public Verb(String word, String designator) {

	}
	
	public void addAdverb(Adverb a) {
		this.adverb = a;
	}
	
	public void addObject(Noun n) {
		this.object = n;
	}
	
}
