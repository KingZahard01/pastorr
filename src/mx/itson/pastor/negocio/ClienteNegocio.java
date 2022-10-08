/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pastor.negocio;

import mx.itson.pastor.persistencia.ClienteD;

/**
 *
 * @author juanj
 */
public class ClienteNegocio {
    public static boolean guardar(String nombre, String direccion, String telefono, String email){
        boolean resultado = false;
        try {
            if(!ClienteD.verificarExistencia(email)) {
                resultado = ClienteD.guardar(nombre, direccion, telefono, email);
            }
        } catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        
        return resultado;
    }
}
