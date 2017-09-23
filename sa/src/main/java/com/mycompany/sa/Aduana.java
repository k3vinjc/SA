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
    //Comentario
    ///Esta es una linea extra
    // Otra Linea
    @WebMethod(operationName = "calcular_Costo_Aduana")
    public String calcular_Costo_Aduana(@WebParam(name = "marca") String marca, @WebParam(name = "linea") String linea, @WebParam(name = "modelo") String modelo) {
        String Salida="TODO";
        if(!marca.equals("") && !linea.equals("") && !modelo.equals("")){
            Salida = "{\n" +
                       "\"costo_Aduana\":135.57\n" +
                      "}";
        }else{
            Salida = "{\n" +
                       "\"costo_Aduana\":-1\n" +
                      "}";
        }
        return Salida;
    }
    
    @WebMethod(operationName = "guardar_Id_Transferencia")
    public String guardar_Id_Transferencia(@WebParam(name = "id_Transferencia") int id_Transferencia, @WebParam(name = "monto_Compra") double monto_Compra) {
        String Salida="TODO";
        if(id_Transferencia !=0 && monto_Compra != 0){
            Salida = "{\n" +
                        "\"respuesta\":\"true\"\n" +
                       "}";
        }else{
            Salida = "{\n" +
                        "\"respuesta\":\"false\"\n" +
                       "}";
        }
        return Salida;
    }
}
