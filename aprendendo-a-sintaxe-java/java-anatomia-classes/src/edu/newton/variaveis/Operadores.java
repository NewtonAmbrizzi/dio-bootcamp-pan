package edu.newton.variaveis;

public class Operadores {

    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("Ambas verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições verdadeira");
        }
    }

}