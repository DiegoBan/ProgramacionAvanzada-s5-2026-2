// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        /*
        En las peleas de Pakomones Es muy importante la velocidad de estos, debido a que
        los mas rapidos siempre atacan de los primeros, pero existe una habilidad especial que
        cambia eso llamada Espacio raro la cual intercambia las velocidades de los pokemones,
        es por esto que usted debe crear un programa que reciba los siguiente 2 arreglos y diga
        en cada una de las peleas cual es el mas rapido antes y despues de usar Espacio raro
        he intercambie los datos de velocidad para mostrar como se ven las velocidades de los
        pakomones antes y despues del uso de la habilidad.
        Equipo1 = { 77, 156, 100, 80, 120, 99 }
        Equipo2 = { 95, 120, 150, 55, 119, 80}
        asuma que los pakomones no se podran cambiar en plena pelea, osea, el pakomon del
        equipo1[0] solo podra pelear con el del equipo2[0] y asi con los de
        */

        int Equipo1[]= {77,156,100,80,120,99};
        int Equipo2[]= {95,120,150,55,119,80};

        System.out.println("====Pakomon más rapidos pre espacio raro====");

        for(int i=0; i<Equipo1.length;i++){
            if(Equipo1[i]>Equipo2[i]){
                System.out.println("El pakomon del equipo 1 "+Equipo1[i]+" es el más rápido");
            }
            else{
                System.out.println("El pakomon del equipo 2 "+Equipo2[i]+" es el más rápido");
            }
        }

        System.out.println("====Pakomon más rapidos pre espacio raro====");
        for(int i=0; i<Equipo1.length;i++){
            if(Equipo1[i]>Equipo2[i]){
                System.out.println("El pakomon del equipo 2 "+Equipo2[i]+" es el más rápido");
            }
            else{
                System.out.println("El pakomon del equipo 1 "+Equipo1[i]+"es el más rápido");
            }
        }


    }
}