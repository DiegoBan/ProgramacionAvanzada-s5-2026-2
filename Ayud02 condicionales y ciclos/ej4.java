import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, aux;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        System.out.printf("Ingrese un numero: ");
        x = scan.nextInt();
        while(x > 0){
            System.out.printf("Ingrese un numero: ");
            aux = scan.nextInt();
            if(aux > 0) {
                contadorPositivos++;
            } else if(aux < 0) {
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
            x--;
        }
        System.out.printf("Positivos: %d\nNegativos: %d\nCeros: %d\n", contadorPositivos, contadorNegativos, contadorCeros);

        scan.close();
    }
}
