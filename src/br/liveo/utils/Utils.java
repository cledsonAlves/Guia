package br.liveo.utils;

import android.content.Context;
import com.br.guiajarinu.R;

public class Utils {

	//Set all the navigation icons and always to set "zero 0" for the item is a category
	public static int[] iconNavigation = new int[] { 
		0, 0, 0, 0, 0,0,0,0,0, R.drawable.ic_action_settings, R.drawable.ic_action_about};	
	
	//get title of the item navigation
	public static String getTitleItem(Context context, int posicao){		
		String[] titulos = context.getResources().getStringArray(R.array.nav_menu_items);  
		return titulos[posicao];
	} 
	
	public static int[] colors = new int[] { 
		R.color.orange_dark, R.color.orange_dark, R.color.orange_dark, R.color.orange_dark,
		R.color.green_dark, R.color.orange_dark, R.color.orange_dark, R.color.orange_dark,
		R.color.orange_dark, R.color.orange_dark,R.color.orange_dark,R.color.orange_dark};	
}
