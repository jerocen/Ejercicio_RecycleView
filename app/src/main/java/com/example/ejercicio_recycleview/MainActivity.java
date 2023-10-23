package com.example.ejercicio_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Eduardo Cardenas", "educardns@gmail.com", R.drawable.person5));
        items.add(new Item("Nicole Doliva", "nicldolv@gmail.com", R.drawable.person4));
        items.add(new Item("Emma Figueroa", "emmfig@gmail.com", R.drawable.person6));
        items.add(new Item("Angela Durán", "angdur@gmail.com", R.drawable.person8));
        items.add(new Item("Luan García", "Lugarc@gmail.com", R.drawable.person5));
        items.add(new Item("Martín Sanchez", "martsanch@gmail.com", R.drawable.person1));
        items.add(new Item("Gaby Jimenez", "gabjimn@gmail.com", R.drawable.person4));
        items.add(new Item("Luisa Martínez", "luimart@gmail.com", R.drawable.person9));
        items.add(new Item("Angie López", "anglop@gmail.com", R.drawable.person10));
        items.add(new Item("Jinny Contreras", "jincontr@gmail.com", R.drawable.person11));
        items.add(new Item("Jessica Marquez", "jesmarq@gmail.com", R.drawable.person2));
        items.add(new Item("Dylan Adame", "dyladme@gmail.com", R.drawable.person5));
        items.add(new Item("Alma Orozco", "almoroz@gmail.com", R.drawable.person10));
        items.add(new Item("Jenny Xolio", "jenxoli@gmail.com", R.drawable.person11));
        items.add(new Item("Courtney Salazar", "courtsalz@gmail.com", R.drawable.person6));
        items.add(new Item("Molly Rodriguez", "mollrodz@gmail.com", R.drawable.person4));
        items.add(new Item("Gael Salinas", "galsaln@gmail.com", R.drawable.person8));
        items.add(new Item("Lucy Mendez", "lucmend@gmail.com", R.drawable.person9));
        items.add(new Item("Johana Vanessa Ramirez", "johvans@gmail.com", R.drawable.person8));
        items.add(new Item("Salma Rosales", "salmrosl@gmail.com", R.drawable.person4));
        items.add(new Item("Karen Sifuentes", "karsif@gmail.com", R.drawable.person6));
        items.add(new Item("Gustavo Hernandez", "gusthern@gmail.com", R.drawable.person3));
        items.add(new Item("Rosa Velazquez", "rosvasq@gmail.com", R.drawable.person6));
        items.add(new Item("Claudia Silva", "clausilv@gmail.com", R.drawable.person2));
        items.add(new Item("Manuel Ortiz Dominguez", "manuortdomg@gmail.com", R.drawable.person3));
        items.add(new Item("Hector Zapata Rogriguez", "hectzapro@gmail.com", R.drawable.person5));
        items.add(new Item("John Zuñiga Ortega", "johzuort@gmail.com", R.drawable.person1));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));
    }
}