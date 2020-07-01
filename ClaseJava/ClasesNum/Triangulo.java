

public class Triangulo {
    public static void main(String Args[]){
        Triangulo triangulo = new Triangulo(4);
        
        triangulo.DibujarDerecha("*");
        triangulo.DibujarIzquierda("*");
    }
    int altura;
    private Triangulo( int altura){

        this.altura = altura;
    }
    private void DibujarIzquierda(String punto){
        for (int i = 0; i < altura; i ++){
            for (int j = 0; j < i+1; j++){
                System.out.print(punto);    
            }
            System.out.println(" ");
        } 
    }
    
private void DibujarDerecha(String punto){
    for (int i = -1; i < altura; i ++){
        for (int j = i; j < altura-1; j++){
            System.out.print(" ");      
    }   
        for (int w = 0; w < i+1; w++){
            System.out.print(punto); 
        }
    System.out.println(" ");
    
    }
}
}

    
    

