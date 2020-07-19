package com.criscordeiro.meuimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double peso  = Double.parseDouble(editPeso.getText().toString());
                double altura = Double.parseDouble(editAltura.getText().toString());

                double imc = peso/(altura*altura);

                if (imc >= 18.5 && imc <= 24.99){
                    textResultado.setText("Peso Normal, IMC = "+ imc);

                }else if(imc >= 25 && imc <= 29.99){
                    textResultado.setText("Acima do Peso, IMC = "+ imc);

                }else if(imc >= 30 && imc <=34.99){
                    textResultado.setText("Obesidade 1, IMC = "+ imc);

                }else if(imc >= 35 && imc <=39.99){
                    textResultado.setText("Obesidade Severa, IMC = "+ imc);

                }else if(imc >40){
                    textResultado.setText("Obesidade 3,(Mórbida) IMC = "+ imc);
                }
            }
        });
    }
}
