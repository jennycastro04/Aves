package com.example.aves;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class aves7 extends AppCompatActivity {

    private Spinner spinner;
    private ImageButton btnsonido;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aves7);

        spinner = findViewById(R.id.spinnerave7);
        btnsonido = findViewById(R.id.imgave7);

        String[] opciones = {"Seleccionar ave","Bolborhynchus ferrugineifrons","Chlorochrysa nitidissima",
                "Cistothorus apolinari", "Coeligena orina",
                "Doliornis remseni", "Grallaria urraoensis",
                /*"Lipaugus weberi",*/ "Odontophorus strophium", "Rallus semiplumbeus"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        spinner.setAdapter(adapter);

        btnsonido = (ImageButton) findViewById(R.id.imgave7);
        mp = MediaPlayer.create(this, R.raw.lipaugusweberi);
        btnsonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

            }
        });
    }

    public void pausarave7(View view){

        mp.stop();
    }

    public void buscar7(View view){

        String s = spinner.getSelectedItem().toString();
        if (s.equals("Bolborhynchus ferrugineifrons")){
            Intent intent= new Intent(this, aves1.class);
            startActivity(intent);
        }
        if (s.equals("Chlorochrysa nitidissima")){
            Intent intent = new Intent(this, aves2.class);
            startActivity(intent);
        }
        if(s.equals("Cistothorus apolinari")){
            Intent intent=new Intent(this, aves3.class);
            startActivity(intent);
        }
        if(s.equals("Coeligena orina")){
            Intent intent= new Intent(this, aves4.class);
            startActivity(intent);
        }
        if(s.equals("Doliornis remseni")){
            Intent intent = new Intent(this, aves5.class);
            startActivity(intent);
        }
        if(s.equals("Grallaria urraoensis")){
            Intent intent = new Intent(this, aves6.class);
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