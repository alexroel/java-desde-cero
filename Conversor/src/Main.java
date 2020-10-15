
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        EXTERNA:
        while(true){
            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Soles Peruanos a dolares\n"
                    + "2 - Pesos Mexicanos a dolares \n"
                    + "3 - Pesos Colombianos a dolares\n"
                    + "4 - Salir");
            System.out.print("INGRESE UNA OPCIÓN: ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            switch(opcion){
                case '1':
                    convertir(3.58, "Soles Peruanos");
                    break;
                case '2':
                    convertir(22.15, "Pesos Mexicanos");
                    break;
                case '3':
                    convertir(3851.90, "Pesos Colombianos");
                    break;
                case '4':
                    System.out.println("CERRANDO PROGRAMA");
                    break EXTERNA;
                default:
                    System.out.println("OPCIÓN INCORRECTA");
                    break;
            }
        }
    }
    
    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantida de %s :", pais);
        double cantidadMoneda = leer.nextDouble();
        
        double dolares = cantidadMoneda / valorDolar;
        
        dolares = (double) Math.round(dolares * 100d)/100;
        
        System.out.println("----------------------------------");
        System.out.println("|    Tines $"+dolares+" Dolares   |");
        System.out.println("----------------------------------");
    }
}
