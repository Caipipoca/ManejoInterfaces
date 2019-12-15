
package datos;


public interface AccesoDatos {
    
    public int MAX_REGISTROS = 10;
    
    
    // public abstract void insertar();   compilador agrega los modificadores
    
    void insertar ();
    
    // listar (); si lo definimos asi el compilador agregara los modificadores
    // ocultos como el ejemplo acima
    
    public abstract void listar ();
    
}
