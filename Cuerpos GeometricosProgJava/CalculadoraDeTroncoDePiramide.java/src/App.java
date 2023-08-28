import java.util.Scanner;

public class CalculadoraTroncoDePiramide {

    public static void main(String[] args)throws Exception {

        // Declaramos los objetos Scanner y las variables
        Scanner sc = new Scanner(System.in);
        double aristaMayor, aristaMenor, altura;

        // Solicitamos al usuario los valores de las variables
        System.out.println("Ingrese el valor de la arista mayor: ");
        aristaMayor = sc.nextDouble();
        System.out.println("Ingrese el valor de la arista menor: ");
        aristaMenor = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();

        // Calculamos el área total
        double areaTotal = (Math.sqrt(3) / 4) * (aristaMayor * aristaMayor + aristaMenor * aristaMenor + aristaMayor * aristaMenor) * altura;

        // Calculamos el área lateral
        double areaLateral = Math.sqrt(3) * aristaMayor * altura;

        // Calculamos el volumen
        double volumen = (1 / 3) * altura * (aristaMayor * aristaMayor + aristaMenor * aristaMenor + aristaMayor * aristaMenor) / 4;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El volumen es: " + volumen);
        sc.close();
    }
}