package br.liveo.fragments;

import java.util.ArrayList;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import br.liveo.utils.Menus;

import com.br.adapter.Adaptador;
import com.br.baseDados.ManipulaBanco;
import com.br.guiajarinu.R;
import com.br.guiajarinu.ViewAnuncio;
import com.br.objetos.Anuncio;

public class Farmacias extends Fragment{
	
	
	private TextView txtFragmentThree;
	private ListView lista;
	ArrayList<Anuncio> listas;
	
	
    public static Farmacias newInstance() {
        Bundle bundle = new Bundle();

        Farmacias fragment = new Farmacias();
        fragment.setArguments(bundle);

        return fragment;
    }	
    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			
		View rootView = inflater.inflate(R.layout.three_fragment, container, false);
		
		lista = (ListView)rootView.findViewById(R.id.listViewAnuncios);

       listas = new ArrayList<Anuncio>();
       
        // Busca os dados do banco
        ManipulaBanco mb = new ManipulaBanco(rootView.getContext());
        listas = mb.getAnuncio("RAMO = '3'");
        
        
        Adaptador adap = new Adaptador(rootView.getContext(), listas);

		lista.setAdapter(adap);
		

		
		rootView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT ));
		lista.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView arg0, View view, int position,
					long index) {
				
				Anuncio anuncio = listas.get(position);
				Intent it = new Intent();
				it.putExtra("id",anuncio.getMarca());
				
				ViewAnuncio.anuncio = anuncio;
				if (anuncio.getAtivo()==1){
					startActivity(anuncio);	
				}


			}
		});
		
		lista.setOnItemLongClickListener(new OnItemLongClickListener() {
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int position, long arg3) {
				Anuncio anuncio = listas.get(position);
				
				if (!anuncio.getTel1().equals("")) {
					Uri uri = Uri.parse("tel:" + anuncio.getTel1().replace("(11)", ""));
					Intent it = new Intent(Intent.ACTION_CALL, uri);
					startActivity(it);
				}
				

				return false;
			}
			
		});
		return rootView;
	}
	//Abre o anuncio
		public void startActivity(Anuncio anuncio){
			startActivity(new Intent(getActivity().getApplicationContext(), ViewAnuncio.class));
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
			
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {  
	
        
		switch (item.getItemId()) {		
		case Menus.ADD:
		    //Toast.makeText(getActivity(),"Teste", Toast.LENGTH_LONG).show(); 
			
			return true;			
		default:
			return super.onOptionsItemSelected(item);			
		}		             
    }
}


