import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la altura del Casqueto esferico: ");
        double altura=scanner.nextDouble();

        System.out.println("Ingrese el radio mayor del Casqueto esferico: ");
        double rmayor = scanner.nextDouble();

        double area = 2 * Math.PI * rmayor * altura;
        double volumen = Math.PI * Math.pow(altura, 2) * (3 * rmayor - altura) / 3;

        System.out.print("\nResultados: ");
        System.out.print("Area del Casqueto esferico: " + area);
        
        System.out.print("Volumen del Casqueto esferico: " + volumen);

        scanner.close();
    }
    
}
