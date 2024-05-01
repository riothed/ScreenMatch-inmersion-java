import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenidos a la inmersion en Java");
        // System.out.println("Película Matrix");
        // DEclaración de variables

        double mediaEvaluacionUsuario = 0;
        double notaMatrix=0;
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;


        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;

        System.out.println("Película: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película Popular en el momento");
        } else {
            System.out.println("Película Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            notaMatrix = teclado.nextDouble(); // el decimal se separa por comas
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la película " +
                "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }
}