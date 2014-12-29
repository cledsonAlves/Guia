package com.br.logica;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import android.app.ProgressDialog;
import android.os.Handler;
import android.util.Log;
import android.widget.ArrayAdapter;

import com.br.baseDados.ManipulaBanco;
import com.br.objetos.Anuncio;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class AtualizaAnuncio {
	protected static final String ur = "http://www.desagil.com.br/guiajarinu/anunciante/anuncio.json";
	ArrayList<String> lista;
	ArrayAdapter<String> adapter;
	ArrayList<Anuncio> listaAnuncios;
	
	public AtualizaAnuncio(){

		URL u;
		try {
			u = new URL(ur);
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			con.setRequestMethod("GET");
			con.setDoInput(true);
			con.setDoOutput(false);
			con.connect();
			InputStream in = con.getInputStream();
			String arq = readString(in);

			con.disconnect();
			
			
		} catch (MalformedURLException e1) {

			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//dialog.dismiss();
		}
		
	
	}
	
	private String readString(InputStream in) throws IOException{
		byte[] bytes = readBytes(in);
		String texto = new String(bytes,"ISO-8859-1");
		
		// após a leitura ,  monta a lista de objetos anuncios
	     listaAnuncios = new Gson().fromJson(texto, new TypeToken<ArrayList<Anuncio>>() {}.getType());
		return texto;
		
		
	}
		
	private byte[] readBytes(InputStream in) throws IOException{
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		byte[] buffer = new byte[1024];
		int len;
		try {
			while ((len = in.read(buffer))> 0){
				bos.write(buffer,0,len);
				
			}
			byte[] bytes = bos.toByteArray();
			return bytes;
	
		}finally {
			bos.close();
			in.close();
			
		}
		
	}
	
	//retorna a lista de anuncios
	public ArrayList<Anuncio> getAnuncios(){
	   return listaAnuncios;	
	}
	

}