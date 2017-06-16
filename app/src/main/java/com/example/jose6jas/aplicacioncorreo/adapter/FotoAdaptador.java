package com.example.jose6jas.aplicacioncorreo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jose6jas.aplicacioncorreo.pojo.Foto;
import com.example.jose6jas.aplicacioncorreo.R;
import com.example.jose6jas.aplicacioncorreo.pojo.Foto;

import java.util.ArrayList;

/**
 * Created by jose6jas on 6/15/17.
 */

public class FotoAdaptador extends RecyclerView.Adapter<FotoAdaptador.FotoViewHolder>{

    ArrayList<Foto> fotos;

    public FotoAdaptador(ArrayList<Foto> fotos){
        this.fotos = fotos;
    }




    @Override
    public FotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v3 = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_foto,parent,false);

        return new FotoViewHolder(v3);
    }

    @Override
    public void onBindViewHolder(FotoViewHolder fotoViewholder, int position) {
        Foto foto = fotos.get(position);
        fotoViewholder.imgMascota3.setImageResource(foto.getFoto());
        fotoViewholder.tv_count3.setText(String.valueOf(foto.getCount()));
        //fotoViewholder.tv_nombre3.setText(foto.getNombre());

    }

    @Override
    public int getItemCount() {
        return fotos.size();
    }

    public static class FotoViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgMascota3;
        private TextView tv_count3;
        //private TextView tv_nombre3;


        public FotoViewHolder(View itemView) {
            super(itemView);
            imgMascota3    = (ImageView) itemView.findViewById(R.id.imgMascota3);
            tv_count3      = (TextView) itemView.findViewById(R.id.tv_count3);
          //  tv_nombre3     = (TextView) itemView.findViewById(R.id.tv_nombre3);

        }
    }
}
