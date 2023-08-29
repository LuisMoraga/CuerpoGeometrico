import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Ingresar la altura de cono: ");
        double hCono=scanner.nextDouble();

        System.out.println("Ingresar el radio del cono: ");
        double rCono=scanner.nextDouble();

        double generatriz = Math.pow(rCono, 2) + Math.pow(hCono, 2);
        
        double arealateral = Math.PI * rCono * generatriz;
        double areatotal = Math.PI * rCono * (rCono + generatriz);
        double volumen = (Math.PI * Math.pow(rCono, 2) * hCono) / 3;

        System.out.println("\nResultados: ");
        System.out.println("Área lateral del cono: " + arealateral);
        System.out.println("Área total del cono: " + areatotal);
        System.out.println("volumen del cono: " + volumen);

        scanner.close();
    }
}
