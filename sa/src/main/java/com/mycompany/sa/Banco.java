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
@WebService(serviceName = "Banco")
public class Banco {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "transferencia_Cuenta")
    public String transferencia_Cuenta(@WebParam(name = "cuenta_Origen") String cuenta_Origen, @WebParam(name = "cuenta_Destino") String cuenta_Destino, @WebParam(name = "monto") double monto) {
        String Salida="";
        return Salida;
    }
}
