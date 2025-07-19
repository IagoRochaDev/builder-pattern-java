/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producaocarro;

/**
 *
 * @author Iago R. Oliveira
 */
public class Carro {

    private String motor;
    private int rodas;
    private boolean GPS;

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Carro [Motor=" + motor + ", Rodas=" + rodas + ", GPS=" + GPS + "]";
    }
}
