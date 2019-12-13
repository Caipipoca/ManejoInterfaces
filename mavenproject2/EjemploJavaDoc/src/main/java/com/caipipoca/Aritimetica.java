
package com.caipipoca;

/**  
 * Esta Clase permite realizar operaciones de aritimetica sumar, restar, etc.
 * 
 * @author caipipoca
 * 
 * 
 */
public class Aritimetica {
    
 /**
  * Primer Operando
  */   
    
    int operandoA;
    
    /**
     * OperandoB
     *
     */
    int operandoB;
    
    
    /**
     * Constructor vacio
     * 
     */
    
    public Aritimetica (){
  
    }

    /**
     * 
     * @param operandoA es el primer Operando
     * @param operandoB es el segundo Operando
     */
    
    
    public Aritimetica(int operandoA, int operandoB) {
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    
    
    
    
    /**
     * este metodo realiza la suma de dos operando enteros
     * 
     * @return int resultado de la suma
     */
    
    public int sumar (){
    
    return this.operandoA + this.operandoB;
        
    }
    
}




