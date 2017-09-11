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
public class Response_compra_Vehiculo implements Serializable{
    
   private String serie;
   private int numero_Factura;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getNumero_Factura() {
        return numero_Factura;
    }

    public void setNumero_Factura(int numero_Factura) {
        this.numero_Factura = numero_Factura;
    }
   

}
