import java.util.Scanner;

import javax.swing.plaf.nimbus.NimbusProperty;

public class Usuario {
    private int Nip;
    private String nombre;
    private String apellido;
    public Cuenta cuenta [] = new Cuenta[3];


    public Usuario(int Nip, String apellido, String nombre){
        this.Nip = Nip;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuenta[0] = new Cuenta(nombre, apellido, 2000);
    }
    public Usuario(int Nip, String apellido, String nombre, double cantidadInicial){
        this.Nip = Nip;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cuenta[0] = new Cuenta(nombre, apellido, cantidadInicial);
        }
    public Usuario(int Nip, String apellido, String nombre, int numeroCuenta){
            this.Nip = Nip;
            this.apellido = apellido;
            this.nombre = nombre;
            for (int i = 0; i < numeroCuenta; i++){
                this.cuenta[i] = new Cuenta(nombre, apellido, 2000);
            }
            
        }
        
    
    public int getNip(){
        return Nip;
    }
      
    public String getApellido(){
        return apellido;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean verificarNIP(int nip){
        if (nip == Nip){
            return true;
        }else{
            return false;
        }
    }

    public void mostrarCuentas(){
        System.out.println("Estás son tus cuentas");
        if (checarCuentaAbierta(0) == true){
            cuenta[0].showCuenta();
        }else{
            System.out.println("No tienes saldo en tu cuenta");
        }
        if (checarCuentaAbierta(1) == true){
            cuenta[1].showCuenta();
        }else{
        }
        if (checarCuentaAbierta(2) == true){
            cuenta[2].showCuenta();
        }else{         
        }
        
    }
    public void abrirCuenta(){
        System.out.println("Cuántas cuentas quieres abrir, no puedes tener más de 3 ");
        Scanner num1 = new Scanner(System.in);
        int num = num1.nextInt();
        if (num < 4){
            for (int i = 1; i <= num; i++){
                if (checarCuentaAbierta(3-i) == false){
                    this.cuenta[3-i] = new Cuenta(nombre, apellido,2000 );
                    System.out.println("Ya abrimos tu cuenta ");
                    mostrarCuentas();
                }else{
                    System.out.println("No puedes tener más de 3 ");

                }

            }
        }           
    }

    public boolean checarCuentaAbierta(int num){
        if (cuenta[num] != null){
            return true;
        }
        return false;

    }
    //Método para saber cantidad dde cuentas abiertas
    

    // Puede tener máximo 3 cuentas 
    // Tiene un NIP secreto para poder realizar operaciones bancarias

}