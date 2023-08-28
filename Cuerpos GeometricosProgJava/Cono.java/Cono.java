import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        // Declaramos las variables
        double radio, altura, areaLateral, areaTotal, volumen;

        // Obtenemos los datos del usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del cono: ");
        radio = entrada.nextDouble();
        System.out.println("Ingrese la altura del cono: ");
        altura = entrada.nextDouble();

        // Calculamos el área lateral
        areaLateral = Math.PI * radio * Math.sqrt(radio * radio + altura * altura);

        // Calculamos el área total
        areaTotal = Math.PI * radio * (radio + Math.sqrt(radio * radio + altura * altura));

        // Calculamos el volumen
        volumen = (Math.PI * radio * radio * altura) / 3;

        // Mostramos los resultados
        System.out.println("El área lateral del cono es: " + areaLateral);
        System.out.println("El área total del cono es: " + areaTotal);
        System.out.println("El volumen del cono es: " + volumen);
        entrada.close();
    }
}