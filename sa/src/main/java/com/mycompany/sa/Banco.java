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
        int numero = (int) (Math.random() * 4) + 1;
        switch(numero){
            case 1:{
                Salida="{\n" +
                        "\"id_Transferecia\":\"30004999\",\n" +
                        "\"respuesta\": \"true\",\n" +
                        "\"detalle_Transferencia\": \"transferencia exitosa\"\n" +
                        "}";
                break;
            }
            case 2:{
                Salida="{\n" +
                        "\"id_Transferecia\":\"-1\",\n" +
                        "\"respuesta\": \"fase\",\n" +
                        "\"detalle_Transferencia\":\"transferencia fallo\"\n" +
                        "}";
                break;
            }
            case 3:{
                Salida = "{\n" +
                        "\"id_Transferecia\":\"-1\",\n" +
                        "\"respuesta\":\"false\",\n" +
                        "\"detalle_Transferencia\":\"saldo insuficiente\"\n" +
                       "}";
                break;
            }
            case 4:{
                Salida ="{\n" +
                        "\"id_Transferecia\":\"-1\",\n" +
                        "\"respuesta\": \"false\",\n" +
                        "\"detalle_Transferencia\":\"cuenta inexistente\"\n" +
                        "}";
                break;
            }
        }
        return Salida;
    }
}
