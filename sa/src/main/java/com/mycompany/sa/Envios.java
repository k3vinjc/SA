/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sa;

import com.sausac.proyecto.dto.List_vehiculos;
import com.sausac.proyecto.dto.Vehiculos;
import java.io.IOException;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;

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
    public String cargar_Vehiculos() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationConfig.Feature.DEFAULT_VIEW_INCLUSION, false);
        ArrayList<Vehiculos> datosl = new ArrayList<>();
        List_vehiculos retorno = new List_vehiculos();
        Vehiculos datos = new Vehiculos();
        datos.setId_Vehiculo(300);
        datos.setMarca("Toyota");
        datos.setLinea("Yaris");
        datos.setModelo(2010);
        
        datosl.add(datos);
        datos = new Vehiculos();
        datos.setId_Vehiculo(402);
        datos.setMarca("Chevrolet");
        datos.setLinea("Suburban");
        datos.setModelo(2017);
        datosl.add(datos);
        datos = new Vehiculos();
        datos.setId_Vehiculo(412);
        datos.setMarca("Chevrolet");
        datos.setLinea("Tahoe");
        datos.setModelo(2016);
        datosl.add(datos);
        retorno.setVehiculos(datosl);
        String jsonStr = mapper.writeValueAsString(retorno);
        return jsonStr;
    }
    @WebMethod(operationName = "calcular_Costo_Viaje")
    public String calcular_Costo_Viaje(@WebParam(name = "pais_Origen") String pais_Origen, @WebParam(name = "pais_Destino") String pais_Destino, @WebParam(name = "peso") Double peso) {
        String Salida="{\n" +
                " \"costo_viaje\" : 600\n" +
                "}";
        return Salida;
    }
    @WebMethod(operationName = "guardar_Transferencia")
    public String guardar_Transferencia(@WebParam(name = "id_Transferencia") int id_Transferencia, @WebParam(name = "monto") Double monto) {
        String Salida="";
        if(id_Transferencia != 0 && monto != 0){
            Salida = "\"respuesta\" : \"true\"";
        }else{
            Salida = "\"respuesta\" : \"false\"";
        }
        return Salida;
    }
}
