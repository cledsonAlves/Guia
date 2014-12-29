package com.br.adapter;



import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.guiajarinu.R;
import com.br.objetos.Comentario;

@SuppressLint({ "ViewHolder", "ResourceAsColor" })
public class AdapterListView extends BaseAdapter {
	private Context ctx;
	private List<Comentario>lista;
	
	
	public AdapterListView(Context ctx, List<Comentario> lista){
		
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
		
		Comentario comentario = lista.get(position);
		
		// Recupera o Item
		LayoutInflater inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.comentario, null);
		 TextView txtNome = (TextView) v.findViewById(R.id.textViewNome);
		 txtNome.setText(comentario.getNome());
		 txtNome.setAnimation(AnimationUtils.loadAnimation(v.getContext(), R.anim.slide_left_in));
		
		TextView txtComentario = (TextView) v.findViewById(R.id.textViewEndereco);
		txtComentario.setText(Html.fromHtml(comentario.getComentario()));
		txtComentario.setAnimation(AnimationUtils.loadAnimation(v.getContext(), R.anim.slide_left_in));
	   

		
		TextView txtData = (TextView) v.findViewById(R.id.textViewData);
		txtData.setText(comentario.getData());
		txtData.setAnimation(AnimationUtils.loadAnimation(v.getContext(), R.anim.slide_left_in));
		
		TextView txtVisitas = (TextView) v.findViewById(R.id.textViewVisitas);
		txtVisitas.setText(comentario.getIcon());
	
		
		
		
		
		ImageView img =(ImageView)v.findViewById(R.id.imageViewUser);
		
		if (comentario.getIcon().equals("vaga")){
			img.setImageResource(R.drawable.vaga);	
		}
		if (comentario.getIcon().equals("cledson")){
			img.setImageResource(R.drawable.ic_user);	
		}
		if (comentario.getIcon().equals("anunciante")){
			img.setImageResource(R.drawable.logo);	
		}
		img.setAnimation(AnimationUtils.loadAnimation(v.getContext(), R.anim.slide_left_in));
		
		
		
		return v;
	}
}
