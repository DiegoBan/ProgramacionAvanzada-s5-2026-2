import java.util.Scanner;

class cuentaBancaria{
    String titular;
    int numeroCuenta;
    double saldo;
    public cuentaBancaria(String titular, int numeroCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0; //  Se puede definir un numero por defecto
    }
    public void depositar(double monto){
        this.saldo += monto;
    }
    public void printInfo(){
        System.out.printf("Titular: %s\nnumeroCuenta: %d\nsaldo: %.2f\n", titular, numeroCuenta, saldo);
    }
}

public class ejPOO1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        cuentaBancaria banChile = new cuentaBancaria("Diego Banda", 129311);
        banChile.printInfo();
        System.out.printf("Ingrese monto a depositar: ");
        double ingreso = scan.nextDouble();
        banChile.depositar(ingreso);
        banChile.printInfo();
        scan.close();
    }
}
