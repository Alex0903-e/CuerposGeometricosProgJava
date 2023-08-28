import java.util.Scanner;

public class CalculadoraTroncoDeCono {

   
    public static void main(String[] args)throws Exception{

        // Declaramos los objetos Scanner y las variables
        Scanner sc = new Scanner(System.in);
        double radioMayor, radioMenor, altura;

        // Solicitamos al usuario los valores de las variables
        System.out.println("Ingrese el valor del radio mayor: ");
        radioMayor = sc.nextDouble();
        System.out.println("Ingrese el valor del radio menor: ");
        radioMenor = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();

        // Calculamos el área total
        double areaTotal = Math.pi * (radioMayor * radioMayor + radioMayor * radioMenor + radioMenor * radioMenor) + 2 * Math.pi * radioMayor * altura;

        // Calculamos el área lateral
        double areaLateral = Math.pi * (radioMayor + radioMenor) * Math.sqrt(radioMayor * radioMayor - radioMenor * radioMenor);

        // Calculamos el volumen
        double volumen = Math.pi * altura * (radioMayor * radioMayor - radioMenor * radioMenor) / 3;

        // Imprimimos los resultados
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El área lateral es: " + areaLateral);
        System.out.println("El volumen es: " + volumen);
        sc.close();
    }
}