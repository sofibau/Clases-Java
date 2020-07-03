package ClasesJava.Clase8;

public class notMain {
    public static void main(String[] args) {

        PuntoCartesiano PuntoCartesiano = new PuntoCartesiano(4,5);
        Triangulo triangulo = new Triangulo(0,0,2,0,4,0);
        Cuadrilatero cuadrilatero = new Cuadrilatero(1, 0, 1, 3, 3, 0, 3, 3);
        Linea linea1 = new Linea(1,2,4,9);
        Linea linea2 = new Linea(3,4,8,-2);
        PuntoCartesiano plano;

        PuntoCartesiano.imprimirPunto();
        triangulo.enseñarPuntosL();
        triangulo.show();

        cuadrilatero.show();

     
      
    


        /**
         * Ejercicio 4:
         * * Crea la clase Cuadrado
         * * Incluye los métodos especificados
         * Comprueba que funciona creando un objeto del tipo
         * Muestra su área y su tipo
         * Si es un cuadrado, haz que se dibuje, ocupando el programa de
         * la clase pasada
         */
    }
}