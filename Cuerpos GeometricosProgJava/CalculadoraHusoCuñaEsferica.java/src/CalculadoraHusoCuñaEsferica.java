import java.util.Scanner;

public class CalculadoraHusoCuñaEsferica {

    public static void main(String[] args) throws Exception {

        // Declaramos los objetos Scanner y las variables radio, ángulo y radioBase
        Scanner sc = new Scanner(System.in);
        double radio, ángulo, radioBase;

        // Solicitamos al usuario los valores del radio y el ángulo
        System.out.println("Ingrese el valor del radio: ");
        radio = sc.nextDouble();
        System.out.println("Ingrese el valor del ángulo: ");
        ángulo = sc.nextDouble();

        // Calculamos el radio de la base
        radioBase = Math.sqrt(Math.pow(radio, 2) - Math.pow(Math.sin(ángulo) * radio, 2));

        // Calculamos el área del huso esférico
        double areaHuso = 2 * Math.PI * radio * radio * ángulo / 360;

        // Calculamos el área de la cuña esférica
        double areaCuña = Math.PI * radioBase * radioBase * ángulo;

        // Imprimimos los resultados
        System.out.println("El área del huso esférico es: " + areaHuso);
        System.out.println("El área de la cuña esférica es: " + areaCuña);
        sc.close();
    }
}