
import java.util.Scanner;

public class Espar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un Número: ");
        int n = leer.nextInt();
        
        if(n != 0){
            if(n > 0){
                if(n % 2 == 0){
                    System.out.printf("El número %d es PAR POSITIVO\n", n);
                }else{
                    System.out.printf("El número %d es IMPAR POSITIVO\n", n);
                }
            }else{
                if(n % 2 == 0){
                    System.out.printf("El número %d es PAR NEGATIVO\n", n);
                }else{
                    System.out.printf("El número %d es IMPAR NEGATIVO\n", n);
                }
            }
        }else{
            System.out.printf("El número %d es NEUTRO\n", n);
        }
    }
        
}
