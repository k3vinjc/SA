/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sausac.proyecto.dto;

import java.io.Serializable;

/**
 * 
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
public class Response_Cotizacion implements Serializable{
    
    private int precio_Vehiculo;
    private int precio_Envio;
    private double impuesto_Sat;
    private double impuesto_Aduana;
    private double Iva;
    private double Isr;

    public int getPrecio_Vehiculo() {
        return precio_Vehiculo;
    }

    public void setPrecio_Vehiculo(int precio_Vehiculo) {
        this.precio_Vehiculo = precio_Vehiculo;
    }

    public int getPrecio_Envio() {
        return precio_Envio;
    }

    public void setPrecio_Envio(int precio_Envio) {
        this.precio_Envio = precio_Envio;
    }

    public double getImpuesto_Sat() {
        return impuesto_Sat;
    }

    public void setImpuesto_Sat(double impuesto_Sat) {
        this.impuesto_Sat = impuesto_Sat;
    }

    public double getImpuesto_Aduana() {
        return impuesto_Aduana;
    }

    public void setImpuesto_Aduana(double impuesto_Aduana) {
        this.impuesto_Aduana = impuesto_Aduana;
    }

    public double getIva() {
        return Iva;
    }

    public void setIva(double Iva) {
        this.Iva = Iva;
    }

    public double getIsr() {
        return Isr;
    }

    public void setIsr(double Isr) {
        this.Isr = Isr;
    }
    

}
