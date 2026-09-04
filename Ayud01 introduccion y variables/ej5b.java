import java.util.Scanner;

public class ej5b {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, n4;
        System.out.printf("Ingrese la primera nota: ");
        n1 = scan.nextDouble();
        System.out.printf("Ingrese la segunda nota: ");
        n2 = scan.nextDouble();
        System.out.printf("Ingrese la tercera nota: ");
        n3 = scan.nextDouble();
        System.out.printf("Ingrese la cuarta nota: ");
        n4 = scan.nextDouble();
        double promedio = (n1 + n2 + n3 + n4) / 4;
        System.out.printf("\nPromedio: %.2f\n", promedio);
        if(promedio < 4){
            System.out.println("Reprobado");
        } else {
            System.out.println("Aprobado");
        }
        scan.close();
    }
}
