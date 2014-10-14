package com.example.hola_usuario;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FrmSaludo extends Activity {
	private TextView txtSaludo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_saludo);
		txtSaludo = (TextView) findViewById(R.id.TxtSaludo);
		
		//Recuperamos la info pasada en el intent
		Bundle bundle = this.getIntent().getExtras();
		
		//Construimos el mensaje a mostrar
		txtSaludo.setText("Hola " +bundle.getString("NOMBRE"));
		
	}

	
}
