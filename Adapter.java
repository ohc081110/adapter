/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adapter;

/**
 *
 * @author OMAR HC
 */
public class Adapter {

    public static void main(String[] args) {
        motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        
        motor = new MotorGaston();
        motor.encender();
        motor.acelerar();
        motor.apagar();
        
        motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }
}
