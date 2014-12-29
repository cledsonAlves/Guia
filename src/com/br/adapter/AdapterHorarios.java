package com.br.adapter;

import java.util.ArrayList;
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
public class AdapterHorarios extends BaseAdapter {
	private Context ctx;
	private ArrayList<String>lista;
	
	
	public AdapterHorarios(Context ctx, ArrayList<String> lista){
		
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
		
		
		
		// Recupera o Item
		LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.item_horario, null);
		
		ImageView img =(ImageView)v.findViewById(R.id.imageViewLogo);
		
        TextView titulo = (TextView)v.findViewById(R.id.textView1);
        TextView titulo2 = (TextView)v.findViewById(R.id.textView2);
        TextView titulo3 = (TextView)v.findViewById(R.id.textView3);
         
         
         if (lista.get(position).contains("tag")){
        	 titulo.setVisibility(View.GONE);
        	 titulo3.setVisibility(View.GONE);
        	 titulo2.setVisibility(View.VISIBLE);
        	 titulo2.setText(lista.get(position).replace("tag", ""));
        	 img.setVisibility(View.GONE);
        	 
         }else {
        	 titulo.setVisibility(View.VISIBLE);
        	 titulo3.setVisibility(View.VISIBLE);
        	 titulo2.setVisibility(View.GONE);
        	 titulo.setText(lista.get(position)); 
         }
		
		

		
	
		
	
		
		
		return v;
	}

}
