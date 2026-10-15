import java.util.Scanner;

class producto{
    String nombre;
    double precio;
    int stock;
    public producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public double valorInventario(){
        return precio * (double) stock;
    }
}

public class ejPOO4{
    public static double precioTotal(producto[] tienda){
        double total = 0;
        for(int i = 0 ; i < tienda.length ; i++){
            total += tienda[i].valorInventario();
        }
        return total;
    }
    //  También se puede hacer recursivo jeje
    public static double recursivePrecioTotal(producto[] tienda, int i){
        if(i >= tienda.length) return 0;
        return tienda[i].valorInventario() + recursivePrecioTotal(tienda, i+1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese cantidad de productos: ");
        producto[] tienda = new producto[scan.nextInt()];
        for(int i = 0 ; i < tienda.length ; i++){
            scan.nextLine();
            System.out.printf("=== Producto %d ===\n", i);
            System.out.printf("Ingrese nombre: ");
            String nombre = scan.nextLine();
            System.out.printf("Ingrese precio: ");
            double precio = scan.nextDouble();
            System.out.printf("Ingrese stock: ");
            int stock = scan.nextInt();
            tienda[i] = new producto(nombre, precio, stock);
        }
        System.out.printf("Precio de stock total: %.2f (iterativo)\n", precioTotal(tienda));
        System.out.printf("Precio de stock total: %.2f (recursivo)\n", recursivePrecioTotal(tienda, 0));
        scan.close();
    }
}
