package com.example.aluno.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aluno.myfirstapp.model.Pessoa;

public class MainActivity extends Activity {

    Button btn;
    EditText nome, peso, altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        nome = findViewById(R.id.edtNome);
        peso = findViewById(R.id.edtPeso);
        altura = findViewById(R.id.edtAltura);

        //btn.setVisibility(View.INVISIBLE);
    }
}
