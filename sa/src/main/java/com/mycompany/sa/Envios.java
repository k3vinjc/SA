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
@WebService(serviceName = "Envios")
public class Envios {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "cargar_Vehiculos")
    public String cargar_Vehiculos() {
        String Salida="";
        return Salida;
    }
    @WebMethod(operationName = "calcular_Costo_Viaje")
    public String calcular_Costo_Viaje(@WebParam(name = "pais_Origen") String pais_Origen, @WebParam(name = "pais_Destino") String pais_Destino, @WebParam(name = "peso") Double peso) {
        String Salida="";
        return Salida;
    }
    @WebMethod(operationName = "guardar_Transferencia")
    public String guardar_Transferencia(@WebParam(name = "id_Transferencia") int id_Transferencia, @WebParam(name = "monto") Double monto) {
        String Salida="";
        return Salida;
    }
}
