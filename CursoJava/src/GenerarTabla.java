
import java.util.Scanner;


public class GenerarTabla {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = leer.nextInt();
        
        int c = 0;
        while(c <= 10){
            System.out.printf(" %d x %d = %d \n",n,c,(n*c));
            c++;
        }
    }
}
