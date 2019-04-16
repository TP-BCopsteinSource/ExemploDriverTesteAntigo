package com.bcopstein;

public class Cafeteria{
    private int valor;

    public Cafeteria(int v){
        valor = v;
    }

    public void soma(int val){
        //valor += (++val); <== Defeito corrigido
        valor += val;
    }

    public int getValor(){
        return valor;
    }

    public static void main(String args[]){
        Cafeteria c = new Cafeteria(0);

        /*
        c.soma(10);
        if (c.getValor() == 10) System.out.println("Teste 1 OK");
        else System.out.println("Teste 1 Not OK");

        c.soma(15);
        if (c.getValor() == 25) System.out.println("Teste 2 OK");
        else System.out.println("Teste 2 Not OK");

        c.soma(-7);
        if (c.getValor() == 18) System.out.println("Teste 3 OK");
        else System.out.println("Teste 3 Not OK");
        */
        TestaCafeteria.teste1(c);
        TestaCafeteria.teste2(c);
        TestaCafeteria.teste3(c);
    }
}