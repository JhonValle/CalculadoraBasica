package com.example.calculadorabasica;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

    public class MainActivity extends AppCompatActivity {

        //Declaramos
        TextView Screen;
        Button Clean, Division, Multiplicacion, Limpiar, Siete, Ocho, Nueve, Resta, Cuatro, Cinco, Seis, Suma, Uno, Dos, Tres, Igual, Cero, Punto;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Screen = (TextView) findViewById(R.id.txtView);

            Clean = (Button) findViewById(R.id.btnclean);
            Division = (Button) findViewById(R.id.btndivision);
            Multiplicacion = (Button) findViewById(R.id.btnmultiplicacion);
            Limpiar = (Button) findViewById(R.id.btneliminar);
            Siete = (Button) findViewById(R.id.btnnumber7);
            Ocho = (Button) findViewById(R.id.btnnumber8);
            Nueve = (Button) findViewById(R.id.btnnumber9);
            Resta = (Button) findViewById(R.id.btnresta);
            Cuatro = (Button) findViewById(R.id.btnnumber4);
            Cinco = (Button) findViewById(R.id.btnnumber5);
            Seis = (Button) findViewById(R.id.btnnumber6);
            Suma = (Button) findViewById(R.id.btnsuma);
            Uno = (Button) findViewById(R.id.btnnumber1);
            Dos = (Button) findViewById(R.id.btnnumber2);
            Tres = (Button) findViewById(R.id.btnnumber3);
            Igual = (Button) findViewById(R.id.btnigual);
            Cero = (Button) findViewById(R.id.btnnumber0);
            Punto = (Button) findViewById(R.id.btnpunto);

            Clean.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText("");
                }
            });
            Limpiar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText("");
                }
            });
            Division.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"/");
                }
            });

            Multiplicacion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"*");
                }
            });

            Resta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"-");
                }
            });

            Suma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"+");
                }
            });

            Cero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"0");
                }
            });

            Uno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"1");
                }
            });

            Dos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"2");
                }
            });

            Tres.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"3");
                }
            });

            Cuatro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"4");
                }
            });

            Cinco.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"5");
                }
            });

            Seis.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"6");
                }
            });

            Siete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"7");
                }
            });

            Ocho.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"8");
                }
            });

            Nueve.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+"9");
                }
            });

            Punto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Screen.setText(Screen.getText()+".");
                }
            });

            Igual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Expression Calcular = new Expression(Screen.getText().toString());
                    Screen.setText(String.valueOf(Calcular.calculate()));
                }

            });

        }
    }