package ClasesJava.Clase7;

public class Rectangulo {
    int lado;
    int ancho;
    Rectangulo (int lado, int ancho){
        this.lado = lado;
        this.ancho = ancho;
    }
    private void calcularArea(){
        int area = lado*ancho; 
        System.out.println(area);
    }
    public String [][] MergerRectangulo( String punto){
        String [][] rectangulo = new String [lado][ancho];
        for (int i = 0; i < lado; i ++){
            for (int y = 0; y < ancho; y++ ){
                rectangulo[i][y] = punto;
            }   
        }
        return rectangulo;
    }       

    public String [][] MergerRectanguloExtra( String punto){
        String [][] rectangulo = new String [lado][ancho];
        for (int i = 0; i < lado; i ++){
            for (int y = 0; y < ancho; y++ ){
                if (((i==0 || i == lado -1)) || ((y==0 || i == ancho -1))){
                    rectangulo[i][y] = punto;
                
                }   
            }
        } 
        return rectangulo;
              

    }




    
}