
import java.util.Scanner;
public class Sumar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese número 01: ");
        var n1 = leer.nextInt();
        System.out.print("Ingrese número 02: ");
        var n2 = leer.nextInt();
        
        var r = n1 + n2;
        
        System.out.printf("La Suma %d + %d = %d\n", n1, n2,r);
    }
}
