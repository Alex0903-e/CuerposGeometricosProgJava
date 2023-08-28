import java.util.Scanner;

public class CalculadoraDodecaedro {

    public static void main(String[] args) throws Exception {

        // Declaramos los objetos 
        Scanner sc = new Scanner(System.in);
        double arista, apotema;

        // Solicitamos al usuario el valor de la arista
        System.out.println("Ingrese el valor de la arista: ");
        arista = sc.nextDouble();

        // Calculamos el apotema
        apotema = (2 * Math.sqrt(3)) / (Math.sqrt(5) + 1) * arista;

        // Calculamos el área total
        double areaTotal = 3 * arista * arista * (5 * Math.sqrt(5) - 1);

        // Calculamos el área lateral
        double areaLateral = 12 * arista * apotema;

        // Calculamos el volumen
        double volumen = (5 * Math.sqrt(5) - 1) / 2 * arista * arista * arista;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El volumen es: " + volumen);
        System.out.println("El apotema es: " + apotema);
        sc.close();
    }
}