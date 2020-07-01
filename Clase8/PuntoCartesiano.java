package ClasesJava.Clase8;

public class PuntoCartesiano {
    double x;
    double y ;
    //Atributos:

    //Constructor
    public PuntoCartesiano(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    void imprimirPunto(){
        System.out.println("(" + x + "," + y+ ")");
    }
    //Getters
     

}