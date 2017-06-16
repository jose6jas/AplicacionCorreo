package com.example.jose6jas.aplicacioncorreo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.jose6jas.aplicacioncorreo.adapter.FavoritoAdaptador;
import com.example.jose6jas.aplicacioncorreo.pojo.Mascota;

import java.util.ArrayList;

public class Favorite extends AppCompatActivity {
    private RecyclerView listaFavoritos;
    ArrayList<Mascota> favoritos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listaFavoritos = (RecyclerView)findViewById(R.id.rvFavoritos);

        LinearLayoutManager llm2 = new LinearLayoutManager(this);
        llm2.setOrientation(LinearLayoutManager.VERTICAL);
        listaFavoritos.setLayoutManager(llm2);
        inicializarListaFavoritos();
        inicializarAdaptador2();



    }
    public void inicializarAdaptador2(){
        FavoritoAdaptador adaptador2 = new FavoritoAdaptador(favoritos);
        listaFavoritos.setAdapter(adaptador2);
    }

    public void inicializarListaFavoritos() {

        favoritos= new ArrayList<Mascota>();
        favoritos.add(new Mascota("Penelope",R.drawable.mascota1,0));
        favoritos.add(new Mascota("Princesa",R.drawable.mascota2,0));
        favoritos.add(new Mascota("Catumpi",R.drawable.mascota3,0));
        favoritos.add(new Mascota("Lucky",R.drawable.mascota4,0));
        favoritos.add(new Mascota("Firulais",R.drawable.mascota5,0));

    }
}
