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
public class Response_data implements Serializable{
    private String respuesta;

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
