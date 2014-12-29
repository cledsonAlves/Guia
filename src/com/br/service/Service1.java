package com.br.service;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.br.baseDados.ManipulaBanco;
import com.br.logica.AtualizaAnuncio;
import com.br.logica.Logica;
import com.br.objetos.Anuncio;

public class Service1 extends Service {
	final long oneMinute = 60 * 1000;
	private Timer timer = new Timer();

	public void onCreate() {

	super.onCreate();

	startservice();

	}

	private void startservice() {

		timer.scheduleAtFixedRate( new TimerTask() {

		public void run() {
			
			// verifica se tem conexão com a net
			boolean conexao = Logica.verificaConexao(getApplicationContext());
			if (conexao){
				AtualizaAnuncio a = new AtualizaAnuncio();
				ArrayList<Anuncio> lista = a.getAnuncios();
				ManipulaBanco mb = new ManipulaBanco(getApplicationContext());
                if (lista != null && lista.size() > 0){
                	for (int i = 0; i < lista.size(); i++) {
                		boolean cad = mb.cadastraAnuncio(lista.get(i));
                		if (cad){
                			Log.i("Serviço", "cadastro efetuado!! ");	
                		}else{
                			Log.i("Serviço", "cadastro não efetuado!! ");
                		}
                		
						
					}
                		
                }
	
			}


		}

		}, 0, oneMinute * 60);

		; }

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

}