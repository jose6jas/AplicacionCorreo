package com.example.jose6jas.aplicacioncorreo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.jose6jas.aplicacioncorreo.R;
import com.example.jose6jas.aplicacioncorreo.adapter.MascotaAdaptador;
import com.example.jose6jas.aplicacioncorreo.pojo.Mascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrincipalFragment extends Fragment {

    ArrayList<Mascota> mascotas;

    private RecyclerView listaMascotas;

    public PrincipalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_principal, container, false);
        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        //Aqui marcamos como nos va a funcionar
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }
    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas,getActivity());

        listaMascotas.setAdapter(adaptador);

    }
    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Penelope", R.drawable.mascota1,0));
        mascotas.add(new Mascota("Princesa",R.drawable.mascota2,0));
        mascotas.add(new Mascota("Catumpi",R.drawable.mascota3,0));
        mascotas.add(new Mascota("Lucky",R.drawable.mascota4,0));
        mascotas.add(new Mascota("Firulais",R.drawable.mascota5,0));
        mascotas.add(new Mascota("Ice",R.drawable.mascota6,0));

    }


}
