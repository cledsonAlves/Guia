package com.br.guiajarinu;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import com.br.baseDados.CriaTabelas;
import com.br.baseDados.ManipulaBanco;
import com.br.logica.Logica;
import com.br.objetos.Comentario;
import com.br.service.Service1;
import com.google.code.rome.android.repackaged.com.sun.syndication.feed.synd.SyndEntry;
import com.google.code.rome.android.repackaged.com.sun.syndication.feed.synd.SyndFeed;
import com.google.code.rome.android.repackaged.com.sun.syndication.io.FeedException;
import com.google.code.rome.android.repackaged.com.sun.syndication.io.SyndFeedInput;
import com.google.code.rome.android.repackaged.com.sun.syndication.io.XmlReader;

@SuppressLint("NewApi")
public class Splash extends Activity {
	
	private ProgressDialog dialog;
	private String ur = "http://www.desagil.com.br/comentario.json";
	 Handler handler  = new Handler(); ;

	 TextView txtNet,txtNet2;
	 public static String data ;
	 int i = 0;
	 private List<SyndEntry> list;
	 private final String NOME = "autenticacao";
	 public static boolean isService = false; 
	
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		//getActionBar().hide();
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		// Cria o banco
		   new CriaTabelas(this);
		
		TextView txtNet = (TextView)findViewById(R.id.textViewNet);
		TextView txtNet2 = (TextView)findViewById(R.id.textViewNet2);
		
		
		 list = new ArrayList<SyndEntry>();
		 
	
		 Intent it = new Intent(this, Service1.class);
		 if (startService(it) != null){
			 stopService(it); 
		 }else {
			 startService(it); 
		 }
		
	

		
		// verifica se tem conexão com a net
		boolean conexao = Logica.verificaConexao(this);
		if (conexao){
			txtNet.setText("Você esta conectado a internet.");
			txtNet.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_left_in));
			txtNet2.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_left_in));
			
			txtNet2.setText("Oba, vou atualizar as noticias :)");

		   // dialog = ProgressDialog.show(this,"Noticias","Atualizando notícias, por favor aguarde...",false,true);
			Thread t=new Thread(new Runnable() {
				 
		        @Override
		        public void run() {
		        	
		        	URL u;
					try {
						u = new URL(ur);
						
						// rss
						URL url = new URL("http://www.desagil.com.br/guiajarinu/feed.xml");
						SyndFeedInput input = new SyndFeedInput();
						SyndFeed feed = input.build(new XmlReader(url));
						
						
						
						List entradas = feed.getEntries();
						
						Iterator it = entradas.iterator();
						
						while(it.hasNext()){
							SyndEntry aux = (SyndEntry) it.next();
							list.add(aux);
						}
						
						
						/**HttpURLConnection con = (HttpURLConnection)u.openConnection();
						con.setDoOutput(false);
						con.setDoInput(true);
						con.setRequestMethod("GET");
						con.connect();
						InputStream in = con.getInputStream();
						String arq = readString(in);**/
						
						// atualiza os rss
						updateNoticias();
						
						
						   handler.postDelayed(new Runnable() {
				            	
				                @Override
				                public void run() { 
				                	
			
				                	
				                //    dialog.dismiss();//
				            Toast.makeText(getApplicationContext(), "Noticias Atualizadas !", Toast.LENGTH_LONG).show();
				                    
				                
				            		try{
				            			Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
				            			Ringtone toque = RingtoneManager.getRingtone(getApplicationContext(), som);
				            			toque.play();
				            			
				            		
				            			
				            		}
				            		catch(Exception e){}
				            	
				                }
				            },1000);
						   //encerra a conexão
						//   con.disconnect();
						
					} catch (MalformedURLException e) {
					
						e.printStackTrace();
					} catch (IOException e) {
			
						e.printStackTrace();
					} catch (IllegalArgumentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (FeedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

		        }
		    });
		    t.start();

			
		}else {
			txtNet.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_left_in));
			txtNet2.setAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_left_in));
			
			txtNet.setText("Você esta sem internet.");
			txtNet2.setText("Vamos iniciar no modo off-line.");
		}
		

		
	

		Thread t = new Thread() {
			
			
			@Override
			public void run() {
				
				handler.post(new Runnable(){
					@Override
					public void run(){
					
						
					}
				});
				

				try {
					
					sleep(10000);
				
					

				} catch (InterruptedException e) {

				} finally {
				
					startActivity(new Intent(Splash.this,NavigationMain.class));
				}
				
			}
			

		};
		
	
		t.start();
	}
	private String readString(InputStream in) throws IOException{
		//byte[] bytes = readBytes(in);
		String texto = "";
		
		//String texto = new String(bytes,"ISO-8859-1");
	
		// após a leitura ,  monta a lista de objetos clientes 
			//		ArrayList<Comentario> lista = new Gson().fromJson(texto, new TypeToken<ArrayList<Comentario>>() {}.getType());

			
					handler.post(new Runnable(){
						@Override
						public void run(){
							//mensagem no final  ...
							
							
						}
					});
					
				
	
		//  exclui e cadastra as novas noticias ...
		ManipulaBanco mb = new ManipulaBanco(this);
		if (mb.deletaAnuncios()){
			for (int i = 0; i < list.size(); i++) {
				
				Comentario c = new Comentario();
				c.setNome(list.get(i).getTitle());
				c.setComentario(list.get(i).getDescription().getValue());
				c.setData(list.get(i).getPublishedDate().toGMTString());
				c.setIcon("");
				c.setVisitas(""+i);
	         mb.cadastraNoticia(c, i);
			}
		}
	
	
		
		
       
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
	
	@SuppressWarnings("deprecation")
	public void updateNoticias(){

		//  exclui e cadastra as novas noticias ...
		ManipulaBanco mb = new ManipulaBanco(this);
		if (mb.deletaNoticias()){
			for (int i = 0; i < list.size(); i++) {
				
				Comentario c = new Comentario();
				c.setNome(list.get(i).getTitle());
				c.setComentario(list.get(i).getDescription().getValue());
				c.setData(list.get(i).getPublishedDate().toLocaleString());
				c.setIcon(list.get(i).getLink());
				c.setVisitas(list.get(i).getLink());
	         mb.cadastraNoticia(c, i);
			}
		}
		
	 
		

	}
	
	
	
	// get anuncios
	public void getAnuncios(){
		
	}
	

	


	@Override
	// quando entrar em pause finaliza ..
	protected void onPause() {
		super.onPause();
		finish();
	}
	
	
	
}