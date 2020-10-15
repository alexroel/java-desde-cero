
public class ClaseMath {
    public static void main(String[] args) {
        System.err.println(Math.PI);
        System.out.println(Math.E);
        
        System.out.println(Math.pow(3, 3));
        
        System.out.println(Math.random());
        
        int numeroRandom = (int)(Math.random()*101);
        System.out.println(numeroRandom);
        
        System.out.println((int)(Math.sqrt(64)));
        
        System.out.println(Math.max(7, 9));
        System.out.println(Math.min(7, 9));
        
        System.out.println(Math.round(5.8471));
        
        double moneda = (double)Math.round(3.4289 * 100d)/100;
        System.out.println(moneda);
    }
}
