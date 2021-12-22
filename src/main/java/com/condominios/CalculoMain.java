package com.condominios;

import java.util.Scanner;

public class CalculoMain {

    public static void calculoCondomino() {

        Blocos bloco1 = new Blocos();
        Apartamentos apartamento = new Apartamentos();
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Despesas Condominio\n ---------------");

            System.out.println("Digite a área do bloco : ");
            double areaBloco = entrada.nextDouble();
            bloco1.setArea(areaBloco);

            System.out.println("Digite o gasto total do bloco : R$ ");
            double gastosBloco = entrada.nextDouble();
            bloco1.setGastosTotais(gastosBloco);

            System.out.println("Digite a área do apartamento que deseja calcular o condominio");
            double areaApartamento = entrada.nextDouble();
            apartamento.setArea(areaApartamento);
        }

        String resultado = String.format("O valor do condominio para o apartamento digitado é: R$ %.2f",
                apartamento.valorCondominio(bloco1));
        System.out.println(resultado);

    }

    public static void main(String[] args) {

        calculoCondomino();
    }
}
