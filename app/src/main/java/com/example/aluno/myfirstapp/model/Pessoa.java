package com.example.aluno.myfirstapp.model;

/**
 * Created by Felipe Ferraz on 07/02/2018.
 */

public class Pessoa {
    private String nome;
    private double peso, altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa() {
    }

    public double imc(){
        return peso/Math.pow(altura, 2);
    }

    public String faixa(){
        double imc = imc();
        if(imc<=18){
            return "Magro";
        }else if(imc <=25){
            return "Normal";
        }else if(imc <= 30){
            return "Obeso grau I";
        }else if(imc <= 38){
            return "Obeso grau II";
        }else{
            return "Obeso grau III";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
