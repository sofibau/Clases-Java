package ClasesJava.Clase7;

public class Casa {
    int altura;
    int base;
    Piramide techo;
    Rectangulo paredes;

    public Casa (int altura, int base){
        this.altura = altura;
        this.base = base;
        this.techo = new Piramide((base/2)+1);
        this.paredes = new Rectangulo((base),altura);
    
    }

    public String [][] ConstruirCasa(String punto){
        String [][] arraytecho = techo.MergerPiramide(punto);
        String [][] arrayparedes = paredes.MergerRectangulo(punto);
        String [][] casa = new String [altura+(base/2)][base];
        for (int i = 0; i < (altura+(base/2)); i++){
            for (int j = 0; j < base; j++){
                if (i < (base/2)){
                    if (j == 0){ 
                    }else{
                        casa [i][j] = arraytecho[i][j];
                    }
                    
                }else{
                    casa [i][j] = arrayparedes[(i)-(base/2)][j];
                }
                
            }
        
        }
		return casa;

    }

    public String [][] ConstruirCasaExtra(String punto){
        String [][] arraytecho = techo.MergerPiramide(punto);
        String [][] arrayparedes = paredes.MergerRectanguloExtra(punto);
        String [][] casa = new String [altura+(base/2)][base];
        for (int i = 0; i < (altura+(base/2)); i++){
            for (int j = 0; j < base; j++){
                if (i < (base/2)){
                    if (j == 0){ 
                    }else{
                        casa [i][j] = arraytecho[i][j];
                    }
                    
                }else{
                    casa [i][j] = arrayparedes[(i)-(base/2)][j];
                }
                
            }
        
        }
		return casa;


    }





    
    }










