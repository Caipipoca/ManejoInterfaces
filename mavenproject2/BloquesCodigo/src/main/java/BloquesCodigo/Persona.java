
package BloquesCodigo;


public class Persona {
    
    private final int idPersona;
    private static int contadorPersona;
    
    // Bloque de inicializacion de codigo Statico
   static {
       contadorPersona = 10;
       // no podemos ultilizar variables no estaticas
       //idPersona = 2;
    }
       // inicializacion Bloque no estatico  
   {
       System.out.println("Ejecultando Bloque No estatico");
       this.idPersona = ++ contadorPersona;
   }

    public int getIdPersona() {
        return idPersona;
    }
   
   
}
