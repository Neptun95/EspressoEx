package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.myapplication.R.id.add;
import static com.example.myapplication.R.id.addi;
import static com.example.myapplication.R.id.editText;

public class MainActivity extends AppCompatActivity {


    private Button minus;
    private Button addi;
    private Button multi;
    private Button division;
    private TextView ergebniss;
    private EditText ersteZahl;
    private EditText zweiteZahl;
    private double zahl;
    private double zahl2;
    private double ergeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minus = findViewById(R.id.subtrak);
        addi = findViewById(R.id.addi);
        multi= findViewById(R.id.multi);
        division = findViewById(R.id.division);
        ergebniss = findViewById(R.id.textView);
        ersteZahl = findViewById(R.id.editText);
        zweiteZahl = findViewById(R.id.editText2);

        minus.setOnClickListener(new minusRech());

        addi.setOnClickListener(new addRech());

        multi.setOnClickListener(new multiRech());

        division.setOnClickListener(new diviRech());


    }

    private class minusRech implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            zahl = Double.parseDouble(ersteZahl.getText().toString());
            zahl2 = Double.parseDouble(zweiteZahl.getText().toString());

            ergeb = zahl - zahl2;

            ergebniss.setText(getString(R.string.ergebnis, String.valueOf(ergeb)));
        }
    }

    private class addRech implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            zahl = Double.parseDouble(ersteZahl.getText().toString());
            zahl2 = Double.parseDouble(zweiteZahl.getText().toString());

            ergeb = zahl + zahl2;

            ergebniss.setText(getString(R.string.ergebnis, String.valueOf(ergeb)));
        }
    }

    private class multiRech implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            zahl = Double.parseDouble(ersteZahl.getText().toString());
            zahl2 = Double.parseDouble(zweiteZahl.getText().toString());

            ergeb = zahl * zahl2;

            ergebniss.setText(getString(R.string.ergebnis, String.valueOf(ergeb)));
        }
    }

    private class diviRech implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            zahl = Double.parseDouble(ersteZahl.getText().toString());
            zahl2 = Double.parseDouble(zweiteZahl.getText().toString());

            ergeb = zahl / zahl2;

            ergebniss.setText(getString(R.string.ergebnis, String.valueOf(ergeb)));
        }
    }
}
