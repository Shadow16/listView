package com.example.nestor.imageslistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    ListViewAdapter adapter;

    String[] titulos = new String[]{
            "Guitar hero",
            "Veinte petalos",
            "Cien años de soledad",
            "Por amor a la física",
            "El héroe perdido",
            "El principito",
            "Bioshock",
            "La seducción de las palabras",
            "La trampa del oso",
            "El libro de los valores"
    };

    String[] contenidos = new String[]{
            "Manual para el famoso juego GuitarHero",
            "Novela romántica de dos encuentros",
            "Historia basada en hechos reales",
            "Guía práctica de la física en la actualidad",
            "Cuento de ciencia ficción",
            "Cuento infantil de segundo grado",
            "Documental de busos y tiburones",
            "Libro del idioma español y la gramática",
            "Cuento infantil cuarto grado",
            "Libro de apoyo a los valores morales"
    };

    int[] imagenes = {
            R.drawable.icon01,
            R.drawable.icon02,
            R.drawable.icon03,
            R.drawable.icon04,
            R.drawable.icon05,
            R.drawable.icon06,
            R.drawable.icon07,
            R.drawable.icon08,
            R.drawable.icon09,
            R.drawable.icon10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListViewAdapter(this, titulos, contenidos, imagenes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent uno = new Intent(getApplicationContext(), GuitarHero.class);
                        startActivity(uno);
                        break;
                    case 1 :
                        Intent dos = new Intent(getApplicationContext(), VeintePetalos.class);
                        startActivity(dos);
                        break;
                    case 2 :
                        Intent tres = new Intent(getApplicationContext(), CienAnios.class);
                        startActivity(tres);
                        break;
                    case 3 :
                        Intent cuatro = new Intent(getApplicationContext(), AmorFisica.class);
                        startActivity(cuatro);
                        break;
                    case 4 :
                        Intent cinco = new Intent(getApplicationContext(), HeroePerdido.class);
                        startActivity(cinco);
                        break;
                    case 5 :
                        Intent seis = new Intent(getApplicationContext(), Principito.class);
                        startActivity(seis);
                        break;
                    case 6 :
                        Intent siete = new Intent(getApplicationContext(), Bioshock.class);
                        startActivity(siete);
                        break;
                    case 7 :
                        Intent ocho = new Intent(getApplicationContext(), SeduccionPal.class);
                        startActivity(ocho);
                        break;
                    case 8 :
                        Intent nueve = new Intent(getApplicationContext(), TrampaOso.class);
                        startActivity(nueve);
                        break;
                    case 9 :
                        Intent diez = new Intent(getApplicationContext(), Valores.class);
                        startActivity(diez);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(), "OCURRIO UN ERROR AL SELECCIONAR", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}