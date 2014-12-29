package com.br.logica;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;



public class Logica {
  private Context ctx;
  private Handler handler = new Handler();
  private ProgressDialog dialog;
	
	
	public Logica(Context ctx){
	 this.ctx = ctx;
	 dialog = ProgressDialog.show(ctx,"Dados","Carregand dados, por favor aguarde...",false,true);
	
	}
	
	
	// pega a data atual do mobile
	
		public static String DataHoraAtual() {
			SimpleDateFormat simpleFormat = new SimpleDateFormat(
					"dd/MM/yyyy HH:mm:ss");
			String data = new String(simpleFormat.format(new Date(System
					.currentTimeMillis())));
			return data;

		}
	
	
		
	
	
	
	
	
	
	public void getNoticias(Context ctx){
		
	}
	
	
	/* Função para verificar existência de conexão com a internet 
	 */  
	public static boolean verificaConexao(Context ctx) {  
	    boolean conectado;  
	    ConnectivityManager conectivtyManager = (ConnectivityManager) ctx.getSystemService(Context.CONNECTIVITY_SERVICE);  
	    if (conectivtyManager.getActiveNetworkInfo() != null  
	            && conectivtyManager.getActiveNetworkInfo().isAvailable()  
	            && conectivtyManager.getActiveNetworkInfo().isConnected()) {  
	        conectado = true;  
	        
	    } else {  
	        conectado = false;  
	    }  
	    return conectado;  
	}  

}
