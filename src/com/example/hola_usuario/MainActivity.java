package com.example.hola_usuario;

import android.support.v7.app.ActionBarActivity;
//import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
	private EditText txtNombre;
	private Button btHola;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtNombre = (EditText) findViewById(R.id.TxtNombre);
		//Obtenemos una referencia a los controles de la interfaz.
		btHola = (Button) findViewById(R.id.BtnHola);
		btHola.setOnClickListener(new View.OnClickListener() {
			
			//Implementemoa el evento "click" del botón.
			@Override
			public void onClick(View v) {
				accionBoton();
				
			}
		});

	}
	
	private void accionBoton(){
		//Creamos el intent
		Intent intent = new Intent(MainActivity.this,FrmSaludo.class);
		
		//Creamos la info a pasar entre la actividades.
		Bundle bund = new Bundle();
		bund.putString("NOMBRE", txtNombre.getText().toString());
		
		//Añadimos la info al intent.
		intent.putExtras(bund);
		
		//Iniciamos la nueva Actividad(pantalla).
		startActivity(intent);
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
}
