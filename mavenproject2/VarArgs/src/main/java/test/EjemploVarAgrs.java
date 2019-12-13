
package test;

public class EjemploVarAgrs {
    
    public static void main(String[] args) {
        
        // imrpimimos varios numeros.
        
        imprimirNumeros (15,1,4,6,60);
        
        // Parametros Varios  
        System.out.println("");
        variosParametros ("Juan Carlos", true, 14,2,5);
        
        private static void variosParametros (String nombre, boolean bandera, int... numeros){
        
            System.out.println("numeros = " + numeros);
            System.out.println("bandera = " + bandera);
             
             for (int i = 0; i < numeros.length; i++) {
                 System.out.println("numeros = " + numeros[i]);
            }
        
        }
     
    }    

    private static void imprimirNumeros(int... numeros) {
        
        for (int i = 0; i < numeros.length; i++) {
            int elemento = numeros [i];
            
            System.out.println("elemento = " + elemento);
        }
        
    }
}
