package com.br.adapter;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.br.guiajarinu.R;

import com.br.objetos.Anuncio;

@SuppressLint("ResourceAsColor")
public class Adaptador extends BaseAdapter {
	private Context ctx;
	private List<Anuncio>lista;
	
	
	public Adaptador(Context ctx, List<Anuncio> lista){
		
		this.ctx = ctx;
		this.lista = lista;
		
		
	}
	
	@Override
	public int getCount() {
		return lista.size();
	}

	@Override
	public Object getItem(int position) {
		return lista.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	
	// Retornando a View
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		Anuncio anuncio = lista.get(position);
		
		// Recupera o Item
		LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.item, null);
		
		TextView txtTitle = (TextView) v.findViewById(R.id.textViewDestino);
		txtTitle.setText(anuncio.getMarca());
		
		
		
		TextView txtFone = (TextView) v.findViewById(R.id.textViewFone);
		txtFone.setText(anuncio.getTel1());
		
		TextView txtEndereco = (TextView) v.findViewById(R.id.textViewEnd);
		txtEndereco.setText(anuncio.getEndereco());
		
		ImageView img =(ImageView)v.findViewById(R.id.imageViewLogo);

		
		
		
		TextView txtViewVeja = (TextView) v.findViewById(R.id.textViewAnuncio);
		if (anuncio.getAtivo()== 1){
			txtViewVeja.setText("Assinante");
			img.setImageResource(R.drawable.premium);
			
		}else{
			txtViewVeja.setText("");
		}
		
	
		
		
		return v;
	}

}
