/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocarro;

/**
 *
 * @author Iago R. Oliveira
 */
public class Diretor {

    public void construtorCarroEsportivo(CarroBuilder builder) {
        builder.construirMotor();
        builder.construirRodas();
        builder.construirGPS();
    }
}
