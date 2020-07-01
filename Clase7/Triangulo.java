package ClasesJava.Clase7;

public class Triangulo {
    int altura;

    Triangulo( int altura){
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

    public String [][] TrianguloIzArr(String punto){
        String [][] trianguloIzq = new String [altura][altura];
        for (int i = 0; i < altura; i ++){
            for (int j = 0; j < i+1; j++){
                trianguloIzq[i][j] = punto ;    
            }
        } 
        
        return trianguloIzq;
    }

    public String [][] TrianguloDerArr(String punto){
        String [][] trianguloDer = new String [altura][altura];
        for (int i = 0; i < altura; i ++){
            for (int j = 0; j < altura-(i+1); j++){
                trianguloDer[i][j] = " ";;      
            }   
            for (int w = altura-1; w > altura - (i+2); w--){
                trianguloDer[i][w] = punto; 
            }
        }   
        return trianguloDer;
        
    }
  


}
