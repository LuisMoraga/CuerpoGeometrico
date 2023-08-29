import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();

        double areatotal = 4 * Math.PI * Math.pow(radio, 2);
        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);

        System.out.print("\nResultados: ");
        System.out.print("Área Total de la esfera: " + areatotal);
        System.out.print("Volumen de la esfera: " + volumen);

        scanner.close();
    }
}
