class persona{
    String nombre;
    int edad;
    public persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
}

public class ejPOO3{
    public static void main(String[] args){
        persona p1 = new persona("Diego Banda", 22);
        persona p2 = new persona("Juanito Perez", 17);
        System.out.printf("¿%s es mayor de edad? %b\n", p1.nombre, p1.esMayorDeEdad());
        System.out.printf("¿%s es mayor de edad? %b\n", p2.nombre, p2.esMayorDeEdad());
    }
}
