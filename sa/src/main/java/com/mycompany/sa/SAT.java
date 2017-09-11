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
 * @author chris
 */
@WebService(serviceName = "SAT")
public class SAT {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "calcular_Impuesto_Sat")
    public String calcular_Impuesto_Sat(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea, @WebParam(name = "modelo") String modelo) {
        String Salida="";
        return Salida;
    }
    @WebMethod(operationName = "registro_Id_Compra")
    public String registro_Id_Compra(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea, @WebParam(name = "modelo") String modelo) {
        String Salida="";
        return Salida;
    }
}
