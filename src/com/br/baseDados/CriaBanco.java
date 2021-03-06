package com.br.baseDados;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CriaBanco extends SQLiteOpenHelper {
	private String[] criaTabelas;
	private String[] deletaTabelas;
	
	// private Logica logica = new Logica();

	/*
	 * Construtor da classe que recebe o contexto, o nome do banco, o script com
	 * as tabelase a vers�o. a classe verifica automaticamente qual m�todo
	 * chamar dependendo da vers�o do banco informada. (Cria ou atualiza)
	 */
	public CriaBanco(Context ctx, String NomeBanco, int versaoBanco,
			String[] criaTabelas, String[] deletaTabelas) {
		super(ctx, NomeBanco, null, versaoBanco);
		this.criaTabelas = criaTabelas;
		this.deletaTabelas = deletaTabelas;
	}

	// cria o banco de dados
	@Override
	public void onCreate(SQLiteDatabase db) {
		// Cria as tabelas do banco
		for (int i = 0; i < criaTabelas.length; i++) {
			String sql = criaTabelas[i];
			db.execSQL(sql);
		}
		// Insere os comentarios
	
		String[] comentario = new ExecutaScript().insertComentario();
		for(int i =0; i < comentario.length; i++){
			String sql = comentario[i];
			db.execSQL(sql);
		}
		
		String[] anuncio = new ExecutaScript().insertAnuncio();
		for(int i =0; i < anuncio.length; i++){
			String sql = anuncio[i];
			db.execSQL(sql);
		}
	}

	// se mudou a vers�o , atualiza para nova
	@Override
	public void onUpgrade(SQLiteDatabase db, int versaoAntiga, int novaVersao) {
		// deleta as tabelas ..
		for (int i = 0; i < deletaTabelas.length; i++) {
			String sql = deletaTabelas[i];
			db.execSQL(sql);
		}
		// cria o banco novamente ...
		onCreate(db);
		// fecha o banco
		db.close();
	}

}