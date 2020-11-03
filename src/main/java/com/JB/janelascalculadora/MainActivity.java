package com.JB.janelascalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dar nomes as coisas necessarias
        final Button Btncalc = findViewById(R.id.btnCalcula);
        final Button BtnLimpa = findViewById(R.id.btnLimpa);
        final EditText txtlargnum = findViewById(R.id.txtlargnum);
        final EditText txtaltnum = findViewById(R.id.txtaltnum);
        final EditText txtExpessura1 = findViewById(R.id.txtexpnum);
        final EditText txtExpessura2 = findViewById(R.id.txtexpnum2);
        final EditText txtExpessura3 = findViewById(R.id.txtexpnum3);
        final TextView txtResultadoPerimetro = findViewById(R.id.resultadoPerimetro);
        final TextView txtResultadoPeso = findViewById(R.id.ResultadoPeso);



        Btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String larguraSTR = txtlargnum.getText().toString();
                String alturaSTR = txtaltnum.getText().toString();

                String expessuraSTR1 = txtExpessura1.getText().toString();
                String expessuraSTR2 = txtExpessura2.getText().toString();
                String expessuraSTR3 = txtExpessura3.getText().toString();

                if (larguraSTR.equals(""))
                {
                    larguraSTR = "0";
                }
                if (alturaSTR.equals(""))
                {
                    alturaSTR = "0";
                }
                if(expessuraSTR1.equals(""))
                {
                    expessuraSTR1 = "0";
                }
                if(expessuraSTR2.equals(""))
                {
                    expessuraSTR2 = "0";
                }
                if(expessuraSTR3.equals(""))
                {
                    expessuraSTR3 = "0";
                }

                Double larg = Double.parseDouble(larguraSTR);
                Double alt = Double.parseDouble(alturaSTR);
                Double expe = Double.parseDouble(expessuraSTR1);
                Double expe2 = Double.parseDouble(expessuraSTR2);
                Double expe3 = Double.parseDouble(expessuraSTR3);

                System.out.println("STRlar: "+ larguraSTR);
                System.out.println("STRalt: "+ alturaSTR);
                System.out.println("STRexpess1: "+ expessuraSTR1 + "STRexpess2: "+ expessuraSTR2 + "STRexpess3: "+ expessuraSTR3);

                System.out.println("lar: " + larg);
                System.out.println("alt: " + alt);
                System.out.println("expe: "+ expe);

                Double Peso = (larg/1000) * (alt/1000) * (expe+expe2+expe3) * 2.5;
                Double Perimetro = (larg + alt) * 0.0020;

                Double PesoRounded = Math.round(Peso*100.00) /100.0;
                Double PerimetroRounded  = Math.round(Perimetro*100.00)/100.00;

                txtResultadoPeso.setText(PesoRounded.toString()+ " Kg");
                txtResultadoPerimetro.setText(PerimetroRounded.toString()+ " m");
            }
        });




        BtnLimpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtlargnum.getText().clear();
                txtaltnum.getText().clear();
                txtExpessura1.getText().clear();
                txtExpessura2.getText().clear();
                txtExpessura3.getText().clear();

                txtResultadoPerimetro.setText("              m");
                txtResultadoPeso.setText("            Kg");
            }
        });










    }
}
