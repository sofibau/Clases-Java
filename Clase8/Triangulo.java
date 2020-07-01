package ClasesJava.Clase8;

public class Triangulo {
    private Linea verticeA;
    private Linea verticeB;
    private Linea verticeC;
    double aristaAB; 
    double aristaAC;
    double aristaBC;

    //Atributos

    //Constructor
    public Triangulo (double x1, double x2, double x3, double y1, double y2, double y3){
        this.verticeA = new Linea(x1,x2,y1,y2);
        this.verticeB = new Linea(x1,x3,y1,y3);
        this.verticeC = new Linea(x2,x3,y2,y3);
        this.aristaAB = verticeA.medirLinea();
        this.aristaAC = verticeB.medirLinea();
        this.aristaBC = verticeC.medirLinea();
   

    }
    public boolean verificarEquilatero(){
        if ((aristaAB == aristaAC ) && (aristaAB == aristaBC) && (aristaAC == aristaBC)){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarRectangulo(){
        if ((verticeA.calcularPerpendiculares(verticeB) == true ) || (verticeC.calcularPerpendiculares(verticeA) == true ) || (verticeB.calcularPerpendiculares(verticeC) == true )){
            return true;
        }else{
            return false;
        }
    }
    public boolean verificarIsoceles(){
        if ((aristaAB == aristaAC ) || (aristaAB== aristaBC) || (aristaAC  == aristaBC)){
            return true;
        }else{
            return false;
        }   
    }
    public boolean verificarEscaleno(){
        if ((aristaAB != aristaAC ) && (aristaAB != aristaBC) && (aristaAC  != aristaBC)){
            return true;
        }else{
            return false;
        }
    }
    public double calcularPerimetro(){
       double perimetro = aristaAB + aristaBC + aristaAC ;
       return perimetro;
    }
 
    public double calcularAreaTriangulo(){
        //#Jerarquía de operaciones!!!
        double s = (aristaAB+aristaAC+aristaBC)/2;
        double area = Math.sqrt(s*(s-aristaAB)*(s-aristaAC)*(s-aristaBC));
        return area;
    }
    public void enseñarPuntosL(){
        verticeA.enseñarPuntos();
        verticeB.enseñarPuntos();
        verticeC.enseñarPuntos();
    }
public void show(){
    if ((verificarIsoceles() == true) && (verificarRectangulo() == true)){
        System.out.println("El triángulo es equilatero y recto ");
    }else if ((verificarEscaleno() == true) && (verificarRectangulo() == true)){
        System.out.print("El triángulo es escaleno y recto ");
    }
    else if (verificarEquilatero() == true){
        System.out.println("El triángulo es equilatero ");
    }else if (verificarIsoceles() == true){
        System.out.print("El triángulo es isósceles ");
    }else if (verificarEscaleno() == true){
        System.out.print("El triángulo es escaleno ");
    }else if (verificarRectangulo() == true){
        System.out.print("El triángulo es recto ");
    }else{
        System.out.print("El triángulo es desconocido");
    }

    System.out.println("El area del triángulo es " + calcularAreaTriangulo() );
    System.out.println("El perimetro del triángulo es " + calcularPerimetro() );
   

}



    /**
     * Método para saber si es equilatero
     * Método para saber si es rectángulo
     * Método para saber si es isóceles
     * Método para saber si es escaleno
     * Método para saber su área
     * Método para conocer su perímetro
     */
    
}