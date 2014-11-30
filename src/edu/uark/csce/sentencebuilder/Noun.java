package edu.uark.csce.sentencebuilder;

import java.util.ArrayList;

public class Noun extends Word{

	private Adjective adjective;
	private Verb verb;
	public Article article;
	private boolean isPlural;
	private boolean isSubject;
	
	public Noun() {
	
	}
	

	public void addAdjective(Adjective a) {
		this.adjective = a;
	}
	
	public void addVerb(Verb v) {
		this.verb = v;
	}

	
}
