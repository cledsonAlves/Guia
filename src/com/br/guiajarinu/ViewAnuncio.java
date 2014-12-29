package com.br.guiajarinu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.br.guiajarinu.R;

import com.br.objetos.Anuncio;

public class ViewAnuncio extends Activity {

	public static Anuncio anuncio;
	TextView txtMarca, txtFone1, txtFone2, txtFone3, txtDescricao, txtEndereco,
			txtFace, txtEmail, txtSite;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.anuncio);
		TextView text = (TextView) findViewById(R.id.textViewMarca);
		text.setText(anuncio.getMarca());

		txtFone1 = (TextView) findViewById(R.id.textViewFone1);
		txtFone2 = (TextView) findViewById(R.id.textViewFone2);
		txtFone3 = (TextView) findViewById(R.id.textViewFone3);
		txtDescricao = (TextView) findViewById(R.id.textViewDescricao);
		txtEndereco = (TextView) findViewById(R.id.textViewEnder);
		txtFace = (TextView) findViewById(R.id.textViewFace);
		txtEmail = (TextView) findViewById(R.id.textViewEmail);
		txtSite = (TextView) findViewById(R.id.textViewSite);
		
		if (!anuncio.getTel1().equals("")){
			txtFone1.setText(anuncio.getTel1());	
		}
		
		if (!anuncio.getTel2().equals("")){
			txtFone2.setText(anuncio.getTel2());	
		}
		if (!anuncio.getTel3().equals("")){
			txtFone3.setText(anuncio.getTel3());	
		}
		
		
		if (!anuncio.getFacebook().equals("")){
			txtFace.setText(Html.fromHtml(anuncio.getFacebook().replace("http://", "www.")));	
		}
		if (!anuncio.getEmail().equals("")){
			txtEmail.setText(Html.fromHtml(anuncio.getEmail()));	
		}
		if (!anuncio.getEndereco().equals("")){
			txtEndereco.setText(anuncio.getEndereco());	
		}
		if (!anuncio.getSite().equals("")){
			txtSite.setText(Html.fromHtml(anuncio.getSite().replace("http://", "www.")));	
		}
		if (!anuncio.getDescricao().equals("")){
			txtDescricao.setText(Html.fromHtml(anuncio.getDescricao()));	
		}
		

	}

	public void tel1(View v) {
		if (!anuncio.getTel1().equals("")) {
			Uri uri = Uri.parse("tel:" + anuncio.getTel1().replace("(11)", ""));
			Intent it = new Intent(Intent.ACTION_CALL, uri);
			startActivity(it);
		}

	}

	public void tel2(View v) {
		if (!anuncio.getTel2().equals("")) {
			Uri uri = Uri.parse("tel:" + anuncio.getTel2().replace("(11)", ""));
			Intent it = new Intent(Intent.ACTION_CALL, uri);
			startActivity(it);
		}

	}

	public void tel3(View v) {
		if (!anuncio.getTel3().equals("")) {
			Uri uri = Uri.parse("tel:" + anuncio.getTel3().replace("(11)", ""));
			Intent it = new Intent(Intent.ACTION_CALL, uri);
			startActivity(it);
		}

	}
	
	// abre o mapa
		public void mapa(View v) {
			Uri uriUrl = Uri.parse("http://goo.gl/eFvBc0");
			Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
			startActivity(launchBrowser);

		}



}
