package com.bcopstein;

public class TestaCafeteria{
    public static void teste1(Cafeteria c){
        c.soma(10);
        if (c.getValor() == 10) System.out.println("Teste 1 OK");
        else System.out.println("Teste 1 Not OK");
    }

    public static void teste2(Cafeteria c){
        c.soma(15);
        if (c.getValor() == 25) System.out.println("Teste 2 OK");
        else System.out.println("Teste 2 Not OK");
    }

    public static void teste3(Cafeteria c){
        c.soma(-7);
        if (c.getValor() == 18) System.out.println("Teste 3 OK");
        else System.out.println("Teste 3 Not OK");
    }
}