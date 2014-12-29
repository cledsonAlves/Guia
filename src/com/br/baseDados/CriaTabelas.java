package com.br.baseDados;

import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.util.Log;

public class CriaTabelas {
	
	// Nome do Banco de Dados
	public static final String NOME_BANCO = "GuiaJarinu";
	
	// Controle da versão do banco de dados
	private static final int VERSAO_BD = 2;
	
	// classe utilitaria para abrir, criar e ultilizar o banco de dados..
	private CriaBanco bd;
	// Script para fazer drop na tabela
	private static String[] DELETA_TABELA = new String[] {
			"DROP TABLE IF EXISTS COMENTARIO", 
			"DROP TABLE IF EXISTS ANUNCIO",
			"DROP TABLE IF EXISTS FV_CLIENTE",
			"DROP TABLE IF EXISTS FV_FORNECEDOR",
			"DROP TABLE IF EXISTS FV_PRODUTO",
			"DROP TABLE IF EXISTS FV_PEDIDO",
			"DROP TABLE IF EXISTS FV_FORNECEDORxPRODUTO" ,
			"DROP TABLE IF EXISTS FV_ITEM",
			"DROP TABLE IF EXISTS FV_PEDIDOxPRODUTO",
			"DROP TABLE IF EXISTS FV_REPRESENTANTE",
			"DROP TABLE IF EXISTS FV_Planos",
			"DROP TABLE IF EXISTS FV_CONFIGURA"};
	
	// Script para criar as tabelas
	private static final String[] CRIA_TABELA = new String[] {
		//Tabela Comentarios
		"CREATE TABLE [COMENTARIO] (" +
			"[ID] INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
			"[NOME] TEXT, " +
			"[FOTO] TEXT, " +
			"[DATA] TEXT, " +
			"[COMENTARIO] TEXT );",
			
			//Tabela Onibus
			"CREATE TABLE [TRANSPORTE] (" +
				"[ID] INTEGER  " +
				"[VIACAO] TEXT, " +
				"[DESTINO] TEXT );",
				
				//Tabela Saida Onibus
				"CREATE TABLE [HORARIO] (" +
					"[ID] INTEGER  " +
					"[HORARIO] TEXT );",
			
			
			//Tabela ANUNCIO
			"CREATE TABLE [ANUNCIO] (" +
				"[ID] INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, " +
				"[RAMO] TEXT, " +
				"[NOME] TEXT, " +
				"[TEL1] TEXT, " +
				"[TEL2] TEXT, " +
				"[TEL3] TEXT, " +
				"[ENDERECO] TEXT, " +
				"[EMAIL] TEXT, " +
				"[FACE] TEXT, " +
				"[ATIVO] INT, " +
				"[MAPA] TEXT,"+
				"[SITE] TEXT,"+
				"[LOGO] TEXT,"+
				"[DESCRICAO] TEXT );",
		
	
				  };
	
	

	// Construtor da Classe.
	public CriaTabelas(Context ctx) {
		// passa os parametros para a construtor da classe criaBanco
		  try {
				bd = new CriaBanco(ctx, CriaTabelas.NOME_BANCO, CriaTabelas.VERSAO_BD,
						CriaTabelas.CRIA_TABELA, CriaTabelas.DELETA_TABELA);
				
				Log.i("Banco", "Tabelas Criadas");
				// abre o banco no modo escrita para alterar também
				bd.getWritableDatabase();
				
		    }catch(SQLiteConstraintException  e){
		    	//Toast.makeText(null, "Erro, não foi possivel criar o banco, informe o erro ao T.I de sua empresa : " + e,Toast.LENGTH_SHORT).show();
		    } finally{
		        bd.close();
		    }
	
		
  
	}

}