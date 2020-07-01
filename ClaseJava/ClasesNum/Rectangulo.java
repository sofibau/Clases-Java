package ClaseJava.ClasesNum;


public class Rectangulo{
    public static void main(String Args[]){ 
        Rectangulo rectangulo = new Rectangulo(3,4);
        rectangulo.Dibujar("*");
        rectangulo.calcularArea();

}
    int lado;
    int ancho;
    private Rectangulo (int lado, int ancho){
        this.lado = lado;
        this.ancho = ancho;
    }
    private void calcularArea(){
        int area = lado*ancho; 
        System.out.println(area);
    }
    private void Dibujar( String punto){
        for (int i = 0; i < lado; i ++){
            for (int y = 0; y < ancho; y++ ){
                System.out.print(punto);
            }
            System.out.println(" ");    
        }
         
    }       
        
}
