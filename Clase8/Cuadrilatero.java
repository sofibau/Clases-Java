package ClasesJava.Clase8;

public class Cuadrilatero {
    private PuntoCartesiano punto1;
    private PuntoCartesiano punto2;
    private PuntoCartesiano punto3;
    private PuntoCartesiano punto4;
    Linea arista12;
    Linea arista13;
    Linea arista24;
    Linea arista34;

    public Cuadrilatero(double x1, double x2, double x3, double x4,double y1, double y2, double y3, double y4){
        this.punto1 = new PuntoCartesiano(x1,y1);
        this.punto2 = new PuntoCartesiano(x2,y2);
        this.punto3 = new PuntoCartesiano(x3,y3);
        this.punto4 = new PuntoCartesiano(x4,y4);
        this.arista12 = new Linea(punto1, punto2);
        this.arista13 = new Linea(punto1, punto3);
        this.arista24 = new Linea(punto2, punto4);
        this.arista34 = new Linea(punto3, punto4);
    }



    public tipoDeCuadrilatero(){
        
    }
    public double [] ubicarCuadrilatero(){
        int ladosIguales = 0;
        double [] Arrlineas = {arista12.medirLinea(),arista13.medirLinea(),arista24.medirLinea(),arista34.medirLinea()};
           for (int i; i = 0; i++ ){
               for(int y; y = 0; y++ ){
                    if (Arrlineas[i] == Arrlineas[y]){
                        ladosIguales ++;
                    }
               }
           }
        if (ladosIguales == 4){
            System.out.println("Es rectángulo");
            return true;
        }else if ((ladosIguales == ))

        
    }

    public double calcularAreaRec(){
    
        double perimetro = arista12.medirLinea() + arista13.medirLinea() + arista24.medirLinea() + arista24.medirLinea();
        return perimetro;
    }

    public double calcularAreaCuadrado(){
        Linea arista12 = Linea(punto1, punto2);
        double perimetro = arista12.medirLinea() * 4;
        return perimetro;
    }
    
    /**
     * Método para saber si es un cuadrado
     * Método para saber si es un rectángulo
     * Método para saber si es irregular
     * Método para saber su área
     * Método para conocer su perímetro
     */
    
    
    
    
    
}