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
        String Salida="{\n" +
                        "\"valor\" : 400\n" +
                        "}";
        return Salida;
    }
    @WebMethod(operationName = "registro_Id_Compra")
    public String registro_Id_Compra(@WebParam(name = "id_Transferencia") int id_Transferencia, @WebParam(name = "monto_Compra") Double monto_Compra) {
        String Salida="";
        return Salida;
    }
    @WebMethod(operationName = "guardar_Manifiesto")
    public String guardar_Manifiesto(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea,@WebParam(name = "modelo") String modelo, @WebParam(name = "fecha_Entrada") String fecha_Entrada, @WebParam(name = "pais_Origen") String pais_Origen) {
        String Salida="";
        return Salida;
    }
    @WebMethod(operationName = "guardar_Declaracion")
    public String guardar_Declaracion(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea,@WebParam(name = "modelo") String modelo, @WebParam(name = "precio") Double precio, @WebParam(name = "fecha_declaracion") String fecha_declaracion) {
        String Salida="";
        return Salida;
    }
}