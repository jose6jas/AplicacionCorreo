package com.example.jose6jas.aplicacioncorreo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import com.example.jose6jas.aplicacioncorreo.adapter.MascotaAdaptador;
import com.example.jose6jas.aplicacioncorreo.adapter.PageAdaptador;
import com.example.jose6jas.aplicacioncorreo.fragment.PerfilFragment;
import com.example.jose6jas.aplicacioncorreo.fragment.PrincipalFragment;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    public MascotaAdaptador adaptador;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        setUpViewPager();

/*


*/
        //  if (toolbar != null){
        //      setSupportActionBar(miActionBar);
        //  }


    }

    private ArrayList<Fragment> agregarFragments() {

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new PrincipalFragment());
        fragments.add(new PerfilFragment());

        return fragments;

    }

    //poner en orbita los fragments
    private void setUpViewPager() {
        viewPager.setAdapter(new PageAdaptador(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_casa);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_perfil);
    }


    @Override
//aqui agregamos el menu a la vista
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mAbout:
                Intent about = new Intent(this, About.class);
                startActivity(about);
                break;
            case R.id.mSettings:
                Intent settings = new Intent(this, Correo.class);
                startActivity(settings);
                break;
            case R.id.mFavorite:
                Intent favorite = new Intent(this, Favorite.class);
                startActivity(favorite);
                break;


        }
        return true;
    }


    // Log.i("Mesage",mascotas.get(0).getNombre()+mascotas.get(0).getCount());
    // Log.i("Mesage",mascotas.get(1).getNombre()+mascotas.get(1).getCount());
    // Log.i("Mesage",mascotas.get(2).getNombre()+mascotas.get(2).getCount());
    // Log.i("Mesage",mascotas.get(3).getNombre()+mascotas.get(3).getCount());
    // Log.i("Mesage",mascotas.get(4).getNombre()+mascotas.get(4).getCount());

/*
        Intent favorite = new Intent(this, Favorite.class);
        //Esto se debe mejorar aqui paso los 5 favoritos
        favorite.putExtra("nombre1", mascotas.get(0).getNombre());
        favorite.putExtra("foto1", mascotas.get(0).getFoto());
        favorite.putExtra("count1", mascotas.get(0).getCount());

        favorite.putExtra("nombre2", mascotas.get(1).getNombre());
        favorite.putExtra("foto2", mascotas.get(1).getFoto());
        favorite.putExtra("count2", mascotas.get(1).getCount());

        favorite.putExtra("nombre3", mascotas.get(2).getNombre());
        favorite.putExtra("foto3", mascotas.get(2).getFoto());
        favorite.putExtra("count3", mascotas.get(2).getCount());

        favorite.putExtra("nombre4", mascotas.get(3).getNombre());
        favorite.putExtra("foto4", mascotas.get(3).getFoto());
        favorite.putExtra("count4", mascotas.get(3).getCount());

        favorite.putExtra("nombre5", mascotas.get(4).getNombre());
        favorite.putExtra("foto5", mascotas.get(4).getFoto());
        favorite.putExtra("count5", mascotas.get(4).getCount());

*/


}