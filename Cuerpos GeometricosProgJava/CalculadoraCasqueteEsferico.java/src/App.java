import java.util.Scanner;

public class CalculadoraCasqueteEsferico {

    public static void main(String[] args) throws Exception{

        // Declaramos los objetos Scanner y las variables radio, altura y radioBase
        Scanner sc = new Scanner(System.in);
        double radio, altura, radioBase;

        // Solicitamos al usuario los valores del radio y la altura
        System.out.println("Ingrese el valor del radio: ");
        radio = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();

        // Calculamos el radio de la base
        radioBase = Math.sqrt(Math.pow(radio, 2) - Math.pow(altura, 2));

        // Calculamos el área total
        double areaTotal = 2 * Math.PI * radioBase * altura + 4 * Math.PI * radioBase * radioBase;

        // Calculamos el área lateral
        double areaLateral = 2 * Math.PI * radioBase * Math.sqrt(Math.pow(altura, 2) + Math.pow(radioBase, 2));

        // Calculamos el volumen
        double volumen = (2 * Math.PI * radioBase * altura * radioBase) / 3;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El volumen es: " + volumen);
        sc.close();
    }
}