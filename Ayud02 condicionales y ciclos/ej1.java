import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, mayor;
        System.out.printf("Ingrese el número 1: ");
        num1 = scan.nextInt();
        System.out.printf("Ingrese el número 2: ");
        num2 = scan.nextInt();
        System.out.printf("Ingrese el número 3: ");
        num3 = scan.nextInt();
        mayor = num1;
        if(num2 > mayor){
            mayor = num2;
        }
        if(num3 > mayor){
            mayor = num3;
        }
        System.out.printf("El mayor es: %d\n", mayor);
        scan.close();
    }
}
