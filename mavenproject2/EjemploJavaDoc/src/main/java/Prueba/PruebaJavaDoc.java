//este comentario no es Java Doc. derechos
// Reservados caipipoca.

package Prueba;

import com.caipipoca.Aritimetica;

/**
 * Clase para probar java Doc
 * @author caipipoca
 */
public class PruebaJavaDoc {
    
    
    /**
     * Metodo que ejecuta la prueba de la clase Artitimetica
     * @param args es un arreglo del tipo string de la linea de comandos.
     * 
     * 
     */
    
    public static void main(String[] args) {
        
        Aritimetica aritimetica1 = new Aritimetica(3,2);
        
        int resultado = aritimetica1.sumar();
        
        System.out.println("El Resultado de la Suma es: " +resultado);
    }
    
    
    
    
}
