package ClaseJava.ClasesNum.Clase4Tarea2;
import java.lang.Math;

public class Clase4Tarea2 {
    public static void main(String Args[]){ 
        hacerCero(5);
}
    int a;
    int b;
    static int PI;


    public Clase4Tarea2(int a, int b){
        this.a = a;
        this.b = b;
    }

    public static void hacerCero(int a){
        while (a > 0){
           int valorDeA = decrementExact(a);
           System.out.println("El valor actual de" + a + "es:" + valorDeA);
        }

    }
    public static void calcularCircunferencia(int b){
        int elevado = (b*b);
        int multiplicacion = multiplyExact(PI, elevado);
        System.out.println("La circurferencia es de" + multiplicacion);

    }
    public static void sumarVectores(double anguloA, double lado1, double anguloB, double lado2 ){
        float componenteX = ( (multiplyExact(sin(anguloA), lado1)) + (multiplyExact(sin(anguloB), lado2)) );
        float componenteY = ( (multiplyExact(cos(anguloA), lado1)) + (multiplyExact(cos(anguloB), lado2)) );
        float vector = sqrt( (Math.pow(componenteX, 2)) + (Math.pow(componenteY, 2)));
        float angulo = atan2(componenteX, componenteY);
        System.out.println("El vector es:" + vector);
        System.out.println("El su ángulo es:" + vector);

    }

	
	private static int decrementExact(int a) {
    }
    private static int multiplyExact(double x, double y) {
    }
    public static double sin(double a){ 
    }
    public static double cos(double a){    
    }
    private static float sqrt(double a) {
	}
    private static float atan2(double y, double x){     
    }
    
}