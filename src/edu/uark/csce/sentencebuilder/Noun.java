package edu.uark.csce.sentencebuilder;

import java.util.ArrayList;

public class Noun extends WordTile{

	private ArrayList<WordTile> adjectives;
	private ArrayList<Verb> verbs;
	public String demonstrativeArticle;
	private boolean isPlural;
	
	public Noun() {
	
	}
	
	public Noun(String word, String designator, String DA, boolean plural) {
		super.word = word;
		super.designator = designator;
		adjectives = new ArrayList<WordTile>();
		verbs = new ArrayList<Verb>();
		this.demonstrativeArticle = DA;
		this.isPlural = plural;
		super.wordTranslate = super.getTranslation(this);
	}
	
	public void addAdjective(WordTile adjective) {
		adjectives.add(adjective);
	}
	
	public void addVerb(Verb verb) {
		verbs.add(verb);
	}
	
	public String display() {
		String sentence = this.demonstrativeArticle + " ";
		//for (ObjectType objectName : collectionName.getObjects())
		for (int it = 0; it < adjectives.size(); it++) {
			sentence += adjectives.get(it).word + " ";
		}
		sentence += super.word + " ";
		for (int it = 0; it < verbs.size(); it++) {
			sentence += verbs.get(it).display();
		}
		
		return sentence;
		
	}
	public String displayTranslation() {
		String sentence = this.demonstrativeArticle + " ";
		//for (ObjectType objectName : collectionName.getObjects())
		for (int it = 0; it < adjectives.size(); it++) {
			sentence += adjectives.get(it).word + " ";
		}
		sentence += super.word + " ";
		for (int it = 0; it < verbs.size(); it++) {
			sentence += verbs.get(it).display();
		}
		
		return sentence;
		
	}

	
}
