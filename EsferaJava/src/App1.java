import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese el radio mayor de la Zona esferica: ");
        double rmayor = scanner.nextDouble();

        System.out.println("Ingrese el radio menor1 de la Zona esferica: ");
        double rmenor1 = scanner.nextDouble();

        System.out.println("Ingrese el radio menor2 de la Zona esferica: ");
        double rmenor2 = scanner.nextDouble();

        System.out.println("Ingrese la altura de la Zona esferica: ");
        double altura = scanner.nextDouble();

        System.out.print("\nResultados: ");
        double area = 2 * Math.PI * rmayor * altura;
        double volumen = Math.PI * altura * Math.pow(altura, 2) + 3 * Math.pow(rmenor1, 2) + 3 * Math.pow(rmenor2, 2) / 6;

        scanner.close();
    }
    
}
