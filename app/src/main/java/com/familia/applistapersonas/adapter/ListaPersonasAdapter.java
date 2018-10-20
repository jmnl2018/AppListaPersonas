package com.familia.applistapersonas.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.familia.applistapersonas.R;
import com.familia.applistapersonas.model.PersonaModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AcademiaMoviles on 20/10/2018.
 */

public class ListaPersonasAdapter extends RecyclerView.Adapter <ListaPersonasAdapter.PersonaHolder> {

    private List<PersonaModel> listaPersonas = new ArrayList<>();

    public void setListaPersonas(List<PersonaModel> listaPersonas) {
        this.listaPersonas = listaPersonas;

        // Refrescar toda la lista
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PersonaHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());


        PersonaHolder personaHolder = new PersonaHolder( inflater.inflate(R.layout.celda_persona,viewGroup, false) );
        return  personaHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull PersonaHolder personaholder, int position) {
        PersonaModel persona = listaPersonas.get(position);

        personaholder.tvnombres.setText(persona.getNombres());
        personaholder.tvtelefono.setText(persona.getTelefono());

    }


    @Override
    public int getItemCount() {
        return listaPersonas.size();
    }

    class PersonaHolder extends RecyclerView.ViewHolder {
        TextView tvnombres;
        TextView tvtelefono;

        public PersonaHolder(View itemView) {
            super(itemView);
            tvnombres = itemView.findViewById(R.id.tvNombres);
            tvtelefono = itemView.findViewById(R.id.tvTelefono);


        }
    }

    ;


}
