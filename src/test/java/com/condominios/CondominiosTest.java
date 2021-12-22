package com.condominios;

public class CondominiosTest {
    
    private Blocos bloco1;
    private Apartamentos apartamentos;

    public void testValorCondominios(){
        bloco1 = new Blocos(20.000, 10.000);
        apartamentos = new Apartamentos(360);


        double resultadoEsperado = 180.0;

        double resultado = apartamentos.valorCondominio(bloco1);

        if (resultado == resultadoEsperado) {
            System.out.println("Teste OK");
        } else {
            System.out.println("Teste Falhou =/");
        }

        


    }
    
}

