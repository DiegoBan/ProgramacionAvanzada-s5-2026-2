class libro{
    String titulo;
    String autor;
    int anioPublicacion;
    double precio;
    public libro(){}
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion){
        this.anioPublicacion = anioPublicacion;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
}

public class ejPOO{
    public static void main(String[] args){
        //  Ejemplos de uso
        libro n = new libro();
        n.setTitulo("Erase una vez un algoritmo");
        n.setAutor("Martin Erwig");
        n.setAnioPublicacion(2025);
        n.setPrecio(10000);
        System.out.printf("Nombre: %s\nPrecio: %.2f\n", n.getTitulo(), n.getPrecio());
    }
}
