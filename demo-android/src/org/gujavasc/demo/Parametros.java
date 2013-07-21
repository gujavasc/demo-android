package org.gujavasc.demo;

import org.gujavasc.demo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Parametros extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_parametros);

		Intent it = getIntent(); 
		if(it != null){ 
			Bundle params = it.getExtras(); 
			if(params != null){ 
				String mensagemUsuario = params.getString("msg");

				TextView text = (TextView) findViewById(R.id.tx_parametro);
				text.setText(mensagemUsuario);
			} 
		} 
	}

}
