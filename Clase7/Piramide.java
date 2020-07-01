package ClasesJava.Clase7;

public class Piramide {
    private int altura;
    private Triangulo trianguloGrande;
    private Triangulo TrianguloChiquito;

    public Piramide(int altura){
        this.altura = altura;
        this.trianguloGrande = new Triangulo(altura);
        this.TrianguloChiquito = new Triangulo(altura-1);
          
    }

    
    public String [][] MergerPiramide(String punto){
        String [][] trianguloDer = trianguloGrande.TrianguloDerArr(punto);
        String [][] trianguloIzq = TrianguloChiquito.TrianguloIzArr(punto);
        String [][] piramide = new String [altura][altura*2];
        for (int i = 0; i< altura; i++){
            for (int j = 0; j < altura*2; j++){
                if (j < altura){
                    piramide[i][j] = trianguloDer[i][j];
                }else{
                    if (i == 0 || j == ((altura*2)-1)){    
                    }else{
                        piramide[i][j] = trianguloIzq[i-1][j-altura];
                    }   
                }
            }
        }
        return piramide;

    }
}