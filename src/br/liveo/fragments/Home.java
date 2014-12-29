package br.liveo.fragments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.LruCache;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.ViewFlipper;
import br.liveo.utils.Menus;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.br.adapter.AdapterListView;
import com.br.baseDados.ManipulaBanco;
import com.br.guiajarinu.R;
import com.br.logica.CustomJsonObjectRequest;
import com.br.objetos.Comentario;
import com.br.objetos.Help;
import com.br.objetos.Post;


@SuppressLint("ResourceAsColor")
public class Home extends Fragment implements OnItemClickListener{
	
	  private ViewFlipper mViewFlipper;
	  
		private Animation slideLeftIn;
		private Animation slideLeftOut;
		private Animation slideRightIn;
		private Animation slideRightOut;
		private ArrayList<Post> list;
		private RequestQueue rq;
		private ImageLoader imageLoader;
		private String url;
		private Map<String, String> params;

	    private ToggleButton mSlider;
	    static AdapterListView adapter;




	public static ListView lista;
	    
    public static Home newInstance() {
           
        Home fragment = new Home();
      
        return fragment;
    }	
	
    
    //  Componentes da view ...
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			
		final View rootView = inflater.inflate(R.layout.home, container, false);
		url = "http://www.perfumariachiccheirosa.com.br/voley.php";
		
		
          
	      rq = Volley.newRequestQueue(getActivity().getApplicationContext());
          
	      list = new ArrayList<Post>();
			
			params = new HashMap<String, String>();
			params.put("email","teste@teste.com");
			params.put("pasword", "1234");
			params.put("method", "web-data-jor");
			 mViewFlipper = (ViewFlipper) rootView.findViewById(R.id.viewFlipper);
			 NetworkImageView image = (NetworkImageView)rootView.findViewById(R.id.nivImg);
			  image.setDefaultImageResId(R.drawable.anuncio);
			  image.setErrorImageResId(R.drawable.anuncio);
		
			 
          
      CustomJsonObjectRequest request = new CustomJsonObjectRequest(Method.POST,
      			url,
      			params,
      			new Response.Listener<JSONObject>(){
      				@Override
      				public void onResponse(JSONObject response) {
      					Log.i("Script", "SUCCESS: "+response);
      				
      					
      					
      					try{
      						JSONArray ja = response.getJSONArray("posts");
      						
      						for(int i = 0, tam = ja.length(); i < tam; i++){
      							Post p = new Post();
      							p.setUrlImage(ja.getJSONObject(i).getString("image"));
      							p.setTitle(ja.getJSONObject(i).getString("title"));
      							list.add(p);
      						}
      						
      						
      						
      						imageLoader = new ImageLoader(rq, new ImageLoader.ImageCache() {
      							private final LruCache<String, Bitmap> cache = new LruCache<String, Bitmap>(10);
      							
      							@Override
      							public void putBitmap(String url, Bitmap bitmap) {
      								cache.put(url, bitmap);
      							}
      							
      							@Override
      							public Bitmap getBitmap(String url) {
      								return cache.get(url);
      							}
      						});
      						
      						
      						
      					   // carrega as imagens no flipper
      						 for(int i=0;i<list.size();i++)
      						        {
      						        //  This will create dynamic image view and add them to ViewFlipper
      							 NetworkImageView image = new NetworkImageView(rootView.getContext());
      							   image.setImageUrl(list.get(i).getUrlImage(), imageLoader);
      							  mViewFlipper.addView(image);
      						           // setFlipperImage(gallery_grid_Images[i]);
      						        }
      						
      						
      						
      					}
      					catch(JSONException e){
      						e.printStackTrace();
      					}
      		
      				}
      			},
      			new Response.ErrorListener() {
      				@Override
      				public void onErrorResponse(VolleyError error) {
      					//Toast.makeText(MainActivity.this, "Error: "+error.getMessage(), Toast.LENGTH_LONG).show();
      					 ImageView image1 = new  ImageView(rootView.getContext());
						   image1.setImageResource(R.drawable.vagao);
						   
						   ImageView image2 = new  ImageView(rootView.getContext());
						   image2.setImageResource(R.drawable.almeida);
						    
						   ImageView image3 = new  ImageView(rootView.getContext());
						   image3.setImageResource(R.drawable.prostreet);
						   
						   ImageView image4 = new  ImageView(rootView.getContext());
						   image4.setImageResource(R.drawable.rossi);
						   
						   ImageView image5 = new  ImageView(rootView.getContext());
						   image5.setImageResource(R.drawable.mvmoveis);
						   
						   
						   
						  mViewFlipper.addView(image1);mViewFlipper.addView(image2);mViewFlipper.addView(image3);
						  mViewFlipper.addView(image4);mViewFlipper.addView(image5);
      					
      					Log.i("Erro", "Error: "+error.getMessage());	
      				}
      		});
      

      		
   		request.setTag("tag");
      		rq.add(request);
      		
		
		 mSlider = (ToggleButton) rootView.findViewById(R.id.tbSlider);
		 
		 slideLeftIn = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.slide_left_in);
			slideLeftOut = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.slide_left_out);
			slideRightIn = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.slide_right_in);
			slideRightOut = AnimationUtils.loadAnimation(rootView.getContext(), R.anim.slide_right_out);

		     // configura o intervalo da animação para 2 segundos

		     mViewFlipper.setFlipInterval(5000);
		     mViewFlipper.setInAnimation(slideLeftIn);
		     mViewFlipper.setOutAnimation(slideLeftOut);
		     mViewFlipper.showNext();
		     
		     mViewFlipper.startFlipping();
		     
		     
		 
		   
		     lista = (ListView)rootView.findViewById(R.id.listViewItens);
		     
		     ArrayList<Comentario> listas = new ArrayList<Comentario>();
		     
		     ManipulaBanco mb = new ManipulaBanco(rootView.getContext());
		     listas = mb.getComentario(null);

		        
		      adapter = new AdapterListView(rootView.getContext(), listas);
		        
		

				 lista.setAdapter(adapter);
				 Help.getListViewSize(lista);
				
		rootView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.MATCH_PARENT ));

		
	 
		
		
		return rootView;
	}
	

	
	// Menus abaixo
			
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		setHasOptionsMenu(true);
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);		
		inflater.inflate(R.menu.menu, menu);
					    	   	    
		menu.findItem(Menus.ADD).setVisible(false);
		menu.findItem(Menus.UPDATE).setVisible(true);		
		menu.findItem(Menus.SEARCH).setVisible(false);	
		
		SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu.findItem(Menus.SEARCH));
	    searchView.setQueryHint(this.getString(R.string.search));
	    
	    ((EditText)searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text))
        .setHintTextColor(getResources().getColor(R.color.white));		
	}	



		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			 
		        lista.setBackgroundColor(R.color.blue_light);
		        
		        
			
		}
		
		
		
		


	
		 

}


