/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sausac.proyecto.dto;

/**
 * 
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
public class Request_compra_Vehiculo {
    
    private int id_Cliente;
    private String no_Tarjeta;
    private int id_Vehiculo;
    private double precio_Vehiculo;
    private double precio_Envio;
    private double impuesto_Sat;
    private double impuesto_Aduana;
    private double iva;
    private double isr;

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getNo_Tarjeta() {
        return no_Tarjeta;
    }

    public void setNo_Tarjeta(String no_Tarjeta) {
        this.no_Tarjeta = no_Tarjeta;
    }

    public int getId_Vehiculo() {
        return id_Vehiculo;
    }

    public void setId_Vehiculo(int id_Vehiculo) {
        this.id_Vehiculo = id_Vehiculo;
    }

    public double getPrecio_Vehiculo() {
        return precio_Vehiculo;
    }

    public void setPrecio_Vehiculo(double precio_Vehiculo) {
        this.precio_Vehiculo = precio_Vehiculo;
    }

    public double getPrecio_Envio() {
        return precio_Envio;
    }

    public void setPrecio_Envio(double precio_Envio) {
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
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getIsr() {
        return isr;
    }

    public void setIsr(double isr) {
        this.isr = isr;
    }
    

}
