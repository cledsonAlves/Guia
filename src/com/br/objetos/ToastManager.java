package com.br.objetos;



import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.br.guiajarinu.R;



public class ToastManager {
 
  public static final int INFORMATION = 0;
  public static final int WARNING     = 1;
  public static final int ERROR       = 2;
 
  public static void show(Context context, String text, 
    int toastType) {

      LayoutInflater inflater = 
        (LayoutInflater) context.getSystemService(
         Context.LAYOUT_INFLATER_SERVICE);

      View layout = inflater.inflate(R.layout.toast_layou, null);
  
      TextView tv = (TextView) layout.findViewById(R.id.tvTexto);
      tv.setText(text);
  
      LinearLayout llRoot = 
          (LinearLayout) layout.findViewById(R.id.llRoot);
  
      Drawable img;
      int bg;
  
      switch (toastType) {
      case WARNING:
    	  
    	  img = context.getResources().getDrawable(R.drawable.ic_launcher);
    	  bg  = R.drawable.spinner_background_ab_estilo;

        break;
      case ERROR:

 break;
      default:      
        img = context.getResources().getDrawable(R.drawable.ic_launcher);
 bg  = R.drawable.toast_background_blue;
 break;
      }
    
  
      Toast toast = new Toast(context);
      toast.setGravity(Gravity.CENTER, 0, 0);
      toast.setDuration(Toast.LENGTH_LONG);
      toast.setView(layout);  
      toast.show();  
   }
}
