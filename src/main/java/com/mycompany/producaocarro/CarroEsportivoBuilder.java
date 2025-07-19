/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocarro;

/**
 *
 * @author Iago R. Oliveira
 */
public class CarroEsportivoBuilder implements CarroBuilder {

    private Carro carro;

    public CarroEsportivoBuilder() {
        this.carro = new Carro();
    }

    @Override
    public void construirMotor() {
        carro.setMotor("Motor V8");
    }

    @Override
    public void construirRodas() {
        carro.setRodas(4);
    }

    @Override
    public void construirGPS() {
        carro.setGPS(true);
    }

    @Override
    public Carro getCarro() {
        return carro;
    }
}
