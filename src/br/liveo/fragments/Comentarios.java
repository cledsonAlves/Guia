package br.liveo.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ListView;
import br.liveo.utils.Menus;

import com.br.guiajarinu.R;

public class Comentarios extends Fragment {

	private ListView lista;

	public static Comentarios newInstance() {
		Bundle bundle = new Bundle();

		Comentarios fragment = new Comentarios();
		fragment.setArguments(bundle);

		return fragment;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.formulario, container, false);

		lista = (ListView) rootView.findViewById(R.id.listViewHorarios);

		lista.setAdapter(Home.adapter);

		rootView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT));
		return rootView;
	}

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
		menu.findItem(Menus.UPDATE).setVisible(false);
		menu.findItem(Menus.SEARCH).setVisible(true);

		SearchView searchView = (SearchView) MenuItemCompat.getActionView(menu
				.findItem(Menus.SEARCH));
		searchView.setQueryHint(this.getString(R.string.search));

		((EditText) searchView
				.findViewById(android.support.v7.appcompat.R.id.search_src_text))
				.setHintTextColor(getResources().getColor(R.color.white));

	}
}
