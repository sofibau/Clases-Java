package ClasesJava.Clase7;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Rectangulo rectanguloP = new Rectangulo(3,4);
        Triangulo triangulo = new Triangulo(4);
        Piramide piramide = new Piramide(4);
        Casa casa = new Casa(8,8);

        printArray(rectanguloP.MergerRectanguloExtra("*"));
        //printArray(casa.ConstruirCasa("*"));
        //printArray(casa.ConstruirCasaExtra("*"));
        //printArray(piramide.MergerPiramide("*"));
        //printArray(MergerRectanguloExtras("*", 4, 6));
        
        
        
}
public static void printArray (String [][] array){
        
    for (int i = 0; i < array.length; i++){
        for (int j = 0; j< array[i].length; j++){
            if (array[i][j] == null){
                System.out.print(" ");
            }else{
                System.out.print(array[i][j] + " ");  
            }
        }
        System.out.println("");
    }


}







}