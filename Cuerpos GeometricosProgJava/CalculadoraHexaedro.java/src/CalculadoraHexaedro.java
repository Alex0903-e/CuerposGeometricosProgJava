import java.util.Scanner;

public class CalculadoraHexaedro {

    public static void main(String[] args) {

        // Declaramos los objetos Scanner y las variables arista y apotema
        Scanner sc = new Scanner(System.in);
        double arista, apotema;

        // Solicitamos al usuario el valor de la arista
        System.out.println("Ingrese el valor de la arista: ");
        arista = sc.nextDouble();

        // Calculamos el apotema
        apotema = Math.sqrt(3) * arista / 2;

        // Calculamos el área total
        double areaTotal = 6 * arista * arista * Math.sqrt(3);

        // Calculamos el área lateral
        double areaLateral = 4 * arista * apotema;

        // Calculamos el volumen
        double volumen = (arista * arista * apotema) / 2;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El volumen es: " + volumen);
        System.out.println("El apotema es: " + apotema);
        sc.close();
    }
}