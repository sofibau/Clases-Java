public class notMain {
    public static void main(String[] args) {
        
        Usuario listaUsuariosInicial[] = {
            new Usuario(1234, "Bautista", "Sofía", 3),
            new Usuario(1232, "Pérez", "Jorge", 3),
            new Usuario(4283, "Arroyo", "Carlos", 1),
            new Usuario(2343, "Camacho", "Mariana", 1),
            new Usuario(3431, "Toro", "Ricardo", 1),
            new Usuario(4583, "Salazar", "Ricardo", 1),
            new Usuario(4563, "Díaz", "Gabriela"),
            new Usuario(4424,"Ramírez", "Olivera"),
            new Usuario(4424,"Velasco", "Jimena"),
            new Usuario(4424,"Barba", "Fernando")

            };
        Banco banco = new Banco ("BBVA", listaUsuariosInicial);
        banco.init();
        
        //Recuerda que las especificaicones están en el Classroom :)
        // Las cuentas tienen un ID (único)
        // El NIP es de 4 dígitos
        // Los usuarios tienen un Nombre y Apellido
        // El banco tiene un método show, donde te muestra su nombre, 
        // cuántos clientes tiene y toda la info de los mismos
        // ------------------------------------------------------------
        // Si hay un nuevo usuario, puede crear su cuenta
        // 3 intentos de ingresar contraseña
        // El usuario puede visualizar todas sus cuentas
        // Retiros y depósitos negativos
        // Las transferencias pueden ser entre cuentas de la misma y diferentes personas
        // Extra: Te da un recibo como .txt al final de cada transacción

    }
}