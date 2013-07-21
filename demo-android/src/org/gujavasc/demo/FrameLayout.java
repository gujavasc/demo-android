package org.gujavasc.demo;

import org.gujavasc.demo.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class FrameLayout extends Activity {
	private final String TAG = "FRAME_LAYOUT";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frame_layout);
		
		Log.i(TAG, "onCreate() chamado."); 
	}

	@Override
	protected void onStart() { 
		super.onStart(); 
		Log.i(TAG, "onStart() chamado."); 
	} 

	@Override
	protected void onRestart() { 
		super.onRestart(); 
		Log.i(TAG, "onRestart() chamado."); 
	} 

	@Override
	protected void onResume() { 
		super.onResume(); 
		Log.i(TAG, "onResume() chamado."); 
	} 

	@Override
	protected void onPause() { 
		super.onPause(); 
		Log.i(TAG, "onPause() chamado."); 
	} 

	@Override
	protected void onStop() { 
		super.onStop(); 
		Log.i(TAG, "onStop() chamado."); 
	} 

	@Override
	protected void onDestroy() { 
		super.onDestroy(); 
		Log.i(TAG, "onDestroy() chamado."); 
	} 

}
