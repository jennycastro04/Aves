package com.example.aves;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class aves2 extends AppCompatActivity {

    private Spinner spinnerave2;
    private ImageButton btnsonido;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves2);

        spinnerave2=findViewById(R.id.spinnerave2);
        btnsonido=findViewById(R.id.imgave2);

        String[] opciones = {"Seleccionar ave","Bolborhynchus ferrugineifrons",/*"Chlorochrysa nitidissima",*/ "Cistothorus apolinari", "Coeligena orina", "Doliornis remseni", "Grallaria urraoensis", "Lipaugus weberi", "Odontophorus strophium", "Rallus semiplumbeus"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinnerave2.setAdapter(adapter);


        btnsonido = (ImageButton) findViewById(R.id.imgave2);
        mp = MediaPlayer.create(this, R.raw.chlorochrysanitidissima);
        btnsonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });
    }
    public void pausarave2(View view){

        mp.stop();
    }

    public void buscar2(View view){

        String s = spinnerave2.getSelectedItem().toString();
        if (s.equals("Bolborhynchus ferrugineifrons")){
            Intent intent = new Intent(this, aves1.class);
            startActivity(intent);
        }

        if(s.equals("Cistothorus apolinari")){

            Intent intent = new Intent(this, aves3.class);
            startActivity(intent);
        }
        if(s.equals("Coeligena orina")){
            Intent intent = new Intent(this, aves4.class);
            startActivity(intent);
        }
        if(s.equals("Doliornis remseni")){
            Intent intent= new Intent(this, aves5.class);
            startActivity(intent);
        }
        if(s.equals("Grallaria urraoensis")){
            Intent intent = new Intent(this, aves6.class);
            startActivity(intent);
        }
        if(s.equals("Lipaugus weberi")){
            Intent intent = new Intent(this, aves7.class);
            startActivity(intent);
        }
        if(s.equals("Odontophorus strophium")){
            Intent intent = new Intent(this, aves8.class);
            startActivity(intent);
        }
        if(s.equals("Rallus semiplumbeus")){
            Intent intent = new Intent(this, aves9.class);
            startActivity(intent);
        }
    }
}