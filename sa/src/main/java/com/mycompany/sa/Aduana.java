/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author christianescobar
 */
@WebService(serviceName = "Aduana")
public class Aduana {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calcular_Costo_Aduana")
    public String calcular_Costo_Aduana(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea, @WebParam(name = "modelo") String modelo) {
        String Salida="";
        return Salida;
    }
    
    @WebMethod(operationName = "guardar_Id_Transferencia")
    public String guardar_Id_Transferencia(@WebParam(name = "id_Transferencia") String id_Transferencia, @WebParam(name = "monto_Compra") String monto_Compra) {
        String Salida="";
        return Salida;
    }
}
