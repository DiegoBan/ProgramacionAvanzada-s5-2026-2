import java.util.Scanner;

public class ej5a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nombre;
        int edad;
        double estatura;
        System.out.printf("Ingrese su nombre: ");
        nombre = scan.nextLine();
        System.out.printf("Ingrese su edad: ");
        edad = scan.nextInt();
        System.out.printf("Ingrese su estatura: ");
        estatura = scan.nextDouble();
        System.out.printf("Hola %s, tu edad es %d y mides %.2f metros\n", nombre, edad, estatura);
        scan.close();
    }
}
