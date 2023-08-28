import java.util.Scanner;

        public class Esfera {
            public static void main(String[] args) throws Exception{
                Scanner entrada = new Scanner(System.in);
                // Declaramos las variables
                double radio, areaSuperficie, volumen;
        
                // Obtenemos los datos del usuario
            
                System.out.println("Ingrese el radio de la esfera: ");
                radio = entrada.nextDouble();
        
                // Calculamos el área de la superficie
                areaSuperficie = 4 * Math.PI * Math.pow(radio, 2);
        
                // Calculamos el volumen
                volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
        
                // Mostramos los resultados
                System.out.println("El área de la superficie de la esfera es: " + areaSuperficie);
                System.out.println("El volumen de la esfera es: " + volumen);
                entrada.close();
            }
}
