package ClaseJava.ClasesNum;

public class Casa {
    public static void main(String Args[]){ 
    }

    
    int ancho;
    int alto;
    String [][] piramideIz = new String [alto][ancho]; 
    String [][] piramideDer = new String [alto][ancho];
    
    
}


String [][] tablita = new String [alto][ancho]; //Recuerden, es(y,x)
//Defir el valor de la casilla (0,0)
tablita [0][0] = ":)";

// Combinar dos matrices
char [][] cubito = new char [3][3];
char [][] cubito2 = new char [3][3];

//Llenar c1 y c2
for (int i = 0; i < 3; i++){
    for (int j = 0; j< 3; j++){
        cubito[i][j] = '-';
    }
}

for (int i = 0; i < 3; i++){
    for (int j = 0; j< 3; j++){
        cubito2[i][j] = '+';
    }
}
System.out.println("Se llenó el cubito");

printArray(cubito);
printArray(cubito2);

//Merge de c1 y c2
char [][] cubito3 = new char [3][3+3]; 
/**
 * Como los juntamos horizontalmente, sumamos sus anchos para tener un ancho total
 */
for (int i = 0; i < 3; i++){
    for (int j = 0; j< 6; j++){
        if (j <3){ //La midad, el fin de mi c1
            cubito3[i][j] = cubito[i][j];
        }else{
            cubito3[i][j] = cubito2[i][j-3]; //J menos la mitad
        }
    }
    System.out.println("");
}
printArray(cubito3);
System.out.println("");