package edu.rod.operadores;

public class Operadores {
    public static void main(String[] args) {
        //unario 
        /*
        boolean variavel = true;

        System.out.println(!variavel); //forma de modificar a variavel booleana
        */
        //ternario
        // <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
        int a, b;

        a = 3;
        b = 4;

        String resultado = a > b ? "Papo Reto" : "Caô, cagão";

        System.out.println(resultado);
    }
}
