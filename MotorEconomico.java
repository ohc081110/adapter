/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author OMAR HC
 */
public class MotorEconomico extends motor{

    public MotorEconomico(){
        super();
        System.out.println("Craendo motor economico");
    }
 
    public void encender() {
        System.out.println("Encendiendo motor economico.");
    }
 
    public void acelerar() {
        System.out.println("Acelerando motor economico.");
    }
 
    public void apagar() {
        System.out.println("Apagando motor economico.");
    }
}

