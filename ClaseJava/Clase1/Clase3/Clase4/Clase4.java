package ClaseJava.Clase1.Clase3.Clase4;



public class Clase4 {
    public static void main(String Args[]){      
        decirFecha(3, 02, 07);   
        decirFechaSiguiente(02, 04, 2000);

}

	
static String dia ;
static String mes;
static String año;
public Clase4 (String dia, String mes, String año){
    this.dia = dia;
    this.mes = mes;
    this.año = año;
}
private static void decirFechaConCeros(int dia, int mes, int año) {
    System.out.println("0" + dia +  "/" + "0"+ mes + "/" + año);
    System.out.println("0" + mes + "/" + "0"+ dia+ "/"  + año);
    }
 private static void decirFechaConCeroD(int dia, int mes, int año) {
    System.out.println("0" + dia +  "/" +  mes + "/" + año);
    System.out.println(mes + "/" + "0" + dia+ "/"  + año);
    }
private static void decirFechaConCeroM(int dia, int mes, int año) {
    System.out.println(dia +  "/" +  "0" + mes + "/" + año);
    System.out.println("0" + mes + "/" + dia+ "/"  + año);
    }
private static void decirFechaSinCero(int dia, int mes, int año) {
    System.out.println(dia +  "/" +  mes + "/" + año);
    System.out.println("0" + mes + "/" + "0"+ dia+ "/"  + año);
    }
//Decir fecha 
public static void decirFecha(int dia, int mes, int año){
    int longitudMes = (int)(Math.log10(mes)+1);
    int longitudDia = (int)(Math.log10(dia)+1);
    if (longitudMes == 1 && longitudDia == 1){
        decirFechaConCeros(dia, mes, año);
    }else if (longitudMes == 2 && longitudDia == 1){
        decirFechaConCeroD(dia, mes, año);
    }else if (longitudMes == 1 && longitudDia == 2){
        decirFechaConCeroM(dia, mes, año);
    }else if (longitudMes == 2 && longitudDia == 2){
        decirFechaSinCero(dia, mes, año);
    }
}
private static boolean indexOf(int[] mesesCon30dias, int mes2) {
	return true;
}

private static void decirFechaSiguiente (int dia, int mes, int año){
    int mesesCon30dias [] = {4,6,9,11};

    if (mes == 02 && dia == 28) {
        System.out.println("El siguiente día es: " );
        mes = (mes +1);
        dia = 1;
        decirFecha(dia, mes, año);

    }else if (indexOf(mesesCon30dias, mes) == true && dia == 30){
    System.out.println("El siguiente día es: " );
    mes = (mes + 1);
    dia = 1;
    decirFecha(dia, mes, año);
    }else if( indexOf(mesesCon30dias, mes) == false && dia == 31){
    mes = (mes +1);
    dia = 31;
    System.out.println("El siguiente día es: ");
    decirFecha(dia, mes, año);
    }else {
    System.out.println("El siguiente día es: ");
    mes = (mes +1);
    dia = (dia+1);
    decirFecha(dia, mes, año);

}


}
}


