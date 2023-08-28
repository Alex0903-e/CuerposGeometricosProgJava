import java.util.Scanner;

public class CalculadoraTetraedro {

    public static void main(String[] args) throws Exception {

        // Declaramos los objetos Scanner y la variable arista
        Scanner sc = new Scanner(System.in);
        double arista;

        // Solicitamos al usuario el valor de la arista
        System.out.println("Ingrese el valor de la arista: ");
        arista = sc.nextDouble();

        // Calculamos el área total
        double areaTotal = 6 * Math.sqrt(3) * arista * arista / 4;

        // Calculamos el volumen
        double volumen = (Math.sqrt(2) * arista * arista * arista) / 12;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
        sc.close();
    }
}