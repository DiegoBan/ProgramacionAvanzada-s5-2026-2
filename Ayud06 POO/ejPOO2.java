import java.util.Scanner;

class rectangulo{
    double base;
    double altura;
    public rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea(){
        return base*altura;
    }
    public void printInfo(){
        System.out.printf("base: %.2f\naltura: %.2f\narea: %.2f\n", base, altura, calcularArea());
    }
}

public class ejPOO2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double base, altura;
        System.out.printf("Ingrese base de rectangulo: ");
        base = scan.nextDouble();
        System.out.printf("Ingrese altura de rectangulo: ");
        altura = scan.nextDouble();
        rectangulo rect = new rectangulo(base, altura);
        rect.printInfo();
        scan.close();
    }
}
