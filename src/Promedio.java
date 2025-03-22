import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
    //1. Recibe **3 notas por estudiante**.
    //2. Calcula el promedio.
    //3. Si el promedio es **mayor o igual a 3.0**, el estudiante aprueba.
    //4. Se evalúan exactamente **4 estudiantes**.
    //5. Al final, se imprime cuántos aprobaron.
        Scanner scanner = new Scanner(System.in);
        int totalEstudiantes = 4;
        int notasTotales = 3;
        double notaDeAprobacion = 3;
        
        int aprobados = 0;

        for (int i = 1; i <= totalEstudiantes; i++) {
            double sumatoriaNotas = 0;

            System.out.println("Ingrese las " + notasTotales + " notas del estudiante " + i + ":");
            for (int k = 1; k <= notasTotales; k++) {
                System.out.print("Nota " + k + ": ");
                double nota = scanner.nextDouble();
                sumatoriaNotas= nota;
            }

            double promedio = sumatoriaNotas / notasTotales;
            System.out.println("Promedio del estudiante " + i + ": " + promedio);

            if (promedio >= notaDeAprobacion) {
                System.out.println("El estudiante " + i + "  aprobado");
                aprobados++;
            } else {
               
            }
        }

        System.out.println("Total de estudiantes aprobados: " + aprobados);
    }
}
    

