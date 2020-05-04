/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Matias
 */
public class Directorio {
    Cliente cliente;
    HashMap <Integer, Cliente> directorioTelefonico = new HashMap<>();
    
    public void agregarCliente(int clave, Cliente cliente){
        directorioTelefonico.put(clave, cliente);
    }
    
    public void buscarCliente(int clave){
        System.out.println(directorioTelefonico.get(clave).toString());
    }

    public List<Cliente> buscarTelefono(String apellido){
        ArrayList<Cliente> clientes = new ArrayList<>();
        Set claves = directorioTelefonico.keySet();
        Iterator <Integer> i = claves.iterator();
      
        while (i.hasNext()){
           int c = i.next();
           Cliente cl = directorioTelefonico.get(c);
           if (cl.getApellido().equalsIgnoreCase(apellido)) {
               clientes.add(cl);
           }
    }
        return clientes;
        
    }
    
    public List<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente> clientes = new ArrayList<>();
        Set claves = directorioTelefonico.keySet();
        Iterator <Integer> i = claves.iterator();
        
        while(i.hasNext()){
            int c = i.next();
            Cliente cl = directorioTelefonico.get(c);
            if(cl.getCiudad().equalsIgnoreCase(ciudad)){
                clientes.add(cl);
            }
        }
        return clientes;
    }
    
    public void borrarCliente(int dni){
        int aux;
        Set claves = directorioTelefonico.keySet();
        Iterator<Integer> i = claves.iterator();
        while(i.hasNext()){
            int c = i.next();
            Cliente cl = directorioTelefonico.get(c);
            if(cl.getDni()== dni){
               directorioTelefonico.remove(c);
               break;
            }
        
        }
    }
    
    
}
