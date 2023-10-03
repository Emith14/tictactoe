package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    TextView pntx, pnto, gano;
    Button breini;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        pntx = findViewById(R.id.pntx);
        pnto = findViewById(R.id.pnto);
        breini = findViewById(R.id.btnreini);
        gano = findViewById(R.id.ganador);

        Bundle bun = getIntent().getExtras();
        if (bun != null) {
           int  puntuajeX = bun.getInt("X", 0);
            int puntuajeO = bun.getInt("0", 0);



            pntx.setText("PUNTUAJE DE X : " + puntuajeX);
            pnto.setText("PUNTUAJE DE O : " + puntuajeO);

            if (puntuajeX > puntuajeO) {
                gano.setText("GANADOR : X ");

            } else if (puntuajeX==puntuajeO) {
                gano.setText("EMPATE");

            } else {
                gano.setText("GANADOR : O ");
            }
        }


        breini.setOnClickListener(view -> reiniciar());


    }

    public void reiniciar(){
        if(breini.isPressed()){
            Intent i= new Intent(this, MainActivity2.class);
            startActivity(i);
        }

    }

    @Override
    public void onClick(View view) {

    }
}