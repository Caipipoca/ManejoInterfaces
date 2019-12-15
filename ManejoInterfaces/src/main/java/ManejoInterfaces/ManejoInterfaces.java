
package ManejoInterfaces;

import datos.*;


public class ManejoInterfaces {
    
    public static void main(String[] args) {
        
        
        AccesoDatos datos = new ImplementacionOracle();
        
        datos.insertar();
        datos.listar();
        
        datos = new ImplementacionMySql();
        
        datos.insertar();
        datos.listar();
      
        
    }
    
    
}
