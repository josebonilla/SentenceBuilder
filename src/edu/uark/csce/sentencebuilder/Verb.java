package edu.uark.csce.sentencebuilder;

import java.util.ArrayList;

public class Verb extends WordTile{

	private ArrayList<WordTile> addirectObjects;
	private ArrayList<Noun> directObjects;
	
	public Verb() {
	
	}
	
	public Verb(String word, String designator) {
		super.word = word;
		super.designator = designator;
		addirectObjects = new ArrayList<WordTile>();
		directObjects = new ArrayList<Noun>();
		super.wordTranslate = super.getTranslation(this);
	}
	
	public void addAdverb(WordTile adverb) {
		addirectObjects.add(adverb);
	}
	
	public void addDirectObject(Noun noun) {
		directObjects.add(noun);
	}
	
	public String display() {
		String sentence = "";
		//for (ObjectType objectName : collectionName.getObjects())
		for (int it = 0; it < addirectObjects.size(); it++) {
			sentence += addirectObjects.get(it).word + " ";
		}
		sentence += super.word + " ";
		for (int it = 0; it < directObjects.size(); it++) {
			sentence += directObjects.get(it).display();
		}
		
		return sentence;
	}
	
}
