import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura de la piramide: ");
        double altura=scanner.nextDouble();
        System.out.println("Ingrese el apotema base de la piramide: ");
        double apotemaBase=scanner.nextDouble();
        System.out.println("Ingrese los numeros de lados de la piramide: ");
        double nlados=scanner.nextDouble();

        double areaLateral =  4*nlados * Math.pow(altura, 2) + Math.pow(apotemaBase, 2) / 2;
        double areaTotal = areaLateral + (apotemaBase * Math.pow(altura, 2) + Math.pow(apotemaBase, 2) / 2);
        double volumen = (apotemaBase * Math.pow(altura, 2) + Math.pow(apotemaBase, 2) / 2) * altura / 3;

        System.out.print("\nResultados: ");
        System.out.print("Área Latearl de la piramide: " + areaLateral);
        System.out.print("Area Total de la piramide: " + areaTotal);
        System.out.print("Volumen de la piramide: " + volumen);

        scanner.close();

    }
}
