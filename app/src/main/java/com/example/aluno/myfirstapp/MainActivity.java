package com.example.aluno.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aluno.myfirstapp.model.Pessoa;

public class MainActivity extends Activity {

    Button btn;
    EditText nome, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding();

        Pessoa p = new Pessoa();
        p.setNome(nome.getText().toString());
        p.setAltura(Double.parseDouble(altura.getText().toString()));
        p.setPeso(Double.parseDouble(peso.getText().toString()));

        double imc = p.imc();

        

        //btn.setVisibility(View.INVISIBLE);
    }

    private void binding() {
        btn = findViewById(R.id.btnCalcular);
        nome = findViewById(R.id.edtNome);
        peso = findViewById(R.id.edtPeso);
        altura = findViewById(R.id.edtAltura);
    }
}
