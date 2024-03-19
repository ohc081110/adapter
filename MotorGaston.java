/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

/**
 *
 * @author OMAR HC
 */
public class MotorGaston extends motor {
  public MotorGaston(){
        super();
        System.out.println("Creando el motor gaston");
    }
 
    public void encender() {
        System.out.println("Bum, bum....encendiendo motor gaston");
    }
 
    public void acelerar() {
        System.out.println("Buuuuuuuuuuuum, acelerando y gastando muuuucha gas");
    }
 
    public void apagar() {
        System.out.println("Apagando motor gaston");
    }  
    
}
