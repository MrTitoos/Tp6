/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

/**
 *
 * @author Matias
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente male = new Cliente("male", "Arrieta",321,"Union", "F. Alonzo 60");
        Cliente homero = new Cliente("Homer", "Simpsons",322,"Springfield", "Av Siempreviva 123");
        Cliente tito = new Cliente("Mati", "Arrieta", 455, "Union", "F. Alonzo 60");
        Directorio DirectorioTelefonos = new Directorio();
        DirectorioTelefonos.agregarCliente(255456, male);
        DirectorioTelefonos.agregarCliente(255457, tito);
        System.out.println(DirectorioTelefonos.buscarClientes("union"));
        DirectorioTelefonos.agregarCliente(255450, homero);
        DirectorioTelefonos.borrarCliente(321);
        System.out.println(DirectorioTelefonos.buscarClientes("union"));
        
        

        
        
        
        
        
        
    }
    
}
