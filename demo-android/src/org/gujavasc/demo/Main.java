package org.gujavasc.demo;

import org.gujavasc.demo.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity {

	private final String TAG = "MAIN";
	private final int SIMULAR_CHAMADA = 0;
	private final int PASSAR_PARAMETRO = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ouvinte();
		gerarLogs();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.m_WebView:
			Intent it = new Intent(Main.this, WebVieww.class);
			startActivity(it);
			return true;

		default:
			return super.onOptionsItemSelected(item);
		}
	}

	public void ouvinte() {
		parametro();
		alertaDialog();
		abrirBrowser();
		simularChamada();
		frameLayout();
		linearLayout();
		relativeLayout();
		listView();
		gridView();
	}

	private void parametro() {
		Button parametro = (Button) findViewById(R.id.bt_parametro);
		parametro.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				entradaTexto(PASSAR_PARAMETRO);
			}
		});
	}

	private void alertaDialog() {
		Button alerta = (Button) findViewById(R.id.bt_entradaTexto);
		alerta.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				entradaTexto(SIMULAR_CHAMADA);
			}
		});
	}

	private void gridView() {
		Button grid = (Button) findViewById(R.id.bt_gridView);
		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(Main.this, GridVieww.class);
				startActivity(it);
			}
		});
	}

	private void listView() {
		Button list = (Button) findViewById(R.id.bt_listView);
		list.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(Main.this, ListView.class);
				startActivity(it);
			}
		});
	}

	private void relativeLayout() {
		Button relative = (Button) findViewById(R.id.bt_relativeLayout);
		relative.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(Main.this, RelativeLayout.class);
				startActivity(it);
			}
		});
	}

	private void linearLayout() {
		Button linear = (Button) findViewById(R.id.bt_linearLayout);
		linear.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(Main.this, LinearLayout.class);
				startActivity(it);
			}
		});
	}

	private void frameLayout() {
		Button frame = (Button) findViewById(R.id.bt_frameLayout);
		frame.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent it = new Intent(Main.this, FrameLayout.class);
				startActivity(it);
			}
		});
	}

	private void simularChamada() {
		Button chamada = (Button) findViewById(R.id.bt_simularChamada);
		chamada.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				String url = "tel:99999999"; 
				Intent it = new Intent(Intent.ACTION_CALL, Uri.parse(url)); 
				startActivity(it);
			}
		});
	}

	private void abrirBrowser() {
		Button browser = (Button) findViewById(R.id.bt_abrirBrowser);
		browser.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Uri uri = Uri.parse("http://www.gujavasc.org"); 
				Intent it = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(it);
			}
		});
	}


	protected void entradaTexto(final int acao) {
		AlertDialog.Builder alert = new AlertDialog.Builder(this);
		final EditText input = new EditText(this);

		input.setInputType(InputType.TYPE_CLASS_TEXT);

		alert.setMessage("Entrada de Texto..")
		.setView(input);

		alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				String mensagemUsuario = input.getText().toString().trim();
				if (acao == SIMULAR_CHAMADA) alertaToast(mensagemUsuario);
				else if (acao == PASSAR_PARAMETRO) passarParametro(mensagemUsuario);
			}
		});

		alert.setNegativeButton("Cancelar",	new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int whichButton) {
				dialog.cancel();
			}
		});

		alert.show();
	}

	private void alertaToast(String mensagemUsuario) {
		Toast.makeText(Main.this, mensagemUsuario, Toast.LENGTH_LONG).show();
	}

	private void passarParametro(String mensagemUsuario){
		Intent it = new Intent(Main.this, Parametros.class); 
		Bundle params = new Bundle(); 
		params.putString("msg", mensagemUsuario); 
		it.putExtras(params); 
		startActivity(it); 
	}

	private void gerarLogs() {
		Log.v(TAG, "Log de Verbose");
		Log.d(TAG, "Log de Debug");
		Log.i(TAG, "Log de Info");
		Log.w(TAG, "Log de Warn");
		Log.e(TAG, "Log de Error");
	}

}