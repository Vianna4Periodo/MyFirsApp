package com.example.aluno.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
        setupActions();
    }

    private void setupActions() {

        btn.setEnabled(false);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateIMC();
            }
        });

        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                checkInputs();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };

        nome.addTextChangedListener(watcher);
        altura.addTextChangedListener(watcher);
        peso.addTextChangedListener(watcher);
    }

    private void checkInputs() {
        if (nome.getText().toString().equals("") ||
                altura.getText().toString().equals("") ||
                peso.getText().toString().equals("")) {
            btn.setEnabled(false);
        } else {
            btn.setEnabled(true);
        }
    }

    private void calculateIMC() {
        Pessoa p = new Pessoa();
        p.setNome(nome.getText().toString());
        p.setAltura(Double.parseDouble(altura.getText().toString()));
        p.setPeso(Double.parseDouble(peso.getText().toString()));

        Toast.makeText(getApplicationContext(), "IMC: " + p.imc(), Toast.LENGTH_LONG).show();

        nome.setText("");
        altura.setText("0");
        peso.setText("0");
    }

    private void binding() {
        btn = findViewById(R.id.btnCalcular);
        nome = findViewById(R.id.edtNome);
        peso = findViewById(R.id.edtPeso);
        altura = findViewById(R.id.edtAltura);
    }

}
