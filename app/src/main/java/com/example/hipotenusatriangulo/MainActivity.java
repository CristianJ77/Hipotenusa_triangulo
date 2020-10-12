package com.example.hipotenusatriangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextladoA;
    private EditText editTextladoB;
    private TextView textvHipotenusa;
    private Button button_calcular;

    String ladoA;
    String ladoB;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextladoA = (EditText) findViewById(R.id.ladoA);
        editTextladoB = (EditText) findViewById(R.id.ladoB);
        textvHipotenusa = (TextView) findViewById(R.id.textv_hip);
        button_calcular = (Button) findViewById(R.id.btn_calcular);

        button_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ladoA = editTextladoA.getText().toString();
                ladoB = editTextladoB.getText().toString();

                if (ladoA.length() == 0) {
                    textvHipotenusa.setText("Ingresa valor del lado A");

                } else if (ladoB.length() == 0) {
                    textvHipotenusa.setText("Ingresa valor del lado B");

                } else {

                    //variable en la que se guarda el metodo del calculo de la hipotenusa
                    double hipotenusa;
                    double A = Double.parseDouble(ladoA);
                    double B = Double.parseDouble(ladoB);
                    hipotenusa = calculohipotenusa(A, B);
                    textvHipotenusa.setText("La hipotenusa es : " + hipotenusa);
                }
            }
        });
    }

    //metodo donde se calcula la hipotenusa
    private static double calculohipotenusa(double valorA, double valorB) {
        double result = 0;
        result = Math.sqrt(valorA * valorA + valorB * valorB);
        return result;
    }
}