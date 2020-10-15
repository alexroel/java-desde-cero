
public class Funciones {
    public static void main(String[] args) {
        
        //System.out.println(sumar(75, 80));
        //cuetaRegresiva(10);
        
        //System.out.println(factorial(5));
        
        System.out.println(sumar("Alex Role",4,8,9,6,78,56));
        System.out.println(sumar(4.3,5.6,8.5));
        
    }
    
    static int sumar(String nombre, int... numeros){
        System.out.println("La suma de "+ nombre);
        int suma = 0;
        for(int num : numeros){
            suma += num;
        }
        return suma;
    }
        
    static double sumar(double... numeros){
        double suma = 0;
        for(double num : numeros){
            suma += num;
        }
        return suma;
    }
    
    static int factorial(int numero){
        if(numero > 1){
            numero = numero * factorial(numero - 1);
        }
        
        return numero;
    }
    
    static void cuetaRegresiva(int numero){
        numero --;
        
        if(numero > 0){
            System.out.println(numero);
            cuetaRegresiva(numero);
        }else{
            System.out.println("Llego hasta 0");
        }
    }
    
    
}
