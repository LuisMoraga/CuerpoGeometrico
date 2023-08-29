import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese la altura del prisma: ");
        double altura =scanner.nextDouble();
        
        System.out.println("ingrese el número de lados del prisma: ");
        double nlados =scanner.nextDouble();

        System.out.println("Ingrese la medida del lado del prisma: ");
        double lado =scanner.nextDouble();

        System.out.println("Ingrese el apotema del prisma: ");
        double ap =scanner.nextDouble();

        double areaLateral = nlados * lado * altura;
        double areaTotal = areaLateral + 2 * (nlados * lado * ap / 2);
        double volumen = (nlados * lado * ap / 2) * altura;

        System.out.println("\nResultados: ");
        System.out.println("Área Lateral del Prisma: " + areaLateral);
        System.out.println("Área Total del Prisma: " + areaTotal);
        System.out.println("Volumen del Prisma: " + volumen);

        scanner.close();

    }
}
