/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.producaocarro;

/**
 *
 * @author Iago R. Oliveira
 */
public class ProducaoCarro {

    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        CarroEsportivoBuilder builder = new CarroEsportivoBuilder();
        diretor.construtorCarroEsportivo(builder);
        Carro carro = builder.getCarro();
        System.out.println(carro);
    }
}
