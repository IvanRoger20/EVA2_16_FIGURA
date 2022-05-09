/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_16_figuras;

/**
 *
 * @author invitado
 */
public class Circulo extends Figura{
    private double Radio;

    public Circulo(double Radio) {
        this.Radio = Radio;
    }

    public Circulo() {
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    @Override
    public double calcularArea(){
        return (Math.PI * Math.pow(Radio, 2));
    }
    
    
}
