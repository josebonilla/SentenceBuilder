package edu.uark.csce.sentencebuilder;

import edu.uark.csce.sentencebuilder.R;
import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class WordToolActivity extends ActionBarActivity {
	Sentence sentence;
	Fragment builderfragment;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_word_tool);
		

		builderfragment = new SelectLanguageFragment();
		setFragment(builderfragment);


	}
	public void next(View v){
		int id = v.getId();
		
		if(id == R.id.next1)replaceFragment(new SelectSubjectFragment());
		else if(id == R.id.next2){
			SelectVerbFragment f = new SelectVerbFragment();
			f.id = R.array.trans_verb_list;
			replaceFragment(f);
		}
		else if(id == R.id.next3){
			SelectVerbFragment f = new SelectVerbFragment();
			f.id = R.array.nontrans_verb_list;
			replaceFragment(f);
		}
	}
	public void setFragment(Fragment f){
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();		
		ft.replace(R.id.fragment_container, f);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack("LIST");
        
        ft.commit();
	}

	public void replaceFragment(Fragment f){
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();		
		ft.replace(R.id.fragment_container, f);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack("LIST");
        ft.commit();
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


}
