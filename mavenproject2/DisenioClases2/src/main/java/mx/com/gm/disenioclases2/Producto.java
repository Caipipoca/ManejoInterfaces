
package mx.com.gm.disenioclases2;

public class Producto {

    public static int getContadorProducto() {
        return contadorProducto;
    }

    public static void setContadorProducto(int aContadorProducto) {
        contadorProducto = aContadorProducto;
    }
    
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
    
    this.idProducto = contadorProducto++;
    
    }
     public Producto (String nombre, double precio){
     
         this();
         this.nombre = nombre;
         this.precio = precio;
     
     }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
     
}
