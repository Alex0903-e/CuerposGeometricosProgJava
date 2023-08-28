import java.util.Scanner;

public class Cilindro {

    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
    
        double radio, altura, areaLateral, areaTotal, volumen;

     
            System.out.print("Ingrese el radio del cilindro: ");
            radio = entrada.nextDouble();
            System.out.print("Ingrese la altura del cilindro: ");
            altura = entrada.nextDouble();
    
        
        areaLateral = 2 * Math.PI * radio * altura;
        areaTotal = 2 * Math.PI * radio * radio + 2 * areaLateral;
        volumen = Math.PI * radio * radio * altura;

    
       System.out.println("El Area Total es: " + areaTotal + "cm3");
       System.out.println("El Area Lateral es: " + areaLateral + "cm3");
       System.out.println("El Volumen es: " + volumen);
       entrada.close();
    }
}