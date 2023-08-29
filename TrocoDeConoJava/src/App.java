import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingrese la altura del tronco: ");
        double altura = scanner.nextDouble();

        System.out.println("Ingrese el radio menor del tronco: ");
        double rmenor = scanner.nextDouble();

        System.out.println("Ingrese radio mayor del tronco: ");
        double rmayor = scanner.nextDouble();

        System.out.println("Ingrese generatriz del tronco: ");
        double generatriz = scanner.nextDouble();

        double areaLateral = Math.PI * generatriz * (rmayor + rmenor);
        double areaTotal = areaLateral + rmayor +rmenor;
        double volumen = (1/3) * Math.PI * altura * (Math.pow(rmayor, 2) + Math.pow(rmenor, 2) + rmayor * rmenor);

        System.out.print("\nResultados: ");
        System.out.print("Área Lateral del Tronco de Cono: " + areaLateral);
        System.out.print("Area Total del Tronco de Cono: " + areaTotal);
        System.out.print("Volumen del Tronco de Cono: " + volumen);

        scanner.close();
    }
}