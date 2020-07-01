package ClasesJava.Clase8;
import java.lang.Math;
import java.util.function.DoubleSupplier;


public class Linea {
    private PuntoCartesiano punto1;
    private PuntoCartesiano punto2;

    //Atributos

    //Constructor
    public Linea(double x1, double x2, double y1, double y2){
        this.punto1 = new PuntoCartesiano(x1, y1);
        this.punto2 = new PuntoCartesiano(x2,y2);

    }

    public void enseñarPuntos(){
        punto1.imprimirPunto();
        punto2.imprimirPunto();
    }
    public double medirLinea(){
        double catetoOp = Math.abs((punto1.getX()- punto2.getX()));
        double catetoAy = Math.abs(punto1.getY()- punto2.getY());
        double hipotenusa = Math.hypot(catetoAy,catetoOp);
        return hipotenusa; 
    }
    public double calcularPendiente(){
        double gradient = ((punto1.getY()- punto2.getY())/(punto1.getX()- punto2.getX()));
        System.out.println(gradient);
        return gradient;
    }
    public boolean calcularParalela(Linea otraLinea){
        if (calcularPendiente() == otraLinea.calcularPendiente()){
            return true;
        }else{
            return false;
        }
    }
    public boolean calcularPerpendiculares(Linea otraLiena){
        if( (calcularPendiente() * otraLiena.calcularPendiente() == -1 )){
            return true;
        }else{
            
            return false;
        }
    }
}