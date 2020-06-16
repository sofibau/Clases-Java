package ClaseJava.ClasesNum.Tarea;
import java.util.Scanner;


public class Libro {
    //Atributos
    String titulo;
    String color;
    int numeroDePaginas;
    double calificacion;
    //Constructor
    public Libro (String titulo, String color, int numeroDePaginas){
        this.titulo = titulo;
        this.calificacion = 0;
    
    }
public void getDatos(){
    String [] datoscuriosos = {"Las particulas se comportan como onda y partícula", "Quantum tunneling",
    "Fermiones y bosones", "Potential well","Relatividad"};
    for (int i = 0; i< datoscuriosos.length; i++){
        System.out.println(datoscuriosos[i]);
    }
}
public void calificarLibro(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("¿Qué calificación le das al libro?");
    double nuevaCalificacion = teclado.nextDouble();
    calificacion = calcularAverage(nuevaCalificacion);
}
public double getcalificacion(){
    return calificacion;
}
public void imprimirCalificacion(int verdad){
    System.out.println("El libro" + titulo +  "tiene la califacion de:" + calificacion);
    System.out.println("La verdadera calificación es: " + verdad);

}
private double calcularAverage(double nuevaCalificacion){
    calificacion = (nuevaCalificacion + calificacion)/2;
    return calificacion;
}


}