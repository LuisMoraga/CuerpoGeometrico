import java.util.Scanner;

public class Cilindro {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese el radio del cilindro: ");
        double radio=scanner.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        double altura=scanner.nextDouble();

        double areaLateral = 2 * Math.PI * radio * altura;
        double areaTotal = 2 * Math.PI * radio * (radio + altura);
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("\nResultados:");
        System.out.println("Área Lateral del Cilindro: " + areaLateral);
        System.out.println("Área Total del Cilindro: " + areaTotal);
        System.out.println("Volumen del Cilindro: " + volumen);

        scanner.close();
    }
}