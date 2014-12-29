package br.liveo.fragments;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import br.exemplosendimageforphp.EnviaFormulario;
import br.liveo.utils.Menus;

import com.br.adapter.AdapterListView;
import com.br.baseDados.ManipulaBanco;
import com.br.guiajarinu.R;
import com.br.objetos.Comentario;

public class Noticias extends Fragment implements Runnable{

	private TextView textViewDta;
	private ListView lista;

	
	
    public static Noticias newInstance() {
        Bundle bundle = new Bundle();

        Noticias fragment = new Noticias();
        fragment.setArguments(bundle);

        return fragment;
    }	
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			
		View rootView = inflater.inflate(R.layout.noticia_fragment, container, false);
			
		lista = (ListView)rootView.findViewById(R.id.listViewAnuncios);

        ArrayList<Comentario> listas = new ArrayList<Comentario>();
        
        // Busca os dados do banco
        ManipulaBanco mb = new ManipulaBanco(rootView.getContext());
        listas = mb.getComentario(null);
  
        
        
        AdapterListView adap = new  AdapterListView(rootView.getContext(), listas);

		lista.setAdapter(adap);
		
     	
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
	
		
		menu.findItem(Menus.MESSAGE).setVisible(true);	
		
	
	    
		
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {  
	
        
		switch (item.getItemId()) {		
		case Menus.ADD:
		 //   Toast.makeText(getActivity(),"Em desenvolvimento, aguradem..", Toast.LENGTH_LONG).show();

			
			return true;			
		default:
			return super.onOptionsItemSelected(item);			
		}		             
    }

	@Override
	public void run() {

		
	}
}


