package edu.uark.csce.sentencebuilder;

import edu.uark.csce.sentencebuilder.R;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class WordToolActivity extends ActionBarActivity {
	Noun subject;
	Verb action;
	Noun directObject;
	String sentence, sentenceTranslate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word_tool);
		//Noun Spinner
		Spinner nounDropDown = (Spinner)findViewById(R.id.nounSpinner);
		String[] nouns = new String[]{"dog", "cat", "boy", "girl", "man"};
		ArrayAdapter<String> nounAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nouns);
		nounDropDown.setAdapter(nounAdapter);

		//Verb Spinner
		Spinner verbDropDown = (Spinner)findViewById(R.id.verbSpinner);
		String[] verbs = new String[]{"pokes", "punches", "eats", "jumps", "helps"};
		ArrayAdapter<String> verbAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, verbs);
		verbDropDown.setAdapter(verbAdapter);

		//DO Spinner
		Spinner DODropDown = (Spinner)findViewById(R.id.DOSpinner);
		ArrayAdapter<String> DOAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, nouns);
		DODropDown.setAdapter(DOAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {


		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.word_tool, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void onNounOk(View view) {
		Spinner nounDropDown = (Spinner)findViewById(R.id.nounSpinner);
		Spinner verbDropDown = (Spinner)findViewById(R.id.verbSpinner);
		Spinner DODropDown = (Spinner)findViewById(R.id.DOSpinner);
		subject = new Noun(nounDropDown.getSelectedItem().toString(), "noun", "the", false);

		action = new Verb(verbDropDown.getSelectedItem().toString(), "verb");
		directObject = new Noun(DODropDown.getSelectedItem().toString(), "noun", "the", false);
		action.addDirectObject(directObject);
		subject.addVerb(action);
		updateTextField();
	}
	public void updateTextField() {
		sentence = (subject.display().substring(0, 1).toUpperCase() + subject.display().substring(1));
		sentence = sentence.substring(0, sentence.length()-1) + ".";
		Log.d(null, sentence);
		TextView result = (TextView)findViewById(R.id.textView1);
		result.setText(sentence);

	}

}
