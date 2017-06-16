package com.example.jose6jas.aplicacioncorreo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jose6jas.aplicacioncorreo.R;
import com.example.jose6jas.aplicacioncorreo.adapter.FotoAdaptador;
import com.example.jose6jas.aplicacioncorreo.pojo.Foto;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

 private RecyclerView listaFotos;
 ArrayList<Foto> fotos;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v4= inflater.inflate(R.layout.fragment_perfil, container, false);

        listaFotos = (RecyclerView) v4.findViewById(R.id.rvFotos);

        GridLayoutManager glm2 = new GridLayoutManager(getContext(),3);
        glm2.setOrientation(LinearLayoutManager.VERTICAL);
        listaFotos.setLayoutManager(glm2);
        inicializarListaFotos();
        inicializarAdaptadorFotos();
        return v4;


    }

    public void inicializarAdaptadorFotos(){
        FotoAdaptador adaptador2 = new FotoAdaptador(fotos);
        listaFotos.setAdapter(adaptador2);

    }

    public void inicializarListaFotos(){
        fotos = new ArrayList<Foto>();
        fotos.add(new Foto("Firulais", R.drawable.mascota1,4));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,3));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,0));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,6));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,8));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,4));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,2));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,2));
        fotos.add(new Foto("Firulais",R.drawable.mascota1,1));

    }

}
