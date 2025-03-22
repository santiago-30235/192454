import java.util.Scanner;

public class MuyMalHecho {

     final int EDAD_ADULTO = 18;
     final int EDAD_MAXIMA_VALIDA = 120;
     final int EDAD_MINIMA_VALIDA = 1;
     final int USUARIOS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CONTADOR = 0;

        System.out.println("Número de usuarios a ingresar:");
        int totalUsuarios = scanner.nextInt();
      

        
        int edadUsuario1 = 0, edadUsuario2 = 0, edadUsuario3 = 0;
        String nombreUsuario1 = "", nombreUsuario2 = "", nombreUsuario3 = "";

        while (CONTADOR < totalUsuarios) {
            System.out.println("Nombre del usuario:");
            String nombre = scanner.nextLine();

            System.out.println("Edad del usuario:");
            int edad = scanner.nextInt();
           

            
            if (CONTADOR == 0) {
                nombreUsuario1 = nombre;
                edadUsuario1 = edad;
            } else if (CONTADOR == 1) {
                nombreUsuario2 = nombre;
                edadUsuario2 = edad;
            } else if (CONTADOR == 2) {
                nombreUsuario3 = nombre;
                edadUsuario3 = edad;
            }

            
            if ((edad >= EDAD_ADULTO)) {
                System.out.println(nombre + " es mayor de edad");
            } else {
                System.out.println(nombre + " es menor de edad");
            }

           
            if ((edad > EDAD_MAXIMA_VALIDA) & (edad < EDAD_MINIMA_VALIDA)) {
                System.out.println("Edad no válida");
            }

            CONTADOR++;
        }
      
        System.out.println("Usuario 1: " + nombreUsuario1 + " - Edad: " + edadUsuario1);
        System.out.println("Usuario 2: " + nombreUsuario2 + " - Edad: " + edadUsuario2);
        System.out.println("Usuario 3: " + nombreUsuario3 + " - Edad: " + edadUsuario3);
    }
}
