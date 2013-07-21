package org.gujavasc.demo;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListView extends ListActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		gerarLista();
	}

	private void gerarLista() {
		String[] GENRES = new String[] {
				"Action", "Adventure", "Animation", "Children", "Comedy", "Documentary", "Drama",
				"Foreign", "History", "Independent", "Romance", "Sci-Fi", "Television", "Thriller"
		};

		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, GENRES));
		getListView().setTextFilterEnabled(true);
	}
}
