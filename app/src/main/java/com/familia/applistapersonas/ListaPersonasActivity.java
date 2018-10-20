package com.familia.applistapersonas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.familia.applistapersonas.adapter.ListaPersonasAdapter;
import com.familia.applistapersonas.model.PersonaModel;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonasActivity extends AppCompatActivity {

    private RecyclerView rvPersonas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listapersonas);

        rvPersonas = findViewById(R.id.rvPersonas);

        // 1. Administrador de diseño
        LinearLayoutManager layoutManager = new LinearLayoutManager(ListaPersonasActivity.this);

        rvPersonas.setLayoutManager(layoutManager);

        // 2. Adaptador

        ListaPersonasAdapter adapter = new ListaPersonasAdapter();
        rvPersonas.setAdapter(adapter);

        // 3. datos (Lista de personas)
        List<PersonaModel> personas = new ArrayList<>();

        adapter.setListaPersonas(obtenerListaPersonas());

    }

    private List<PersonaModel> obtenerListaPersonas() {
        List<PersonaModel> personas = new ArrayList<>();

        PersonaModel persona1 = new PersonaModel("Manuel Navaro", "1234 2233");
        PersonaModel persona2 = new PersonaModel("Monica Navaro", "34 2233");
        PersonaModel persona3 = new PersonaModel("Ange Navaro", "4 2233");

        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);


        return personas;
    }
}
