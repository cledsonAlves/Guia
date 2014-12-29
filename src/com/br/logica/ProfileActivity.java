package com.br.logica;




import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.util.LruCache;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ViewFlipper;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.br.guiajarinu.R;
import com.br.objetos.Post;


public class ProfileActivity extends Activity {
	private ListView lvPosts;
	private ArrayList<Post> list;
	private RequestQueue rq;
	private ImageLoader imageLoader;
	 ViewFlipper viewFlipper ;
	 NetworkImageView  img;
		private Animation slideLeftIn;
		private Animation slideLeftOut;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		
		list = getIntent().getParcelableArrayListExtra("posts");
		
		//img = (NetworkImageView)findViewById(R.id.img);
		
		
		rq = Volley.newRequestQueue(ProfileActivity.this);
		
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
		
		 slideLeftIn = AnimationUtils.loadAnimation(this, R.anim.slide_left_in);
		 slideLeftOut = AnimationUtils.loadAnimation(this, R.anim.slide_left_out);


		
		viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper);
		
		viewFlipper.setFlipInterval(5000);
		viewFlipper.setInAnimation(slideLeftIn);
		viewFlipper.setOutAnimation(slideLeftOut);
		viewFlipper.showNext();
	     
		viewFlipper.startFlipping();
		
		 for(int i=0;i<list.size();i++)
		        {
		        //  This will create dynamic image view and add them to ViewFlipper
			 NetworkImageView image = new NetworkImageView(getApplicationContext());
			    image.setImageUrl(list.get(i).getUrlImage(), imageLoader);
			    viewFlipper.addView(image);
		           // setFlipperImage(gallery_grid_Images[i]);
		        }
		
		//lvPosts = (ListView) findViewById(R.id.lvPosts);
		//lvPosts.setAdapter(new PostAdapter(ProfileActivity.this, list, imageLoader));
	}
	
	private void setFlipperImage(int res) {

	    ImageView image = new ImageView(getApplicationContext());
	    image.setBackgroundResource(res);
	    //viewFlipper.addView(image);
	}
}
