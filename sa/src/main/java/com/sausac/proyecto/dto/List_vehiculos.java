/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sausac.proyecto.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author Erick Sandoval (kerikeden29@gmail.com)
 */
public class List_vehiculos implements Serializable{
    private List<Vehiculos> vehiculos;

    public List<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

}
