import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca la altura de la pirámide:");
        double altura = scanner.nextDouble();

        System.out.println("Introduzca el apotema de la pirámide:");
        double apotema = scanner.nextDouble();

        System.out.println("Introduzca el número de lados de la base de la pirámide:");
        int numLados = scanner.nextInt();

        System.out.println("Introduzca la longitud de cada lado de la base de la pirámide:");
        double longitudLado = scanner.nextDouble();

        double areaLateral = numLados * longitudLado * apotema;
        double areaTotal = areaLateral + Math.PI * Math.pow(apotema, 2);
        double volumen = (1 / 3) * Math.PI * Math.pow(apotema, 2)  * altura;

        System.out.println("El área lateral de la pirámide es: " + areaLateral);
        System.out.println("El área total de la pirámide es: " + areaTotal);
        System.out.println("El volumen de la pirámide es: " + volumen);

    }
}
