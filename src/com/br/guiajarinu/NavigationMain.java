
package com.br.guiajarinu;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import br.liveo.adapter.NavigationAdapter;
import br.liveo.fragments.ViewPagerFragment;
import br.liveo.utils.Constant;
import br.liveo.utils.Menus;
import br.liveo.utils.Utils;

@SuppressLint({ "NewApi", "CommitTransaction" })
public class NavigationMain extends ActionBarActivity  {
		
    private int lastPosition = 0;
	private ListView listDrawer;    
		
	private int counterItemDownloads;
	
	private DrawerLayout layoutDrawer;		
	private LinearLayout linearDrawer;
	
	private RelativeLayout userDrawer;

	private NavigationAdapter navigationAdapter;
	private ActionBarDrawerToggleCompat drawerToggle;
	private ProgressDialog dialog;
	private String ur = "http://www.desagil.com.br/comentario.json";
	 Handler handler ;

		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		
		getSupportActionBar().setIcon(R.drawable.ic_action_play);
		getSupportActionBar().setTitle("Guia Jarinu");
		

		
		setContentView(R.layout.navigation_main);	
		
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,
				R.layout.window_title);
		
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);		
        
        listDrawer = (ListView) findViewById(R.id.listDrawer);        
		linearDrawer = (LinearLayout) findViewById(R.id.linearDrawer);		
		layoutDrawer = (DrawerLayout) findViewById(R.id.layoutDrawer);	
		
		userDrawer = (RelativeLayout) findViewById(R.id.userDrawer);
		userDrawer.setOnClickListener(userOnClick);
		
		if (listDrawer != null) {
			navigationAdapter = NavigationList.getNavigationAdapter(this);
		}
		
		listDrawer.setAdapter(navigationAdapter);
		listDrawer.setOnItemClickListener(new DrawerItemClickListener());

		drawerToggle = new ActionBarDrawerToggleCompat(this, layoutDrawer);		
		layoutDrawer.setDrawerListener(drawerToggle);
       		
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		if (savedInstanceState != null) { 			
			setLastPosition(savedInstanceState.getInt(Constant.LAST_POSITION)); 				
			
			if (lastPosition < 5){
				navigationAdapter.resetarCheck();			
				navigationAdapter.setChecked(lastPosition, true);
			}    	
			
	    }else{
	    	setLastPosition(lastPosition); 
	    	setFragmentList(lastPosition);	    	
	    }
	}
		
		
	
	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub		
		super.onSaveInstanceState(outState);		
		outState.putInt(Constant.LAST_POSITION, lastPosition);					
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {  

        if (drawerToggle.onOptionsItemSelected(item)) {
              return true;
        }		
        
		switch (item.getItemId()) {		
		case Menus.HOME:
			if (layoutDrawer.isDrawerOpen(linearDrawer)) {
				layoutDrawer.closeDrawer(linearDrawer);
			} else {
				layoutDrawer.openDrawer(linearDrawer);
			}
			return true;			
		default:
			return super.onOptionsItemSelected(item);			
		}		             
    }
		
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
    	hideMenus(menu, lastPosition);
        return super.onPrepareOptionsMenu(menu);  
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return super.onCreateOptionsMenu(menu);        		
	}
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);	     
	    drawerToggle.syncState();	
	 }	
	
	public void setTitleActionBar(CharSequence informacao) {    	
    	getSupportActionBar().setTitle(informacao);
    }	
	
	public void setSubtitleActionBar(CharSequence informacao) {    	
    	getSupportActionBar().setSubtitle(informacao);
    }	

	public void setIconActionBar(int icon) {    	
    	getSupportActionBar().setIcon(icon);
    }	
	
	public void setLastPosition(int posicao){		
		this.lastPosition = posicao;
	}	
		
	private class ActionBarDrawerToggleCompat extends ActionBarDrawerToggle {

		public ActionBarDrawerToggleCompat(Activity mActivity, DrawerLayout mDrawerLayout){
			super(
			    mActivity,
			    mDrawerLayout, 
  			    R.drawable.ic_action_navigation_drawer, 
				R.string.drawer_open,
				R.string.drawer_close);
		}
		
		@Override
		public void onDrawerClosed(View view) {			
			supportInvalidateOptionsMenu();				
		}

		@Override
		public void onDrawerOpened(View drawerView) {	
	     
			navigationAdapter.notifyDataSetChanged();			
			supportInvalidateOptionsMenu();			
		}		
	}
		  
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		drawerToggle.onConfigurationChanged(newConfig);		
	}
	
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int posicao, long id) { 
	
	    	setLastPosition(posicao);        	
	    	setFragmentList(lastPosition);	    	
	    	layoutDrawer.closeDrawer(linearDrawer);	    	
        }
    }	
    
    //  clique no usuario
	private OnClickListener userOnClick = new OnClickListener() {		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			layoutDrawer.closeDrawer(linearDrawer);
		}
	};	
	
	private void setFragmentList(int position){
		
		FragmentManager fragmentManager = getSupportFragmentManager();							
		
		switch (position) {
		case 0:			
			  fragmentManager.beginTransaction().replace(R.id.content_frame, new ViewPagerFragment()).commit();
			//atualiza a lista de noticias
			
			break;					
		case 1:			
			//fragmentManager.beginTransaction().replace(R.id.content_frame, new MyAppsFragment()).commit();
			break;			
		case 2:			
			//fragmentManager.beginTransaction().replace(R.id.content_frame, new ShopAppsFragment()).commit();						
			break;				
			
		default:
			//Toast.makeText(getApplicationContext(), "implement other fragments here", Toast.LENGTH_SHORT).show();
			break;	
		}			
	
		if (position < 5){
			navigationAdapter.resetarCheck();			
			navigationAdapter.setChecked(position, true);
		}
	}

    private void hideMenus(Menu menu, int posicao) {
    	    	
        boolean drawerOpen = layoutDrawer.isDrawerOpen(linearDrawer);    	
    	
        switch (posicao) {
		case 1:        
	        menu.findItem(Menus.ADD).setVisible(!drawerOpen);
	        menu.findItem(Menus.UPDATE).setVisible(!drawerOpen);	        	        	       
	        menu.findItem(Menus.SEARCH).setVisible(!drawerOpen);        
			break;
			
		case 2:
	        menu.findItem(Menus.ADD).setVisible(!drawerOpen);	        	        	       
	        menu.findItem(Menus.SEARCH).setVisible(!drawerOpen);        			
			break;				
			//implement other fragments here			
		}          
    }	
    

	public void setTitleFragments(int position){	
		setIconActionBar(Utils.iconNavigation[position]);
		setSubtitleActionBar(Utils.getTitleItem(NavigationMain.this, position));				
	}

	public int getCounterItemDownloads() {
		return counterItemDownloads;
	}

	public void setCounterItemDownloads(int value) {
		this.counterItemDownloads = value;
	}


	


}