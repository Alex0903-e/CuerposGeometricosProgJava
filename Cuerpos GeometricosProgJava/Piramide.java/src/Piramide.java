import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) throws Exception {
        // Declaramos las variables
        int ladoBase;
        double apotema, areaLateral, areaTotal, volumen;

        // Obtenemos los datos del usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado de la base de la pirámide: ");
        ladoBase = entrada.nextInt();

        // Calculamos el apotema
        apotema = Math.sqrt(3) * ladoBase / 2;

        // Calculamos las areas
        areaLateral = (ladoBase * apotema) / 2;
        areaTotal = areaLateral + (ladoBase * ladoBase);
        volumen = ((ladoBase * ladoBase * apotema) / 3);

        // Mostramos los resultados
        System.out.println("El área lateral de la pirámide es: " + areaLateral);
        System.out.println("El área total de la pirámide es: " + areaTotal);
        System.out.println("El volumen de la pirámide es: " + volumen);
        System.out.println("El apotema de la pirámide es: " + apotema);
        entrada.close();
    }
}