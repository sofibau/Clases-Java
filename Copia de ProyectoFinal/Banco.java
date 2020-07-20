import java.util.Scanner;
import java.util.Arrays;
// proyecto copia
public class Banco {

    String nombreDeBanco;
    public Usuario listaUsuarios [] = new Usuario[20];
    int i;
    int w;

    public Banco(String nombreDeBanco, Usuario listaUsuarios []){
        this.listaUsuarios = Arrays.copyOf(listaUsuarios, 20);
        this.nombreDeBanco = nombreDeBanco;
    }

    public void init(){
        while (true){
            show();
            inscribirAlSistema();
    }
    }

    public boolean contarIntentos(Usuario usuario){
        w = 0;
        while(w<3){
            if (w<3){
                Scanner nip1 = new Scanner(System.in);
                System.out.println("Escribe tu nip ");
                int nip = nip1.nextInt();
                if (usuario.verificarNIP(nip)== true){
                    return true;}
            }else{
                System.out.println("Ya pasaron tus tres intentos");
                return false;
            }
            w++;
        }
        return false;
    }


    public int contarEspaciosArray(){
        int contador = 0;
        for (int i = 0; i < 20; i++){
            if(listaUsuarios[i]!=null)
            contador++;
        }
        return contador;
    
    }
    

    public boolean inscribirAlSistema(){
        System.out.println("Si tiene un usuario escriba su nombre y apellido ");
        Scanner nombre = new Scanner(System.in);
        String nombreApellido = nombre.nextLine();
        String [] partes = nombreApellido.split(" ");
        String parte1 = partes[0];
        String parte2 = partes[1];
        for (Usuario usuario : listaUsuarios){
            if (parte1.equals(usuario.getNombre()) && parte2.equals(usuario.getApellido()) ){
                if (contarIntentos(usuario) == true){
                    System.out.println("Hola " + usuario.getNombre());
                    usuario.mostrarCuentas();
                    mover(usuario);
                    return false;
                }
                
            }else{
                System.out.println("No estás registrado");
                registrarse();
                return false;
                
            }
        }
        return false;
            
        }
        
    public void registrarse(){
        Scanner pregunta = new Scanner(System.in);
        System.out.println("¿Quieres crear un usuario? ");
        String pregunta1 = pregunta.nextLine();
        if (pregunta1.equalsIgnoreCase("Sí") || pregunta1.equalsIgnoreCase("si")||  pregunta1.equalsIgnoreCase("sí") || pregunta1.equalsIgnoreCase("Si")){
            Scanner nombre1 = new Scanner(System.in);
            System.out.println("Escribe tu nombre ");
            String nombre = nombre1.next();
            Scanner apellido1 = new Scanner(System.in);
            System.out.println("Escribe tu apellido ");
            String apellido = apellido1.next();
            Scanner nip1 = new Scanner(System.in);
            System.out.println("Escribe tu nip ");
            int nip = nip1.nextInt();
            agregarUsuarios(nip, apellido, nombre);
        }else{
            System.out.println("Gracias por confiar en nosotros");
        
        }
    }
    public boolean agregarUsuarios(int nip, String apellido, String nombre){ 
        if (listaUsuarios[19] != null){
            System.out.println("Ya no hay espacio para más personas, solicitar al programador ");
        }else{
            Usuario nuevoUsuario = new Usuario(nip, apellido, nombre);
            int cuentaEspacios = contarEspaciosArray();
            nuevoUsuario =  listaUsuarios[(cuentaEspacios + 1)];
            System.out.println("Ya estás registrado ");
        }
        return true;

    }
    public boolean encontrarUsuario(Usuario usuarioReal){
        System.out.println("Escriba su nombre y apellido de la persona la que quiere transferir ");
        Scanner nombre = new Scanner(System.in);
        String nombreApellido = nombre.nextLine();
        String [] partes = nombreApellido.split(" ");
        String parte1 = partes[0];
        String parte2 = partes[1];
        for (Usuario usuario : listaUsuarios){
            if(parte1.equals(usuario.getNombre()) && parte2.equals(usuario.getApellido())){
                usuarioReal.cuenta[0].transferir(usuario);
                System.out.println("Transferencia hecha "); 
                return true;
        }
            }
            return false;
        }

    
    public void mover(Usuario usuario){
        while (true){
            Scanner teclado1 = new Scanner(System.in);
            System.out.println("Si quiere transferir, escriba T; si quiere depositar, escriba D; si quiere retirar, escriba R; si quieres ver tu cuenta escribe C; si ya terminó; escribe A si quiere abrir una cuenta; escriba FIN");
            String teclado = teclado1.next();
            if (teclado.equalsIgnoreCase("D")){
                usuario.cuenta[0].depositar();
            }else if (teclado.equalsIgnoreCase("R")){
                usuario.cuenta[0].retirar();
            }else if(teclado.equalsIgnoreCase("T")){
                if (encontrarUsuario(usuario) == false){
                    System.out.println("El nombre no está registrado ");
                }
            }else if(teclado.equalsIgnoreCase("A")){
                usuario.mostrarCuentas();
                usuario.abrirCuenta();

            }else{
                System.out.println("Gracias por confiar en nosotros ");
                usuario.mostrarCuentas();
                break;
            } 
        }   
    
    }
        
   
    public void show(){
        System.out.println("Bienvenido al banco " + nombreDeBanco);
        System.out.println( "Tenemos " + contarEspaciosArray()  + " clientes");    
        }
    }
        
    


    
    // Compuesta de 10 personas (2 deben tener 3 cuentas, 4 deben tener una cuenta y los demás deben estar vacías)
    // Si se intenta acceder a la cuenta de alguien y falla 3 veces, el programa debe parar


