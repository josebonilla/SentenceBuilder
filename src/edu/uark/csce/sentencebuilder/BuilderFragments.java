package edu.uark.csce.sentencebuilder;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

class BuilderFragment extends Fragment{
	public ArrayAdapter<CharSequence> getAdapter(int Id){
		ArrayAdapter<CharSequence> a = ArrayAdapter.createFromResource(this.getView().getContext(),  Id,  android.R.layout.simple_spinner_item);
		a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		return a;
	}
}
class SelectLanguageFragment extends BuilderFragment {
	Spinner spinner_language;
	Button next;
 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  View view = inflater.inflate(R.layout.fragment_select_lang, null);

	spinner_language = (Spinner) view.findViewById(R.id.spinner_language);
	ArrayAdapter<CharSequence> arrayadapter = ArrayAdapter.createFromResource(view.getContext(),  R.array.language_list,  android.R.layout.simple_spinner_item);
	arrayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner_language.setAdapter(arrayadapter);
  return view;
 }
}

class SelectSubjectFragment extends BuilderFragment {
	Spinner spinner_adjective;
	Spinner spinner_subject;
 @Override
 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  View view = inflater.inflate(R.layout.fragment_select_subject, null);

	spinner_adjective = (Spinner) view.findViewById(R.id.spinner_adjective);
	ArrayAdapter<CharSequence> arrayadapter1 = ArrayAdapter.createFromResource(view.getContext(),  R.array.adjective_list,  android.R.layout.simple_spinner_item);
	arrayadapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner_adjective.setAdapter(arrayadapter1);
	
	spinner_subject = (Spinner) view.findViewById(R.id.spinner_subject);
	ArrayAdapter<CharSequence> arrayadapter2 = ArrayAdapter.createFromResource(view.getContext(),  R.array.noun_list,  android.R.layout.simple_spinner_item);
	arrayadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner_subject.setAdapter(arrayadapter2);	
  return view;
 }
}
 class SelectVerbFragment extends BuilderFragment {
		Spinner spinner_adverb;
		Spinner spinner_verb;
		int id;
		ArrayAdapter<CharSequence> arrayadapter2;
	 @Override
	 public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	  View view = inflater.inflate(R.layout.fragment_select_verb, null);

		spinner_adverb = (Spinner) view.findViewById(R.id.spinner_adverb);
		ArrayAdapter<CharSequence> arrayadapter1 = ArrayAdapter.createFromResource(view.getContext(),  R.array.adverb_list,  android.R.layout.simple_spinner_item);
		arrayadapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner_adverb.setAdapter(arrayadapter1);
		
		spinner_verb = (Spinner) view.findViewById(R.id.spinner_verb);
		arrayadapter2 = ArrayAdapter.createFromResource(view.getContext(),  id,  android.R.layout.simple_spinner_item);
		arrayadapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner_verb.setAdapter(arrayadapter2);	
		
	  return view;
	 }
 }
 /////
