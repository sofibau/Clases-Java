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


    public Cuadrilatero(double x1, double y1, double x2, double y2,double x3, double y3, double x4, double y4){
        this.punto1 = new PuntoCartesiano(x1,y1);
        this.punto2 = new PuntoCartesiano(x2,y2);
        this.punto3 = new PuntoCartesiano(x3,y3);
        this.punto4 = new PuntoCartesiano(x4,y4);
        this.arista12 = new Linea(punto1, punto2);
        this.arista13 = new Linea(punto1, punto3);
        this.arista24 = new Linea(punto2, punto4);
        this.arista34 = new Linea(punto3, punto4);
    }

    public String ubicarCuadrilatero(){
        int ladosIguales = 0;
        double [] Arrlineas = {arista12.medirLinea(),arista13.medirLinea(),arista24.medirLinea(),arista34.medirLinea()};
        for (int i = 0; i < Arrlineas.length; i++)
            System.out.println("un lado mide " + Arrlineas[i]);

        
        for (int s = 0; s < Arrlineas.length -1 ; s++ ){
                if (Arrlineas[s] == Arrlineas[s+1]){
                    ladosIguales ++;
                }
            }
            if (ladosIguales == 1){
                System.out.println("Es rectángulo");
                return "rectangulo";
            }else if ((ladosIguales == 3 )){
                System.out.println("Es cuadrado");
                return "cuadrado";
            }else{
                System.out.println("Es irregular");
                return "irregular";
            }
        }

    

    public double calcularPerimetroRectangulo(){
        double perimetro = arista12.medirLinea() + arista13.medirLinea() + arista24.medirLinea() + arista24.medirLinea();
        return perimetro;
    }

    public double calcularPerimetroCuadrado(){
        double perimetro = arista12.medirLinea() * 4;
        return perimetro;
    }
    public double calcularAreaCuadrado(){
        double area = arista12.medirLinea() * arista12.medirLinea();
        return area;
    }

    public double calcularAreaRectangulo(){
        double [] Arrlineas = {arista12.medirLinea(),arista13.medirLinea(),arista24.medirLinea(),arista34.medirLinea()};
        double area1 = 0;
        for (int s = 0; s < Arrlineas.length -1 ; s++ ){
            if (Arrlineas[s] > Arrlineas[s+1]){
            area1 = ((Arrlineas[s])* (Arrlineas[s+1]))/2;
        return area1;
                
            }
        }
        return area1;
    }
    public void show(){
        if (ubicarCuadrilatero() .equals( "rectangulo")){
            System.out.println("Su area es " + calcularAreaRectangulo());
            System.out.println("Su perimetro es " + calcularPerimetroRectangulo());
        }else if (ubicarCuadrilatero() .equals("cuadrado")){
            System.out.println("Su area es " + calcularAreaCuadrado());
            System.out.println("Su perimetro es " + calcularPerimetroCuadrado());

        }else{
            if (ubicarCuadrilatero() .equals( "irregular")); 
        }
    }

        
    
    /**
     * Método para saber si es un cuadrado
     * Método para saber si es un rectángulo
     * Método para saber si es irregular
     * Método para saber su área
     * Método para conocer su perímetro
     */
    
    
    
    
    
}