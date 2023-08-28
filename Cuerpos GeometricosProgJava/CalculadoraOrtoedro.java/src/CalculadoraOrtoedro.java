import java.util.Scanner;

public class CalculadoraOrtoedro {

    public static void main(String[] args)throws Exception {

        // Declaramos los objetos Scanner y las variables base, altura y profundidad
        Scanner sc = new Scanner(System.in);
        double base, altura, profundidad;

        // Solicitamos al usuario los valores de la base, la altura y la profundidad
        System.out.println("Ingrese el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();
        System.out.println("Ingrese el valor de la profundidad: ");
        profundidad = sc.nextDouble();

        // Calculamos el área total
        double areaTotal = 2 * base * altura + 2 * base * profundidad + 2 * altura * profundidad;

        // Calculamos el área lateral
        double areaLateral = 2 * base * altura;

        // Calculamos el volumen
        double volumen = base * altura * profundidad;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El volumen es: " + volumen);
        sc.close();
    }
}