package br.liveo.sliding;

import android.support.v4.app.Fragment;
import br.liveo.fragments.Academias;
import br.liveo.fragments.Bares;
import br.liveo.fragments.Beleza;
import br.liveo.fragments.Comentarios;
import br.liveo.fragments.Construcao;
import br.liveo.fragments.Disk;
import br.liveo.fragments.Escolas;
import br.liveo.fragments.Faculdades;
import br.liveo.fragments.Farmacias;
import br.liveo.fragments.Home;
import br.liveo.fragments.Imobiliarias;
import br.liveo.fragments.Lojas;
import br.liveo.fragments.Noticias;
import br.liveo.fragments.Pizzarias;
import br.liveo.fragments.Restaurantes;
import br.liveo.fragments.Seguros;
import br.liveo.fragments.Servicos;
import br.liveo.fragments.Supermercado;
import br.liveo.fragments.TelefonesUteis;
import br.liveo.fragments.Transporte;

public class SamplePagerItem {
	
	private final CharSequence mTitle;
    private final int mIndicatorColor;
    private final int mDividerColor;
    private final int position;
        
    private Fragment[] listFragments;
    public SamplePagerItem(int position, CharSequence title, int indicatorColor, int dividerColor) {
        this.mTitle = title;
        this.position = position;
        this.mIndicatorColor = indicatorColor;
        this.mDividerColor = dividerColor;
        
        listFragments = new Fragment[] {Home.newInstance(), Noticias.newInstance(),Transporte.newInstance(), Pizzarias.newInstance(),Lojas.newInstance(),Farmacias.newInstance(),Construcao.newInstance(),Bares.newInstance(),Restaurantes.newInstance(),Supermercado.newInstance(),Imobiliarias.newInstance(),Disk.newInstance(),Academias.newInstance(),Seguros.newInstance(),Servicos.newInstance(),Escolas.newInstance(),Faculdades.newInstance(),TelefonesUteis.newInstance(),Beleza.newInstance(),Comentarios.newInstance()};        
    }

    public Fragment createFragment() {
		return listFragments[position];
    }

    public CharSequence getTitle() {
        return mTitle;
    }

    public int getIndicatorColor() {
        return mIndicatorColor;
    }

    public int getDividerColor() {
        return mDividerColor;
    }
}
