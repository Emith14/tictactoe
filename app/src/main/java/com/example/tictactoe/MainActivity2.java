package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, results;
    int puntuajeX;
    int puntuajeO;
    TextView txtwol, txt2, txt3;
    boolean x = false;
    boolean empate = false;
    boolean turno = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        txtwol = findViewById(R.id.textovic);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        results = findViewById(R.id.results);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        txtwol.setOnClickListener(this);






        txt2.setText("Puntos X : " + puntuajeX);
        txt3.setText("Puntos O : " + puntuajeO);


        Button btnreini = findViewById(R.id.btnreini);
        btnreini.setOnClickListener(view -> reiniciarJuego());
        results.setOnClickListener(view -> pasarActivity());

    }

    public void pasarActivity(){
        Intent intent = new Intent(this,MainActivity3.class);
        intent.putExtra("X", puntuajeX);
        intent.putExtra("0", puntuajeO);

        startActivity(intent);
    }

    private void reiniciarJuego() {

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);


        b1.setText(".");
        b2.setText(".");
        b3.setText(".");
        b4.setText(".");
        b5.setText(".");
        b6.setText(".");
        b7.setText(".");
        b8.setText(".");
        b9.setText(".");
        txtwol.setText(".");


        x = false;
        turno = false;
        empate= false;

    }
    private boolean jugadorGano(String jugador) {

        for (int i = 0; i < 3; i++) {
            if (b1.getText().equals(jugador) && b2.getText().equals(jugador) && b3.getText().equals(jugador)) {
                return true;

            }

            if (b4.getText().equals(jugador) && b5.getText().equals(jugador) && b6.getText().equals(jugador)) {
                return true;
            }

            if (b7.getText().equals(jugador) && b8.getText().equals(jugador) && b9.getText().equals(jugador)) {
                return true;
            }
        }


        for (int i = 0; i < 3; i++) {
            if (b1.getText().equals(jugador) && b4.getText().equals(jugador) && b7.getText().equals(jugador)) {
                return true;
            }

            if (b2.getText().equals(jugador) && b5.getText().equals(jugador) && b8.getText().equals(jugador)) {
                return true;
            }

            if (b3.getText().equals(jugador) && b6.getText().equals(jugador) && b9.getText().equals(jugador)) {
                return true;
            }
        }


        if (b1.getText().equals(jugador) && b5.getText().equals(jugador) && b9.getText().equals(jugador)) {
            return true;
        }

        if( b7.getText().equals(jugador) && b5.getText().equals(jugador) && b3.getText().equals(jugador)){
            return true;
        }
        return false;
    }

    private boolean empato() {
        return !b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() &&
                !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() &&
                !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled();
    }

    @Override
    public void onClick(View v) {
        String tag = v.getTag().toString();
        int tagnum = Integer.parseInt(tag);


        if (tagnum == 1) if (b1.isPressed() && !x) {
            b1.setText("X");
            turno = true;
            x = true;


        } else {
            b1.setText("0");
            turno = false;
            x = false;

        }

        if (tagnum == 2) if (b2.isPressed() && !x) {
            b2.setText("X");
            turno = true;
            x = true;

        } else {
            b2.setText("0");
            turno = false;
            x = false;

        }

        if (tagnum == 3) if (b3.isPressed() && !x) {
            b3.setText("X");
            turno = true;
            x = true;
        } else {
            b3.setText("0");
            turno = false;
            x = false;

        }

        if (tagnum == 4) if (b4.isPressed() && !x) {
            b4.setText("X");
            turno = true;
            x = true;

        } else {
            b4.setText("0");
            turno = false;
            x = false;

        }


        if (tagnum == 5) if (b5.isPressed() && !x) {
            b5.setText("X");
            turno = true;
            x = true;

        } else {
            b5.setText("0");
            turno = false;
            x = false;
        }


        if (tagnum == 6) if (b6.isPressed() && !x) {
            b6.setText("X");
            turno = true;
            x = true;
        } else {
            b6.setText("0");
            turno = false;
            x = false;
        }


        if (tagnum == 7) if (b7.isPressed() && !x) {
            b7.setText("X");
            turno = true;
            x = true;
        } else {
            b7.setText("0");
            turno = false;
            x = false;
        }

        if (tagnum == 8) if (b8.isPressed() && !x) {
            b8.setText("X");
            turno = true;
            x = true;
        } else {
            b8.setText("0");
            turno = false;
            x = false;
        }

        if (tagnum == 9) if (b9.isPressed() && !x) {
            b9.setText("X");
            turno = true;
            x = true;
        } else {
            b9.setText("0");
            turno = false;
            x = false;
        }

        if (jugadorGano("X")) {
            puntuajeX++;

            txtwol.setText("GANASTE, PRESIONA REINICIAR PARA VOLVER A EMPEZAR");

        } else if (jugadorGano("0")) {

            txtwol.setText("GANASTE, PRESIONA REINICIAR PARA VOLVER A EMPEZAR");
            puntuajeO++;


        } else {

            if (empato() && !empate) {
                txtwol.setText("EMPATE. PRESIONA EL BOTÓN REINICIAR PARA VOLVER A EMPEZAR");
                empate = true;
            }


        }
        txt2.setText("Puntos X : " + puntuajeX);
        txt3.setText("Puntos O : " + puntuajeO);
    }


}