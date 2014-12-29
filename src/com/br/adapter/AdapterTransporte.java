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
import com.br.objetos.Transp;

@SuppressLint({ "ResourceAsColor", "InflateParams", "ViewHolder" })
public class AdapterTransporte extends BaseAdapter {
	private Context ctx;
	private List<Transp>lista;
	
	
	public AdapterTransporte(Context ctx, List<Transp> lista){
		
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
		
		Transp transporte = lista.get(position);
		
		// Recupera o Item
		LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.item_transporte, null);
		
         TextView titulo = (TextView)v.findViewById(R.id.textViewHorario);
         titulo.setText(transporte.getDestino());
         
         TextView viacao = (TextView)v.findViewById(R.id.textView2);
         viacao.setText(transporte.getViacao());
		
		ImageView img =(ImageView)v.findViewById(R.id.imageViewLogo);

		
	
		
	
		
		
		return v;
	}

}
