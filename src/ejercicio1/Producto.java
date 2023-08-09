
package ejercicio1;

public class Producto {
    private String descripcion;
    private double precio;
    private int stock;
    
    public Producto(String descripcion,double precio,int stock){
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public void setStock(int stock){
        this.stock=stock;
    }
}
