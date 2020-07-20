
import java.util.Scanner;

public class Cuenta {
    public String ID;
    public double saldo;
    static int numCuentas;
    //Maneja las transacciones (Depósitos, retiros y transferencias) 
    //(El usuario puede meter valores con Scanner)
    public Cuenta(String nombre, String apellido, double saldo){
        this.ID = ((Integer.toString(numCuentas)) + nombre.charAt(0) + apellido.charAt(0));
        this.saldo = saldo;
        numCuentas++;
    
    }
//Depostio, retiro y tranferencia

    public void depositar(double cantidadT){
        saldo = cantidadT + saldo;
    }

    public void depositar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta la cantidad a depositar ");
        double cantidad = teclado.nextDouble();
        depositar(cantidad);
        System.out.println("Tu nuevo saldo es:  " + saldo);

    }
    public void retirar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta la cantidad a retirar ");
        double cantidadRetirar = teclado.nextDouble();
        if (saldo > Math.abs(cantidadRetirar)){
            saldo = saldo-Math.abs(cantidadRetirar);
            System.out.println("Tu nuevo saldo es:  " + saldo);
        }else{
            System.out.println("No nos engañes, no tienes esa cantidad"); 
        }
    }
    public void retirar(double cantidadRetirar){
        if (saldo > Math.abs(cantidadRetirar)){
            saldo = saldo-Math.abs(cantidadRetirar);
            System.out.println("Tu nuevo saldo es: " + saldo);
        }else{
            System.out.println("No nos engañes, no tienes esa cantidad");     
    }
    }

    public void transferir(Usuario cuentadestinatoria){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta la cantidad a transferir ");
        double cantidadTransferir = teclado.nextDouble();
        retirar(cantidadTransferir);
        cuentadestinatoria.cuenta[0].depositar(cantidadTransferir);
        
    }

    public int getID(){
        return ID;
    }

    public void showCuenta(){
        System.out.println("Tu cuenta número " + ID + "es " + saldo);
    }

    
}