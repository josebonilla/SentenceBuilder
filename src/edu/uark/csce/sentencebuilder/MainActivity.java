package edu.uark.csce.sentencebuilder;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import edu.uark.csce.sentencebuilder.Noun;
import edu.uark.csce.sentencebuilder.Verb;
import edu.uark.csce.sentencebuilder.Word;
import edu.uark.csce.sentencebuilder.R;

//import com.memetix.mst.language.Language;
//import com.memetix.mst.translate.Translate;


public class MainActivity extends ActionBarActivity {
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	public void openTool(View view) {
		
		Intent intent = new Intent(MainActivity.this, WordToolActivity.class);
		startActivity(intent);
	}
	
	public void openProfile(View view) {
		
		Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
		startActivity(intent);
	}
	
	public void openSettings(View view) {
		
		Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
		startActivity(intent);
	}
	
	public void openGame(View view) {
		
		Intent intent = new Intent(MainActivity.this, MainActivity.class);
		startActivity(intent);
	}
}
