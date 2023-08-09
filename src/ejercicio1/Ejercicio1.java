package ejercicio1;


public class Ejercicio1 {

    public static void main(String[] args) {
        Producto producto1=new Producto("Collar",82.99,3);
        System.out.println("El producto es un "+producto1.getDescripcion());
        System.out.println("Su precio es "+producto1.getPrecio());
        System.out.println("Tenemos en stock "+producto1.getStock());
    }
    
}
