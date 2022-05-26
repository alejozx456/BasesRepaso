package com.example.basesrepaso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    private ListView listaDatos;
    private EditText datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listaDatos=findViewById(R.id.lista);
        datos=findViewById(R.id.dato);

        ArrayAdapter<String> adapter= new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cargarDatos()
        );

        listaDatos.setAdapter(adapter);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                datos.setText("dsdsd"+listaDatos.getItemAtPosition(i));
            }
        });

    }
    private List<String> cargarDatos(){
        List<String> list=new ArrayList<>();
        for(int i=1;i<=40;i++){
            String item="Numero "+i;
            list.add(item);
        }
        return  list;
    }



}