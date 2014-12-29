package com.br.baseDados;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;

import com.br.objetos.Anuncio;
import com.br.objetos.Comentario;

public class ManipulaBanco {
	
	Banco bd;
	public Context ctx;
	private Cursor cursor;

	// Construtor pedindo um contexto..
	public ManipulaBanco(Context ctx) {
		this.ctx = ctx;
		bd = new Banco(ctx);

	}
	
	// get Comentarios
	public ArrayList<Comentario> getComentario(String where) {
		ArrayList<Comentario> lista = new ArrayList<Comentario>();
		cursor = bd.buscaDados("COMENTARIO", null, where);
		if (cursor.getCount() > 0) {
			while (cursor.moveToNext()) {
				Comentario comentario = new Comentario();
				comentario.setNome(cursor.getString(1));	
				comentario.setIcon(cursor.getString(2));
				
				comentario.setData(cursor.getString(3));				
				comentario.setComentario(cursor.getString(4));
				// adiciona o comentario na lista ..
				lista.add(comentario);
			}
		}	
		//  fechando conexões
	
		return lista;

	}
	
	//  cadastra anuncio 
		public boolean cadastraAnuncio(Anuncio anuncio) {
			//verifica se o anuncio existe
			cursor = bd.buscaDados("Anuncio", null, "ID = '" + anuncio.getId() + "'");
			if (cursor.moveToNext()){
				
				Log.i("BD", "Anuncio existe!! ");
				if (deletaAnuncio(anuncio)){
					Log.i("BD", "Anuncio deletado, cadastrando novo!! ");
					return(cadastra(anuncio));
					
				}else{
					Log.i("BD", "Anuncio existe, não deletou!! ");
					return false;
				}
			}else {
				Log.i("BD", "Anuncio não existe!!, cadastrando ");
				return(cadastra(anuncio));
			}

		}
		
	
	// get Anuncios
	public ArrayList<Anuncio> getAnuncio(String where) {
		ArrayList<Anuncio> lista = new ArrayList<Anuncio>();
		cursor = bd.buscaDados("ANUNCIO", null, where);
		if (cursor.getCount() > 0) {
			while (cursor.moveToNext()) {
				Anuncio anuncio = new Anuncio();
				anuncio.setId(cursor.getInt(0));
				anuncio.setRamo(cursor.getString(1));
				anuncio.setMarca(cursor.getString(2));
				anuncio.setTel1(cursor.getString(3));
				anuncio.setTel2(cursor.getString(4));
				anuncio.setTel3(cursor.getString(5));
				anuncio.setEndereco(cursor.getString(6));
				anuncio.setEmail(cursor.getString(7));
				anuncio.setFacebook(cursor.getString(8));
				anuncio.setAtivo(cursor.getInt(9));
			    anuncio.setMapa(cursor.getString(10));
			    anuncio.setSite(cursor.getString(11));
			    anuncio.setFoto(cursor.getString(12));
				anuncio.setDescricao(cursor.getString(13));
			  
				// adiciona o comentario na lista ..
				lista.add(anuncio);
			}
		}	
		//  fechando conexões
		

		return lista;

	}
	
	public boolean deletaNoticias(){
		return bd.excluiRegistro("COMENTARIO", null, ctx);
		
	}
	
	public boolean deletaAnuncios(){
		return bd.excluiRegistro("ANUNCIO", null, ctx);
		
	}
	public boolean deletaAnuncio(Anuncio anuncio){
		return bd.excluiRegistro("ANUNCIO","id = '"+anuncio.getId()+"'", ctx);
		
	}
	
	// cadastra o anuncio
	public boolean cadastra(Anuncio anuncio){
		ContentValues valores = new ContentValues();
		valores.put("ID", anuncio.getId());
		valores.put("RAMO", anuncio.getRamo());
		valores.put("NOME", anuncio.getMarca());
		valores.put("TEL1", anuncio.getTel1());
		valores.put("TEL2", anuncio.getTel2());
		valores.put("TEL3", anuncio.getTel3());
		valores.put("ENDERECO", anuncio.getEndereco());
		valores.put("EMAIL", anuncio.getEmail());
		valores.put("FACE", anuncio.getFacebook());
		valores.put("ATIVO", anuncio.getAtivo());
		valores.put("MAPA", anuncio.getMapa());
		valores.put("SITE", anuncio.getSite());
		valores.put("LOGO", anuncio.getFoto());
		valores.put("DESCRICAO", anuncio.getDescricao());

		// manda para classe banco fazer o cadastro ..
		boolean cadastro =  bd.cadastra("Anuncio", valores, ctx);
		
		return cadastro;
		
	}
	
	public boolean cadastraNoticia(Comentario comentario, int id){
		
		
		ContentValues valores = new ContentValues();
		valores.put("id", id);
		valores.put("NOME", comentario.getNome());
		valores.put("FOTO", comentario.getIcon());
		valores.put("DATA", comentario.getData());
		valores.put("COMENTARIO", comentario.getComentario());
		
		// manda para classe banco fazer o cadastro ..
		return bd.cadastra("COMENTARIO", valores, ctx);
	}
	

	// fecha o banco
	public void fechaBanco() {
			if ( cursor != null){
				cursor.close();
			
			}
		}

}
