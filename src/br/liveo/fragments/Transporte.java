package br.liveo.fragments;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import br.liveo.utils.Menus;

import com.br.adapter.AdapterTransporte;
import com.br.guiajarinu.Onibus;
import com.br.guiajarinu.R;
import com.br.guiajarinu.ViewAnuncio;
import com.br.objetos.Anuncio;
import com.br.objetos.PojoTransporte;
import com.br.objetos.Transp;

public class Transporte extends Fragment{

	private ListView listaTransporte;
	AdapterTransporte adapter;
    ArrayList<Transp> list;
	 ListView lista;

	
    public static Transporte newInstance() {
        Bundle bundle = new Bundle();

        Transporte fragment = new Transporte();
        fragment.setArguments(bundle);

        return fragment;
    }	
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			
		
		View rootView = inflater.inflate(R.layout.transporte, container, false);
	
	
		listaTransporte = (ListView)rootView.findViewById(R.id.listViewHorarios);
		
		// carrego os objetos para lista
		 list = PojoTransporte.getTransportes();
		
	     adapter = new AdapterTransporte(rootView.getContext(),list);
		
		
		listaTransporte.setAdapter(adapter);
  
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat(
				"HH:mm");
		String data = new String(simpleFormat.format(new Date(System
				.currentTimeMillis())));
		
		listaTransporte.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView arg0, View view, int position,
					long index) {
				
				Transp t =   list.get(position);
				Intent it = new Intent(getActivity().getApplicationContext(), Onibus.class);
				Bundle params = new Bundle();
				
				
				params.putString("id", "Ola");
				params.putStringArrayList("horarios", t.getHorarios());
				it.putExtras(params);
				
				
	
				startActivity(it);
				
				
				

			}
		});

		

			
		rootView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT ));
		
		
		return rootView;
	}
				
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);		
		inflater.inflate(R.menu.menu, menu);
					    	   	    
		menu.findItem(Menus.ADD).setVisible(false);
		menu.findItem(Menus.UPDATE).setVisible(false);		
		menu.findItem(Menus.SEARCH).setVisible(true);
		
		SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(Menus.SEARCH));
	    searchView.setQueryHint(this.getString(R.string.search));
	    
	    ((EditText)searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text))
        .setHintTextColor(getResources().getColor(R.color.white));		
		
	}
}


