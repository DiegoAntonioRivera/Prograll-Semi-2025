package com.example.miprimeraaplicacion;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tempVal;
    RadioGroup rgb;
    RadioButton opt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tempVal = findViewById(R.id.txtNum1);
                double Num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = findViewById(R.id.txtNum2);
                double Num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = Num1 + Num2;

                opt = findViewById(R.id.optExponenciacion);
                if (opt.isChecked()) {
                    respuesta = Math.pow(Num1, Num2);
                }

                opt = findViewById(R.id.optPorcentual);
                if (opt.isChecked()) {
                    respuesta = (Num1 * Num2) / 100;
                }

                opt = findViewById(R.id.optRaiz);
                if (opt.isChecked()) {
                    if (Num1 < 0) {
                    }
                    respuesta = Math.sqrt(Num1);
                }

                opt = findViewById(R.id.optFactorial);
                if (opt.isChecked()) {
                    if (Num1 < 0 || Num1 != (int) Num1) {
                    }
                }

                opt = findViewById(R.id.optModulo);
                if (opt.isChecked()) {
                    if (Num2 == 0) {
                    }
                    respuesta = Num1 % Num2;
                }

                opt = findViewById(R.id.optMayor);
                if (opt.isChecked()) {
                    respuesta = Math.max(Num1, Num2);
                }



                tempVal = findViewById(R.id.lblRespuesta);
                tempVal.setText("Respuesta: "+ respuesta);
            }
        });

    }
}