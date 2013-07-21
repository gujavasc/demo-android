package org.gujavasc.demo;

import org.gujavasc.demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class Conceitos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_conceitos);

		EditText text = (EditText) findViewById(R.id.ed_conceitos);
		String digitado = text.getText().toString();
		Log.i("EXEMPLO", "O texto digitado foi " + digitado); 

		/** Criação de uma interface gráfica com API
		 * 
		 * TextView view = new TextView(this); 
		 * view.setText("Exemplo de Texto no Android");
		 * setContentView(view);  
		 */
	}

}
