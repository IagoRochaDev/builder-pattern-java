/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.producaocarro;

/**
 *
 * @author Iago R. Oliveira
 */
public interface CarroBuilder {
    void construirMotor();
    void construirRodas();
    void construirGPS();
    Carro getCarro();
}
