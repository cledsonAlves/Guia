package com.br.guiajarinu;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.br.adapter.AdapterHorarios;
import com.br.objetos.Transp;

public class Onibus extends Activity{
	ArrayList<Transp> list;
	ArrayList<String> listHorarios;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.transporte);
    	ListView list = (ListView)findViewById(R.id.listViewHorarios);
    	
    	Intent it = getIntent();
    	if (it != null){
    		Bundle params = it.getExtras();
    		if (params != null){
    			ArrayList<String> lista = params.getStringArrayList("horarios");
    			listHorarios = lista;
    		}
    	}
    	
    	
    	
    	if (listHorarios != null){
    		AdapterHorarios ad = new AdapterHorarios(getApplicationContext(),listHorarios);
    		list.setAdapter(ad);
    	}
    	
    	
    }
    
 

}
